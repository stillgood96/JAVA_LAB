package ch03.chapter01;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer();

        customerLee.setCusotomerName("이선우");
        customerLee.setCustomerId(1000);
        System.out.println(customerLee.showCustomerInfo());

        VipCustomer customerKim = new VipCustomer();

        customerKim.setCusotomerName("김선우");
        customerKim.setCustomerId(1001);
        System.out.println(customerKim.showCustomerInfo());

    }
}
