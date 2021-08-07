package ch04.chapter03;

public class StringTest {
    public static void main(String[] args) {

        // String은 불변객체로 + 혹은 concat을 이용해서 문자열을 합치면
        // 계속해서 합쳐진 인스턴스가 생성됨으로 메모리에 부담이 가해진다.
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        java = java.concat(android);

        System.out.println(java);
        System.out.println(System.identityHashCode(java));

        // hashCode를 확인함으로써 합쳐진 문자열과 기존 문자열과의 주소값이 다르다는 것으로
        // 서로 다른 인스턴스임을 확인할 수 있다.
        // 메모리 낭비를 해결하기위해 자바에서는 StringBuilder와 StringBuffer를 제공한다.
        // 두가지의 차이점은 단일쓰레드 환경이나 멀티쓰레드 환경에서 쓰이는 차이점 정도고
        // 단일쓰레드 환경이라면 빌더를 멀티쓰레드 환경이라면 버퍼를 사용하면 된다고 한다..


        StringBuilder sb = new StringBuilder();
        sb.append("hi");
        System.out.println(System.identityHashCode(sb));
        sb.append("Java");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));


        // StringBuilder 객체를 String화 시키려면 toString()을
        String st = sb.toString();
        System.out.println(st);



    }
}
