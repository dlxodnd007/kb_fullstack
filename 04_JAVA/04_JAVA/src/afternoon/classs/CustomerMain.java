package afternoon.classs;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("이태웅",27,10000,true);
        customer1.printCustomerInfo();

        Customer customer2 = new Customer();
        customer2.printCustomerInfo();
    }
}
