package ch02.chapter24;

public class Test {

    public static void main(String[] args) {

        Student studentLee = new Student(1,"이선우");

        studentLee.addSubject("국어", 100);
        studentLee.addSubject("영어", 89);


        Student studentKim = new Student(2,"김선우");
        studentKim.addSubject("음악", 70);
        studentKim.addSubject("수학", 88);

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

    }

}
