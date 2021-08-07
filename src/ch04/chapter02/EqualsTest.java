package ch04.chapter02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");

        System.out.println(std1 == std2);
        // 두개의 인스턴스 안의 정보는 같지만 다르다고 false가 나온다.
        // 엄연히 다른 객체이고 해당하는 주소가 각각 다르다.

        System.out.println(std1.equals(std2));
        // 이 역시 false가 나온다.

        // 하지만 여기서 안의 내용이 같다면 논리적으로 위의 객체들은 서로 같은 객체로 쳐야
        // 추후 성적합산이든 필요 작업을 할 수 있다.

        // 이런 경우 논리적으로 같다라는 오버라이딩이 필요하다.
        // 오버라이딩에는 equals()와 hashCode()
        // 두가지의 Object(최상위) 클래스의 메서드를  Student 클래스 내부에서 재정의 해주어야 한다.


        // Student 클래스 내부에 equals()를 오버라이딩 해준 이후
        System.out.println(std1 == std2); // false
        System.out.println(std1.equals(std2)); // true


        // hashCode() 서로 다른걸 확인할 수 있다.
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        // hashCode()를 재정의 해주어야 하는데
        // 이는 간단하다 Student 클래스로 돌아와서 return 값을 변경해주면 된다.
        // 그러면 들수 있는 의문점으로는 진짜로 가지고 있는 hashcode값에 대해서 의문점이 생길 수 있는데
        // 이는 아래의 함수를 이용하면 찾아볼 수 있다.
        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));



        // clone()
        // 원본객체를 복사하는 메서드
        // 생성된 객체를 Object상태 그대로 복사해오는 메서드
        // 생성자를 이용할때는 초기화를 하고 생성 값을 입려받아서 만들어지지만
        // Clone의 경우 입력값 모두 복사해오는 것
        // 이는 정보은닉 객체보호의 관점에서 위배될 수 있다.
        // 대안책으로 해당 클래스의 clone() 메서드를 사용가능하다는 뜻으로 cloneable 인터페이스를 implements해준다..
        Student copyStudent = (Student) std1.clone();
        System.out.println(copyStudent);

    }
}
