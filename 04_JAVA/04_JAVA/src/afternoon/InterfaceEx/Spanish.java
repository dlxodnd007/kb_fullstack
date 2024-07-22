package afternoon.InterfaceEx;

public class Spanish implements Human{

    @Override
    public void speak() {
        System.out.println("Hola");
    }
    @Override
    public void eat() {
        System.out.println("El español come paella");
    }
    @Override
    public void hello() {
        System.out.printf("Hola. Actualmente es el año %d\n",year);
    }
}
