package afternoon.poly3.casting1;

public class CastingMain2 {
    public static void main(String[] args) {
        // # 1번 로드
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;

        // # 2번 로드
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
    }
}
