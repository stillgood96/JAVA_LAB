package ch02.chapter09;

public class MainTest {
    public static void main(String[] args) {
        Student lsw = new Student(1, "이선우");

        lsw.setKoreaSubject("국어",100);
        lsw.setMathSubject("수학",100);

        lsw.showStudentInfo();
    }
}
