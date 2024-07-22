package afternoon.generic.ex1;

public class BoxMain {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setVlaue(10);
        Integer integer = integerBox.getVlaue();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.setVlaue("hello");
        String str = stringBox.getVlaue();
        System.out.println("str = " + str);
    }
}
