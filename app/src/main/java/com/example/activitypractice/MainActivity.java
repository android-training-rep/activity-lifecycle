package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button jumpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jumpBtn = findViewById(R.id.btn_jump);
        jumpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewPage();
            }
        });
    }

    private void openNewPage() {
        Intent intent = new Intent(this, ContactsActivity.class);
        startActivity(intent);
    }
}