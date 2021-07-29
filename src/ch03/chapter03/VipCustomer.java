package ch03.chapter03;

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

        System.out.println("VIPCustomer(int, String) called");
    }
}
