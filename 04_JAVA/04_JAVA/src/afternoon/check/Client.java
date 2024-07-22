package afternoon.check;

public class Client {
    public void callException() throws MyCheckException {
        throw new MyCheckException("Client.call 에서 에러 발생");
    }
    public void callRandException() throws MyCheckException2 {
        throw new MyCheckException2("Client.call 에서 에러 발생");
    }
}
