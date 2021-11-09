package ch05.chapter06;

public class ThreeDprinterTest {

    public static void main(String[] args) {

        // ThreeDprinter1 은 재료가 Powder이다.
        // ThreeDprinter2 은 재료가 Plastic이다.
        // ThreeDprinter3 은 모든 재료를 담고 싶어 Object로 받아 만들었다.

        // 정리하면 1번, 2번 프린터에는 Powder와 Plastic만 들어가지만
        // 3번 프린터에는 모든 재료가 들어갈 수 있다.
        Powder powder  = new Powder();
        ThreeDprinter3  printer03 = new ThreeDprinter3();
        printer03.setMatarial(powder);

        // 하지만 들어갔다 나올때도 Object형이기 때문에 이는 따로 형변환이 필요하다.
        Powder p = (Powder)printer03.getMatarial();

        // 이러한 번거로움 때문에 제네릭 프로그래밍이 탄생하였다.


    }
}
