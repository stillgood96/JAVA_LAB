package ch02.chapter24;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private ArrayList<Subject> subjectList;


    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setTitle(name);
        subject.setScore(score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {


        for( Subject subject: subjectList) {
            int total = 0;
            total += subject.getScore();
            System.out.printf("%s의 %s과목 점수는 %d 입니다.\n",studentName,subject.getTitle(), total);
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
}
