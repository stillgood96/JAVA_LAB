package ch02.chapter14;

public class Bus {
    int busNum;
    int passengerCount;
    int income;

    public Bus(int busNum) {
        this.busNum = busNum;
    }

    public void takeBus(int income) {
        this.income = income;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.printf("%d번 버스의 총 승객 수는 %d명이고 수익은  %d원 입니다.\n", busNum,passengerCount,income);
    }
}
