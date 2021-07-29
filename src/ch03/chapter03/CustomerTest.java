package ch03.chapter03;

public class CustomerTest {
    public static void main(String[] args) {

        // 하위클래스가 호출될때는 항상 먼저 상위 클래스부터 호출이 된다.
        // 그리고 상위 클래스가 default 생성자가 존재한다면 하위클래스 생성자에서 알아서 묵시적으로 추가되어서 생성되지만
        // default 생성자가 없다면 직접 명시적으로 상위클래스의 생성자를 생성해주어야 한다.

        Customer customerLee = new Customer(10000,"이선우");
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());

        VipCustomer customerKim = new VipCustomer(10001, "김선우");
        customerKim.bonusPoint = 1000;

        System.out.println(customerKim.showCustomerInfo());


        // 업 캐스팅
        // Customer를 상속받은 VIPCustomer를 Customer에 대입이 가능하다.
        // 하지만 결과적으로 vc는 Cusomer의 인스턴스로 되기 때문에 Customer의 기능 , 값만 참조 사용이 가능하다 !
        // VIPCustomer의 메서드나 멤버변수를 사용하려면 별도로 다운캐스팅 혹은 Overriding이 필요하다 .. !
        Customer vc = new VipCustomer(12345 , "no-name");


    }
}
