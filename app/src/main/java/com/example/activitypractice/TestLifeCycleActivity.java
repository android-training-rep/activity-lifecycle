package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TestLifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_life_cycle);
    }
}