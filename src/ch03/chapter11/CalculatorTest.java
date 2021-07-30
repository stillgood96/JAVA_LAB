package ch03.chapter11;

public class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;
        // 타입상속
        // CompleteCalc(class) - Calculator(abstrct class) - Calc(Interface)
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1,num2)); // Calculaotor에서 재정의됨
        System.out.println(calc.substract(num1,num2));// Calculaotor에서 재정의됨
        System.out.println(calc.times(num1,num2)); // CompleteCalc 에서 재정의됨
        System.out.println(calc.divide(num1,num2));// CompleteCalc 에서 재정의됨


        // 하지만 CompleteCalc에서 생성된 메서드 showInfo는 타입상속에서는 사용 불가능
        // 최상위 위치에 있는 Calc interface에서 선언된 메서드만 사용 가능.

    }
}
