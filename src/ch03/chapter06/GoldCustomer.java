package ch03.chapter06;

public class GoldCustomer extends Customer {

    double salesRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        customerGrade = "GOLD";
        salesRatio = 0.1;
        bonusRatio = 0.02;
    }


    @Override
    public int calPrice(int price) {
        bonusPoint += price *bonusRatio;
        price  -= (int)(price * salesRatio);

        return price;
    }
}
