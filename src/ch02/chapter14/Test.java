package ch02.chapter14;

public class Test {

    public static void main(String[] args) {
        Bus bus = new Bus(5);
        Subway subway =new Subway(2);

        Student studentLee = new Student("이선우", 10000);

        studentLee.takeBus(bus);
        studentLee.takeBus(bus);
        studentLee.takeSubway(subway);

        studentLee.showStudentInfo();
        bus.showBusInfo();
        subway.showBusInfo();
    }
}
