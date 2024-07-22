package afternoon.generic.limit;

public class World2 {
    public static void main(String[] args) {
        GenericWorld<Integer> integerGenericWorld = new GenericWorld<>();
        integerGenericWorld.setNumber(10);
        integerGenericWorld.transDouble();
        System.out.println(integerGenericWorld.getNumber());

        // GenericWorld<String>; 문제 발생
    }
}
