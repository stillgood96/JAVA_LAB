package ch02.chapter09;

public class Student {
    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject (String name, int score){
        korea.subjectName = name;
        korea.score = score;
    }
    public void setMathSubject (String name, int score){
        math.subjectName = name;
        math.score = score;
    }


    public void showStudentInfo() {

        int total = korea.score + math.score;
        System.out.printf("%s님의 총 점수는 %d점 입니다.", studentName,  total);
    }
}
