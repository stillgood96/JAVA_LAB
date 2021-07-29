package ch02.chapter18;

public class Car {
    private static int serialNum = 10000;
    private int carId;

    public Car() {
        serialNum++;
        carId = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getCarId() {
        return carId;
    }
}
