package ch02.chapter12;

public class Person {
    String name;
    int age;

    public Person( ){
            this("이름없음", 9999);
    }

    public Person(String name, int age ){
        this.name = name;
        this.age =age;
    }

    public Person getPerson() {
        return this;
    }


    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name + " / " + person.age);
        System.out.println(person);

        System.out.println(person.getPerson());
    }
}
