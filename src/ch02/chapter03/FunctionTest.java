package ch02.chapter03;

public class FunctionTest {

    public static int addNum (int a , int b) {
        return a+b;
    }

    public static void sayHello(String message) {
        System.out.println(message);
    }

    public static int calcSum() {
        int sum = 0;
        int i ;

        for ( i =0 ; i<=100 ; i ++ ){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        int total = addNum(5,4);
        System.out.println(total);

        sayHello("안녕하세요");

        total = calcSum();
        System.out.println(total);
    }
}
