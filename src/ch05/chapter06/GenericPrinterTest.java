package ch05.chapter06;

public class GenericPrinterTest {
    public static void main(String[] args) {


        Powder powder = new Powder();

        // T로 지정한 모든 타입을 받을 키워드에 받아올 자료형을 입력해준다.
        // 여기서 나오는 '<>' 를 다이아몬드 연산자라고 부른다. (콜렉션프레임워크에 굉장히 많이 쓰이는 방식)
        // 키워드나 받아올 자료형을 정의 안하면 컴파일러는 object로 인식하고 형변환을 요구하게 된다.
        GenericPrinter<Powder>  gsp = new GenericPrinter<>();
        gsp.setMatarial(powder);

        Powder p = gsp.getMatarial();

    }
}
