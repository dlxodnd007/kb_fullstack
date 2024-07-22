package afternoon.pack;

import afternoon.ref.Customer;

import afternoon.pack.a.Boss;

public class PackageMain {
    public static void main(String[] args) {
//        Customer customer1 = new Customer();
//
//        afternoon.pack.nouveau.Customer customer2 = new afternoon.pack.nouveau.Customer();

          Boss boss = new Boss("이태웅",30);
          boss.printBoss();
    }
}
