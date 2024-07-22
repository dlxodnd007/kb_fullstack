package afternoon.generic.ex2;

public class StrictGenericBox<Type> {
    private Type value;

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        if(value instanceof String || value instanceof Long || value instanceof Integer) {
            this.value = value;
        } else {
            System.out.println("전달 받은 값이 String / Integer / Long이 아닙니다");
        }
    }
}
