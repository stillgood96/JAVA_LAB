package ch02.chapter18;

public class CarTest {
    public static void main(String[] args) {


        CarFactory factory = CarFactory.getInstance();
        Car new1 = factory.createCar();
        Car new2 = factory.createCar();

        System.out.println(new1.getCarId());
        System.out.println(new2.getCarId());
    }
}
