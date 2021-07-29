package ch02.chapter16;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee empLee = new Employee();

        empLee.setEmployeeName("이선우");
        System.out.println(empLee.getEmployeeId());

        Employee empKim = new Employee();
        empLee.setEmployeeName("김선우");
        System.out.println(empKim.getEmployeeId());

        System.out.println(Employee.getSerialNum());


        // 클래스 내부에서 선언한 static 변수는 모든 인스턴스가 공유한다.

    }
}
