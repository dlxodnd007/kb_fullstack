package afternoon.poly4Ex;

public class Dog implements Animal {
    @Override
    public void sound(){
        System.out.println("강아지가 멍멍");
    };

    @Override
    public void eat() {
        System.out.println("강아지가 사료를 먹습니다");
    };
}
