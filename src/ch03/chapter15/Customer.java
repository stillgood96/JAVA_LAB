package ch03.chapter15;

public class Customer implements Buy, Sell {


    @Override
    public void buy() {
        System.out.println("customer buy");
    }


    @Override
    public void sell() {
        System.out.println("customer sell");
    }


    // Buy 와 Sell에 중복되는 order메서드중 어떤것을 쓸지 정해야한다 혹은 재정의하거나
    @Override
    public void order() {
        Buy.super.order();
    }
}