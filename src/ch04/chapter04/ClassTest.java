package ch04.chapter04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        // 클래스를 다르게 가져오는 방법 1
        Class c1= Class.forName("ch04.chapter04.Person");

        Person person = (Person)c1.newInstance();

        person.setName("Lee");
        System.out.println(person);

        // 클래스를 다르게 가져오는 방법 2
        // 이 방법은 가져오려는 클래스의 인스턴스가 미리 생성되어 있어야 한다.
        Class c2 = person.getClass();
        Person p = (Person)c2.newInstance();
        System.out.println(p);


        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Kim"};
        Person kim = (Person)cons.newInstance(initargs);
        System.out.println(kim);


    }

}
