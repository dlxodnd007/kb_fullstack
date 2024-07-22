package afternoon.generic.ex2;

public class BoxMain {
    public static void main(String[] args) {
        StrictGenericBox<String> stringStrictGenericBox1 = new StrictGenericBox<>();
        stringStrictGenericBox1.setValue("hello");
        System.out.println("stringStrictGenericBox1's value = " + stringStrictGenericBox1.getValue());

        StrictGenericBox<Integer> stringStrictGenericBox2 = new StrictGenericBox<>();
        stringStrictGenericBox2.setValue(100);
        System.out.println("stringStrictGenericBox2's value = " + stringStrictGenericBox2.getValue());

        StrictGenericBox<Double> stringStrictGenericBox3 = new StrictGenericBox<>();
        stringStrictGenericBox3.setValue(3.0);
    }
}
