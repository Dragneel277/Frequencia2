package com.example.frequencia2;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ExamActivity extends AppCompatActivity {

    private StudentDatabaseHelper dbHelper;
    private ListView listViewStudents;
    private StudentAdapter studentAdapter;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        dbHelper = new StudentDatabaseHelper(this);
        listViewStudents = findViewById(R.id.listViewStudents);
        /*
        try {
           /ArrayList<Student> students = dbHelper.getAllStudents();

            // Create a custom adapter and set it to the ListView
            studentAdapter = new StudentAdapter(this, R.layout.list_item_student2, students);
            listViewStudents.setAdapter(studentAdapter);
        } catch (Exception e) {
            Log.e("ExamActivity", "Error retrieving students from the database", e);
            showToast("Error retrieving students from the database");
        }*/
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
