package com.example.frequencia2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

public class StudentDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "students.db";
    private static final int DATABASE_VERSION = 1;

    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE students (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT," +
                    "test1Score INTEGER," +
                    "test2Score INTEGER," +
                    "average REAL," +
                    "approved INTEGER);";

    public StudentDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    // Method to get all students from the database
   /* public ArrayList<Student> getAllStudents() {
        ArrayList<Student> students = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM students", null);

        if (cursor != null && cursor.getCount() > 0) {
            do {
                int id = cursor.getInt(cursor.getColumnIndex("id"));
                String name = cursor.getString(cursor.getColumnIndex("name"));
                int test1Score = cursor.getInt(cursor.getColumnIndex("test1Score"));
                int test2Score = cursor.getInt(cursor.getColumnIndex("test2Score"));
                double average = cursor.getDouble(cursor.getColumnIndex("average"));
                boolean approved = cursor.getInt(cursor.getColumnIndex("approved")) == 1;

                Student student = new Student(id, name, test1Score, test2Score, average, approved);
                students.add(student);

            } while (cursor.moveToNext());
        }

// Close the cursor after retrieving data
        if (cursor != null) {
            cursor.close();
        }

// Close the database after use
        db.close();


        return students;
    }*/
}
