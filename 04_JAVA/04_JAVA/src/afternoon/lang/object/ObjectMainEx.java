package afternoon.lang.object;

public class ObjectMainEx {
    public static void main(String[] args) {
        Object[] objects = {new Parent(), new Child(), new OtherClass()};

        System.out.println(size(objects));
    }
    public static int size(Object[] objectss) {
        return objectss.length;
    }
}
