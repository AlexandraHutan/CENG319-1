package com.example.josheeldhanda_ceng319lab1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link conceptList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class conceptList extends Fragment implements AdapterView.OnItemClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public conceptList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment conceptList.
     */
    // TODO: Rename and change types and number of parameters
    public static conceptList newInstance(String param1, String param2) {
        conceptList fragment = new conceptList();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getContext(),"List CreateView", Toast.LENGTH_SHORT).show();
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_concept_list, container, false);

        String[] concepts = {getString(R.string.aititle),getString(R.string.vrtitle)};
        ListView lv = (ListView)v.findViewById(R.id.list);
        TextView tv = (TextView) v.findViewById(R.id.tvTitle);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, concepts);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
        tv.setText(R.string.life);
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(),"List onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            Intent intent = new Intent(getActivity(), AIActivity.class);
            startActivity(intent);
        }
        if (position == 1) {
            Intent intent = new Intent(getActivity(), VRActivity.class);
            startActivity(intent);
        }
    }
}