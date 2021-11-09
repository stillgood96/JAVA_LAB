package ch05.chapter03;

public class MyLinkedList {

    private MyListNode head;
    int count;

    public MyLinkedList()
    {
        head = null;
        count = 0;
    }

    public MyListNode addElement( String data )
    {

        MyListNode newNode;
        if(head == null){  //맨 처음일때 - head가 null이라면 첫 노드라는 뜻
            newNode = new MyListNode(data);
            head = newNode;
        }
        else{
            newNode = new MyListNode(data);
            MyListNode temp = head;
            while(temp.next != null) {
                temp = temp.next;

                // temp.next가 null이 아닐동안 계속 뒤로 넘어가는 것 .
                // temp null이 아니면 temp는 temp의 nextNode를 가르키게되니까
                // temp.next가 null 즉 마지막까지 순회해서  nextNode를 가르키게 될것
            }
            // 그렇게 마지막까지 순회한 Node의 nextNode 값에 추가할 node 값을 넣어주는 것이다.
            temp.next = newNode;
        }
        count++;
        return newNode;
    }

    // 원하는 위치에 node를 집어 넣기
    public MyListNode insertElement(int position, String data )
    {
        int i;
        MyListNode tempNode = head;
        MyListNode newNode = new MyListNode(data);


        // 원하는 위치가 0보다 작거나 생성된 LinkedList 보다 큰 index에 연결하려고 하거나..
        if(position < 0 || position > count ){
            System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 앞으로 들어가는 경우
            newNode.next = head;
            head = newNode;
        }
        else{
            MyListNode preNode = null;
            for(i=0; i<position; i++){
                preNode = tempNode;
                tempNode = tempNode.next;

            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 앞을 삭제하는
            head = tempNode.next;
        }
        else{
            MyListNode preNode = null;
            for(i=0; i<position; i++){
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;
        System.out.println(position + "번째 항목 삭제되었습니다.");

        return tempNode;
    }

    public String getElement(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return new String("error");
        }

        if(position == 0){  //맨 인 경우

            return head.getData();
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode.getData();
    }

    public MyListNode getNode(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 인 경우

            return head;
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode;
    }

    public void removeAll()
    {
        head = null;
        count = 0;

    }

    public int getSize()
    {
        return count;
    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty()
    {
        if(head == null) return true;
        else return false;
    }

}