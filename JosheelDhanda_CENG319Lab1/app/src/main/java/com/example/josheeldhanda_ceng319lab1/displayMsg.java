package com.example.josheeldhanda_ceng319lab1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link displayMsg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class displayMsg extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public displayMsg() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment displayMsg.
     */
    // TODO: Rename and change types and number of parameters
    public static displayMsg newInstance(String param1, String param2) {
        displayMsg fragment = new displayMsg();
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
        Toast.makeText(getContext(),"Display onCreateView", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_display_msg, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(),"Display onStart", Toast.LENGTH_SHORT).show();
    }

    public void display(String message){
        TextView tvDisplay = (TextView)getActivity().findViewById(R.id.displaytext);
        tvDisplay.setText(message);
    }



}