package afternoon.exception.real;


import afternoon.exception.uncheck.MyCheckException;
import afternoon.exception.uncheck.MyUnCheckException;

public class Client {
   public void callException() throws MyCheckException {
       throw new MyCheckException("MyCheckException");
   }

   public void callException2() {
       throw new MyUnCheckException("MyUnCheckException");
   }
}
