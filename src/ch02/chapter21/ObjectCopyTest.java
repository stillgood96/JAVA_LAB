package ch02.chapter21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] bk = new Book[5];
        Book[] copyBk = new Book[5];


//        for(int i = 0; i< bk.length; i++) {
//            System.out.println(bk[i]);
//        }
        bk[0] = new Book("태백산맥1", "이선우");
        bk[1] = new Book("태백산맥2", "이선우");
        bk[2] = new Book("태백산맥3", "이선우");
        bk[3] = new Book("태백산맥4", "이선우");
        bk[4] = new Book("태백산맥5", "이선우");




        // bk 배열에서 copyBk로 복사하기
        // 배열은 객체가 있는 주소를 참조하는 것.
        // 그래서 복사를 한다고 해서 copyBk 랑 bk랑은 같은 객체의 주소를 복사한것이기 때문에
        // 어느한쪽의 배열의 index를 수정한다면 수정한 객체를 참조하는 모든 배열의 index 데이터가 바뀌게 된다.
        System.arraycopy(bk,0,copyBk,0,5);

        System.out.println("== bk ==");
        for(Book book : bk) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("== copyBk ==");
        for(Book book : copyBk) {
            System.out.println(book);
            book.showInfo();
        }


        // 다른 배열에 복사하고 서로 다른 객체를 가르키게 되는 상황이라면 다른 복사 방법을 사용해야 한다.
        // 일일이 값을 지정해서 새로운 객체를 생성..!
        copyBk[0] = new Book();
        copyBk[1] = new Book();
        copyBk[2] = new Book();
        copyBk[3] = new Book();
        copyBk[4] = new Book();

        for(int i = 0; i<bk.length; i++) {
            copyBk[i].setAuthor(bk[i].getAuthor());
            copyBk[i].setTitle(bk[i].getTitle());
        }
    }
}
