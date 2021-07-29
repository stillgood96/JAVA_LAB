package ch03.chapter08;

import java.util.ArrayList;

class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() {

    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }


    public void flying() {
        System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
    }
}

public class AnimalTest {

    // AnimalTest의 메서드인 moveAnimal의 코드는 한줄인데
    // 매개변수에 들어가는 변수의 클래스형에 따라 결과값이 달라지게되는데 이를 다형성이라 볼 수 있다.
    // 상속 - 재정의 - 형변환 이 과정을 거치면 상위 클래스에서 하위클래스를 핸들링할 수 있다.
    // 여기서의 상위 클래스에서의 하위클래스 재정의란 공통적인 메서드 즉 오버라이딩한 메서드에만 해당하고
    // 각각의 클래스 Human, Eagle, Tiger만의 메서드는 상위클래스에서 구현을 못한다.
    // 구현을 하기 위해서는 추가적으로 다운캐스팅이 필요하다.

    public static void main(String[] args) {
        Animal human = new Human();
        Animal eagle = new Eagle();
        Animal tiger = new Tiger();

        AnimalTest test = new AnimalTest();

//        test.moveAnimal(human);
//        test.moveAnimal(eagle);
//        test.moveAnimal(tiger);


        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(human);
        animalList.add(eagle);
        animalList.add(tiger);

        for(Animal animal : animalList) {
            animal.move();
        }

        System.out.println("-----DownCasting Test-----");
        test.testDownCasting(animalList);
    }

    public void testDownCasting( ArrayList<Animal> list) {
        for(int i =0 ; i< list.size(); i++) {
            Animal animal = list.get(i);

            if(animal instanceof Human) {
                Human human = (Human)animal;
                human.readBook();
            }
            else if(animal instanceof Eagle) {
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            }
            else if(animal instanceof Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            }
            else{
                System.out.println("unsupported animal");
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
