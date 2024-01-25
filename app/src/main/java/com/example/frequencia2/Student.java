package com.example.frequencia2;
public class Student {
    private long id;
    private String name;
    private int test1Score;
    private int test2Score;
    private double average;
    private boolean approved;

    public Student(int id, String name, int test1Score, int test2Score, double average, boolean approved) {
    }

    public Student() {

    }

    // Constructors, getters, and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTest1Score() {
        return test1Score;
    }

    public void setTest1Score(int test1Score) {
        this.test1Score = test1Score;
    }

    public int getTest2Score() {
        return test2Score;
    }

    public void setTest2Score(int test2Score) {
        this.test2Score = test2Score;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
