package com.example.frequencia2;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;


public class RegisterActivity extends AppCompatActivity{

    private EditText editTextName;
    private EditText editTextTest1;
    private EditText editTextTest2;

    private StudentDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextName = findViewById(R.id.editTextName);
        editTextTest1 = findViewById(R.id.editTextTest1);
        editTextTest2 = findViewById(R.id.editTextTest2);

        dbHelper = new StudentDatabaseHelper(this);
    }

    public void onAddStudentClick(View view) {
        String name = editTextName.getText().toString().trim();
        String test1ScoreStr = editTextTest1.getText().toString().trim();
        String test2ScoreStr = editTextTest2.getText().toString().trim();

        if (!name.isEmpty() && !test1ScoreStr.isEmpty() && !test2ScoreStr.isEmpty()) {
            int test1Score = Integer.parseInt(test1ScoreStr);
            int test2Score = Integer.parseInt(test2ScoreStr);
            double average = (test1Score + test2Score) / 2.0;


            Student newStudent = new Student();
            newStudent.setName(name);
            newStudent.setTest1Score(test1Score);
            newStudent.setTest2Score(test2Score);
            newStudent.setAverage(average);
            newStudent.setApproved(average >= 60);


            addStudentToDatabase(newStudent);
        }
    }

    private void addStudentToDatabase(Student student) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("name", student.getName());
        values.put("test1Score", student.getTest1Score());
        values.put("test2Score", student.getTest2Score());
        values.put("average", student.getAverage());
        values.put("approved", student.isApproved() ? 1 : 0);

        db.insert("students", null, values);

        db.close();


    }
}
