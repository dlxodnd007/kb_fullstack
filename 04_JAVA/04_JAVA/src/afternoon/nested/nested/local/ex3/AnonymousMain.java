package afternoon.nested.nested.local.ex3;

public class AnonymousMain {
    public static void main(String[] args) {
        Hello hi = new Hello() {
            @Override
            public void hello() {
                System.out.println("익명 클래스 내부의 hello 입니다!");
            }
        };
        hi.hello();
    }
}
