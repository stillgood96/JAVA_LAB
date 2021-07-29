package ch03.chapter01;

public class Customer {

    private int customerId;
    private String cusotomerName;
    protected String customerGrade; // 상속받는 하위 클래스들에서도 접근이 가능하려면 protected !
    int bonusPoint;
    double bonusRatio;



    public Customer() {
        customerGrade= "Silver";
        bonusRatio = 0.01;
    }
    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return cusotomerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCusotomerName() {
        return cusotomerName;
    }

    public void setCusotomerName(String cusotomerName) {
        this.cusotomerName = cusotomerName;
    }
}
