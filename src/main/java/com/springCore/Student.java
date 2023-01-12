package com.springCore;

public class Student {
    private int studentId;
    private String name;
    private  String add;
    public  Student(){
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                '}';
    }

    public Student(int studentId, String name, String add) {
        this.studentId = studentId;
        this.name = name;
        this.add = add;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
