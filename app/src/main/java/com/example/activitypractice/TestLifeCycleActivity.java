package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TestLifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_life_cycle);
        System.out.println("------TestLifeCycleActivity------onCreate()------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("------TestLifeCycleActivity------onStart()------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("------TestLifeCycleActivity------onRestart()------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("------TestLifeCycleActivity------onResume()------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("------TestLifeCycleActivity------onPause()------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("------TestLifeCycleActivity------onStop()------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("------TestLifeCycleActivity------onDestroy()------");
    }
}