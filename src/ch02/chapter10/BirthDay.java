package ch02.chapter10;

public class BirthDay {
    private int day;
    private  int month;
    private  int year;

    private  boolean isValid;

    public void showDate() {
        if(isValid) {
            System.out.printf("%d년 %d월 %d일 입니다.\n", year,month,day);
        }
        else {
            System.out.println("유효하지 않는 날짜 입니다.");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMoth() {

        return month;
    }

    public void setMoth(int month) {
        if(month <1 || month >12){
            isValid = false;
        }else {
            isValid = true;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
