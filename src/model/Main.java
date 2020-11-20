package model;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("David", 23, "Male", 12345);
        System.out.println(student.getName());
        System.out.println(student.getGender());
        System.out.println(student.getStudentID());
        System.out.println(student.getAge());
    }
}
