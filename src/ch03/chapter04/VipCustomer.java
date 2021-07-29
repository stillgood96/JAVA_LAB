package ch03.chapter04;

public class VipCustomer extends Customer {

    double salesRatio;
    String agentId;

//    public VipCustomer(){
//        super(0, "noname");
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        customerGrade ="VIP";
//
//        System.out.println("VIPCustomer() call");
//    }

    public VipCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        salesRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    public String getAgentId() {
        return agentId;
    }
}
