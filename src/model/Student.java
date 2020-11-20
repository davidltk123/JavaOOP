package model;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int studentID;

    public Student (String name, int age, String gender,  int studentID) {
        this.name = name;
        this.gender = gender;
        this.studentID = studentID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
