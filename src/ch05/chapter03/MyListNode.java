package ch05.chapter03;

public class MyListNode {

    private String data;       // 자료
    public MyListNode next;    // 다음 노드를 가리키는 링크

    // 기본생성자를 이용했을땐 data도 next도 null이 들어간다.
    public MyListNode(){
        data = null;
        next = null;
    }

    // data(자료)를 받는 생성자도 생성해준다.
    public MyListNode(String data){
        this.data = data;
        this.next = null;
    }

    // data(자료), link를 받는 생성자도 생성해준다. 수정을 위한 ?
    public MyListNode(String data, MyListNode link){
        this.data = data;
        this.next = link;
    }

    public String getData(){
        return data;
    }
}