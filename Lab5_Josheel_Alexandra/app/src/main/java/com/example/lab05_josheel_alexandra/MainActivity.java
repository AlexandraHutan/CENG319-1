package com.example.lab05_josheel_alexandra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lab05_josheel_alexandra.fragments.FirstFragment;
import com.example.lab05_josheel_alexandra.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity{
    private FirstFragment firstFrag;
    private SecondFragment secondFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}