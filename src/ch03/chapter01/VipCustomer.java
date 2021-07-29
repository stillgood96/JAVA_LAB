package ch03.chapter01;

public class VipCustomer extends Customer {

    double salesRatio;
    String agentId;

    public VipCustomer(){
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade ="VIP";
    }
}
