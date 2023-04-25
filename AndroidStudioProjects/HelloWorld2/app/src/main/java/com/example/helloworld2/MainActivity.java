package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("fail","it's not working");
    }

    public void disable(View v){
        View myView = findViewById(R.id.button);
        myView.setEnabled(false);
        Button b=(Button)myView;
        b.setText("New Disabled");
       /* v.(false);
        Button b =(Button) v;
        b.setText("Disabled");*/


    }

}