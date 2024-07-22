package afternoon.poly4Ex;

public class Cat implements Animal {

    @Override
    public void eat(){
        System.out.println("고양이가 츄르를 먹습니다");
    }

    @Override
    public void sound(){
        System.out.println("고양이가 야옹");
    }
}
