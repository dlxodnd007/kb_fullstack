package afternoon.classs;

public class Customer {
    String name;
    int age;
    int price;
    boolean isblackList;

    Customer(){
        this.name = "아직 몰라요";
        this.age = 0;
        this.price = 0;
        this.isblackList = false;
    }
    Customer(String name, int age, int price, boolean isblackList){
        this.name = name;
        this.age = age;
        this.price = price;
        this.isblackList = isblackList;
    }

    void printCustomerInfo(){
        System.out.println("고객의 이름은 : " + this.name);
        System.out.println("고객의 나이는 : " + this.age);
        System.out.println("고객의 총 사용 금액은 : " + this.price);
        System.out.println("고객의 블랙리스트 여부는 : " + this.isblackList);
    }
}
