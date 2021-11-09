package ch05.chapter06;


// 제네릭 프로그래밍은 어떠한 타입을 다받아야하고 그에 따른 형변환 작업 또한 필요하지 않다.
// 모든 타입을 받는 다는 뜻의 명시할 키워드가 필요한데 대표적으로 T (type), K (key) , E (element)가 쓰인다.
// 이번 예제의 경우에는 'T'라는 키워드로 모든 타입을 받는 제네릭 키워드로 사용해본다.
public class GenericPrinter<T> {

    private T matarial;

    public T getMatarial() {
        return matarial;
    }

    public void setMatarial(T matarial) {
        this.matarial = matarial;
    }

    @Override
    public String toString() {
        return matarial.toString();
    }
}
