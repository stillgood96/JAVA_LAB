package ch02.chapter06;

public class Student {
    public int studentNumber;
    public String studentName;
    public int studentGrade;


    public Student() {};

    public Student(int studentNumber, String name, int grade) {
        // 매개변수와 멤버변수의 이름이 같다면 this. 로 클래스 멤버변수임을 알려주어야 함
        this.studentNumber = studentNumber;
        this.studentName = name;
        // 위와 마찬가지로 멤버변수와 매개변수의 변수명이 다르다면 this. 가 필요하지 않다.
        studentGrade = grade;
        System.out.println(studentNumber + "의 이름은" + studentName + "이고 학년은" + studentGrade + "입니다.");

    }

    public String showStudentInfo() {

        return studentNumber + "의 이름은" + studentName + "이고 학년은" + studentGrade + "입니다.";
    }

}
