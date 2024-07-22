package afternoon.check;

import java.util.Random;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();

        try {
            Random random = new Random();
            if(random.nextBoolean()) {
//                System.out.println("오늘은 운이 없으시군요 메시지를 예외의 상위 클래스에 전달하면서 예외를 던집니다");
//                client.callRandException();
                throw new MyCheckException2("오늘은 운이 없으시군요 메시지를 예외의 상위 클래스에 전달하면서 예외를 던집니다");
            } else {
                System.out.println("오늘은 운이 좋으시군요");
            }

        } catch (MyCheckException2 e) {
            e.printStackTrace();
        }
        //System.out.println("막았는가?");
    }
}
