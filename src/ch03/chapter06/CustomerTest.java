package ch03.chapter06;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {


        ArrayList<Customer> customerList =new ArrayList<>();

        Customer customerT = new Customer(10010, "Tomas");
        Customer customerA = new GoldCustomer(10011, "Andrew");
        Customer customerS = new GoldCustomer(10012, "Stephan");
        Customer customerD = new VipCustomer(10013, "Demon");
        Customer customerF = new VipCustomer(10014, "Frank");

        customerList.add(customerT);
        customerList.add(customerA);
        customerList.add(customerS);
        customerList.add(customerD);
        customerList.add(customerF);

        for( Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;

        for(Customer customer : customerList) {
            int cost = customer.calPrice(price);
            System.out.println(customer.getCusotomerName()+ "님이 " + cost + "을 지불하셨습니다.");
            System.out.println(customer.getCusotomerName()+ "님의 현재 보너스 포인트는" + customer.bonusPoint + "입니다.");
        }
    }
}
