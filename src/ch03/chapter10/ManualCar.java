package ch03.chapter10;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전을 합니다");
        System.out.println("사람이 핸들을 잡습니다.");
    }

    @Override
    public void stop() {
        System.out.println("차량운행을 멈춥니다.");
    }
}
