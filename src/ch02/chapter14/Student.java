package ch02.chapter14;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.takeBus(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.takeSubway(1250);
        this.money -= 1250;
    }

    public void showStudentInfo(){
        System.out.println(name + "의 남은 돈은 " + money + "입니다");
    }
}
