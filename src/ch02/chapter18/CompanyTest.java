package ch02.chapter18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        // Company 클래스 내부에 정의된 getInstance가 static이 아니라면
        // Company  클래스의 인스턴스를 따로 생성해주어야 하기 때문에 static으로 정의한 것 !

        Company company1  =  Company.getInstance();
        Company company2  =  Company.getInstance();

        // company1 , 2 가 가르키는 주소가 동일한걸 확인할 수 있다.
        System.out.println(company1);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();
    }
}
