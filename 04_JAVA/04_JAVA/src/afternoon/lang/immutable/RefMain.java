package afternoon.lang.immutable;

public class RefMain {
    public static void main(String[] args) {
        User user1 = new User("태웅");
        User user2 = user1;

        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);

        user2.setName("이태웅");
        System.out.println("User2의 이름을 '이태웅'으로 변경");


        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
    }
}
