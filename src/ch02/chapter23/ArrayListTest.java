package ch02.chapter23;

import ch02.chapter21.Book;
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        // 자바에서의 배열은 index가 정해져있다.
        // 상황에 따라서 배열의 크기를 줄이고 확장해야할 때가 필요한데
        // 이때 자바 유틸에 포함되어있는 ArrayList를 활용하면 가변적인 배열작업이 가능함
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("태백산맥1","이선우"));
        library.add(new Book("태백산맥2","이선우"));
        library.add(new Book("태백산맥3","이선우"));
        library.add(new Book("태백산맥4","이선우"));
        library.add(new Book("태백산맥5","이선우"));

        for(int i =0; i< library.size(); i++) {
            library.get(i).showInfo();
        }
    }
}
