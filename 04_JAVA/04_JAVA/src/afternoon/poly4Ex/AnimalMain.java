package afternoon.poly4Ex;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[]  animals = {new Dog(), new Cat(), new Duck()};

        for (int i = 0; i < animals.length; i++) {
            animalDo(animals[i]);
            if (animals[i] instanceof Duck) {
                flyDo((Fly) animals[i]);
            }
        }
    }

    public static void animalDo(Animal animal) {
        System.out.println("동물 기능 테스트");
        animal.eat();
        animal.sound();
        System.out.println("동물 기능 테스트 종료");
    }
    public static void flyDo(Fly animal) {
        System.out.println("오리 기능 테스트");
        animal.fly();
        System.out.println("오리 기능 테스트 종료");
    }
}
