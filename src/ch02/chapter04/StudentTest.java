package ch02.chapter04;

public class StudentTest {
    public static void main(String[] args) {

        // 인스턴스 생성의 예
        Student studentLee = new Student();

        studentLee.studentId = 12345;
        studentLee.address = "서울시 성동구 하왕십리동 한신무학아파트 2동 904호";
        studentLee.setStudentName("이선우");

        studentLee.showStudentInfo();
    }
}
