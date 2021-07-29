package ch02.chapter14;

public class Subway {
    int subwayNum;
    int passengerCount;
    int income;

    public Subway(int subwayNum) {
        this.subwayNum = subwayNum;
    }

    public void takeSubway(int income) {
        this.income = income;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.printf("%d호선 지하철의 총 승객 수는 %d명이고 수익은  %d원 입니다.\n", subwayNum,passengerCount,income);
    }
}
