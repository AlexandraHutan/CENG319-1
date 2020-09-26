package com.example.josheeldhanda_ceng319lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private displayMsg fragment;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.fragment = (displayMsg)getSupportFragmentManager().findFragmentById(R.id.dispfrag);
        this.message = getString(R.string.main) + "\n" + getString(R.string.create)+ "\n";;

        fragment.display(message);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.message += "onStart executed\n" ;
        this.fragment.display(message);
        message=null;
    }


}