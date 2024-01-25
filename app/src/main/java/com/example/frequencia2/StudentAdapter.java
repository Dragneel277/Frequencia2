package com.example.frequencia2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student> {

    public StudentAdapter(Context context, int list_item_student, List<Student> students) {
        super(context, 0, students);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Student student = getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_student, parent, false);
        }


        ImageView imageViewStudent = convertView.findViewById(R.id.imageViewStudent);
        TextView textViewName = convertView.findViewById(R.id.textViewName);
        TextView textViewTest1 = convertView.findViewById(R.id.textViewTest1);
        TextView textViewAvg = convertView.findViewById(R.id.textViewAvg);
        TextView textViewTest2 = convertView.findViewById(R.id.textViewTest2);
        TextView textViewStatus = convertView.findViewById(R.id.textViewStatus);


        textViewName.setText(student.getName());
        textViewTest1.setText("Test 1: " + student.getTest1Score());
        textViewAvg.setText(", Media: " + student.getAverage());
        textViewTest2.setText("Test 2: " + student.getTest2Score());
        textViewStatus.setText(", Status: " + (student.isApproved() ? "Approved" : "Not Approved"));

        return convertView;
    }
}
