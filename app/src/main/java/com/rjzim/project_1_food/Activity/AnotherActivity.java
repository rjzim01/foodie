package com.rjzim.project_1_food.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.rjzim.project_1_food.R;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        //System.out.println("hello");

        TextView textView = findViewById(R.id.textView12);

        textView.setText("hello");
    }
}