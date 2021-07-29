package ch02.chapter21;

public class Test {
    public static void main(String[] args) {

        Book[] bk = new Book[5];

//        for(int i = 0; i< bk.length; i++) {
//            System.out.println(bk[i]);
//        }
        bk[0] = new Book("태백산맥1", "이선우");
        bk[1] = new Book("태백산맥2", "이선우");
        bk[2] = new Book("태백산맥3", "이선우");
        bk[3] = new Book("태백산맥4", "이선우");
        bk[4] = new Book("태백산맥5", "이선우");

        for(Book book : bk) {
            System.out.println(book);
            book.showInfo();
        }

    }
}
