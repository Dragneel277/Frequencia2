package com.example.frequencia2;



import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }


    public void onAddButtonClick(View view) {

    }


    public void onCancelButtonClick(View view) {

        finish();
    }
}
