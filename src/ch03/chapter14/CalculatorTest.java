package ch03.chapter14;

import ch03.chapter14.Calc;
import ch03.chapter14.CompleteCalc;

public class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;
        // 타입상속
        // CompleteCalc(class) - Calculator(abstrct class) - Calc(Interface)
        Calc calc = new CompleteCalc();


//        System.out.println(calc.add(num1,num2)); // Calculaotor에서 재정의됨
//        System.out.println(calc.substract(num1,num2));// Calculaotor에서 재정의됨
//        System.out.println(calc.times(num1,num2)); // CompleteCalc 에서 재정의됨
//        System.out.println(calc.divide(num1,num2));// CompleteCalc 에서 재정의됨
//
//
//        // 하지만 CompleteCalc에서 생성된 메서드 showInfo는 타입상속에서는 사용 불가능
//        // 최상위 위치에 있는 Calc interface에서 선언된 메서드만 사용 가능.
//
        calc.description();


        // 자바8 이후 인터페이스에서 default 메서드를 정의내릴 수 있다.
        // 추가적으로 static으로 선언한 메서드도 정의가 가능한데
        // static으로 선언한 메서드 같은 경우에는 인스턴스 없이 Interface 이름으로 사용이 가능하다.
        int[] arr = {1,2,3,4,5};
        int result = Calc.total(arr);
        System.out.println(result);


    }
}
