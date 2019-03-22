package com.example.aulaframelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login (View view){
        FrameLayout fl = findViewById(R.id.fl2);
        fl.setVisibility(View.VISIBLE);
    }

}
