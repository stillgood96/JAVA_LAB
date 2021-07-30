package ch03.chapter09;

// abstract 클래스를 상속할때는 abstract 클래스 내부에 선언된
// abstract 메서드를 7
public class Desktop extends  Computer{

    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop display");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turn off!");
    }
}
