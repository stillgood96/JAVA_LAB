package ch03.chapter04;

public class CustomerTest {
    public static void main(String[] args) {

        // 하위클래스가 호출될때는 항상 먼저 상위 클래스부터 호출이 된다.
        // 그리고 상위 클래스가 default 생성자가 존재한다면 하위클래스 생성자에서 알아서 묵시적으로 추가되어서 생성되지만
        // default 생성자가 없다면 직접 명시적으로 상위클래스의 생성자를 생성해주어야 한다.

        Customer customerLee = new Customer(10000,"이선우");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);

        VipCustomer customerKim = new VipCustomer(10001, "김선우");
        customerKim.bonusPoint = 1000;
        price = customerKim.calPrice(1000);

        System.out.println(customerKim.showCustomerInfo() + price);


        // 업 캐스팅
        // Customer를 상속받은 VIPCustomer를 Customer에 대입이 가능하다.
        // 하지만 결과적으로 vc는 Cusomer의 인스턴스로 되기 때문에 Customer의 기능 , 값만 참조 사용이 가능하다 !
        // VIPCustomer의 메서드나 멤버변수를 사용하려면 별도로 다운캐스팅 혹은 Overriding이 필요하다 .. !
        Customer vc = new VipCustomer(12345 , "no-name");

        // VIPCustomer의 재정의된 메서드가 불렸다
        // Java에서 모든 클래스에 정의되어있는 함수 즉 메서드들은 가상메서드 기법으로 가상영역에 존재하게되는데
        // 여기서 아무리 많은 객체들이 인스턴스화 되더라도 내부에 정의 되어있는 메서드는 한개만 저장되어
        // 메서드를 사용할 때 저장되어있는 메서드 주소를 참조해서 메서드를 사용하게 되는데
        // Customer클래스를 상속한 하위 클래스 VIPCustomer에서 calcPrice를 재정의 했다.
        // 메서드를 재정의하게되면 새로운 주소를 부여받아 메서드가 저장되게되는데
        // 이때 업캐스팅된 vc 인스턴스에서 calcPrice 메서드를 호출하게되면 JavaCompiler에서
        // 재정의된 메서드를 실행시키는 것.
        System.out.println(vc.calPrice(1000));


    }
}
