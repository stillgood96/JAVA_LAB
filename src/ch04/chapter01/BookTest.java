package ch04.chapter01;

class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + "," + author;
    }


}


public class BookTest{


    public static void main(String[] args) {

        Book book = new Book("demian1", "imlsw96");


        System.out.println(book);
        //ch04.chapter01.Book@6debcae2  패키지이름@가상메모리주소

        String str = new String("test");
        System.out.println(str); // == System.out.println(str.toString());
        // book 인스턴스와는 달리 test가 나온다. 이는 바로 위의 주석처럼 .toString이 오버라이딩 되어있기 때문이다.

        // 여기서 book도 마찬가지로 주소가아닌 text값이 나오게 하고 싶다면
        // String과 마찬가지로 toString을 오버라이딩 해주면 된다.

    }
}


