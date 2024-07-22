package afternoon.InterfaceEx;

public class HumanMain {
    public static void main(String[] args) {
        Human[] humans = {new Korean(),new American(),new Spanish()};

        for (Human human : humans) {
            humanCall(human);
        }
    }

    public static void humanCall(Human human) {
        human.speak();
        human.eat();
        human.hello();
    }
}
