package ch03.chapter15;

public class CustomerTest {

    public static void main(String[] args) {


        Customer cs = new Customer();

        cs.buy();
        cs.sell();
        cs.order();

        System.out.println("---Buy buyer----");
        Buy buyer = cs;
        buyer.buy();
        buyer.order();

        System.out.println("---Sell seller----");
        Sell seller = cs;
        seller.order();
        seller.sell();
    }
}
