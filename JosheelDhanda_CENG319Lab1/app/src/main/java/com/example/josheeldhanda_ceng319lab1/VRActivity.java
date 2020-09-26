package com.example.josheeldhanda_ceng319lab1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class VRActivity extends AppCompatActivity {

    String message;
    TextView tvDisplay;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);
        tvDisplay = (TextView) findViewById(R.id.displaytextVR);
        message=getString(R.string.vrtitle) + "\n" + getString(R.string.create)+ "\n";
        tvDisplay.setText(message);
    }

        @Override
        protected void onStart() {
            super.onStart();
            tvDisplay = (TextView) findViewById(R.id.displaytextVR);
            message+=getString(R.string.start)+ "\n";
            tvDisplay.setText(message);
        }

        @Override
        protected void onStop() {
            super.onStop();
            tvDisplay = (TextView) findViewById(R.id.displaytextVR);
            message+=getString(R.string.stop)+ "\n";
            tvDisplay.setText(message);
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            tvDisplay = (TextView) findViewById(R.id.displaytextVR);
            message+=getString(R.string.start)+ "\n";
            tvDisplay.setText(message);
        }
}