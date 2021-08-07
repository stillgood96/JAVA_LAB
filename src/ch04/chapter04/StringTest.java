package ch04.chapter04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

    public static void main(String[] args) throws ClassNotFoundException {

        // 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성된다.
        // Class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고,
        // 정보를 가져오는 메서드가 제공되는데
        // Class.forName("클래스 이름")메서드로 클래스를 동적으로 로드하게 된다.

        // 동적 로딩
        // 컴파일 시에 데이터 타입이 binding 되는 것이 아닌, 실행(runtime) 중에
        // 데이터 타입을 binding 하는 방법
        // 프로그래밍 시에는 문자열 변수로 처리했다가 런타임시에는 원하는 클래스를 로딩하여 binding 할 수 있따는 장점
        // 컴파일 시에 타입이 정해지지 않으므로 동적 로딩시 오류가 발생하면 프로그램의 심각한 장애 발생가능


        Class c = Class.forName("java.lang.String");


        // String에 있는 모든 생성자를 확인할 수 있따.
        Constructor[] cons = c.getConstructors();
        for(Constructor co : cons ) {
            System.out.println(co);
        }

        // Method에 있는 모든 Methods를 확인할 수 있따.
        Method[] m = c.getMethods();
        for(Method mth: m) {
            System.out.println(mth);
        }

        // 위와 같이 코딩을 하는 일은 흔치 않다.
        // 인스턴스 생성후 . 을 붙이면 모든 메서드를 볼 수 있기 때문에
        // 이를 쓰는 경우는 local에는 없는 클래스, 메서드를 가져올때 쓴다고 한다.




    }
}
