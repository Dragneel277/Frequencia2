package com.example.frequencia2;// MainActivity.java

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onApproveButtonClick(View view) {
        Intent intent = new Intent(this, ApproveActivity.class);
        startActivity(intent);
    }


    public void onExamButtonClick(View view) {
        Intent intent = new Intent(this, ExamActivity.class);
        startActivity(intent);
    }


    public void onRegisterButtonClick(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
