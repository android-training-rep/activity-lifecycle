package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactsActivity extends AppCompatActivity {

    Button jumpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        jumpBtn = findViewById(R.id.btn_jump);
        jumpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewPageAndGetResults();
            }
        });
    }

    private void openNewPageAndGetResults() {
        // todo: 调用系统联系人；获取返回值；显示选中的联系人
    }
}