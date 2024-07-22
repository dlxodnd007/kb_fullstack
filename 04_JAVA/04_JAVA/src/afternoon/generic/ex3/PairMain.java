package afternoon.generic.ex3;

public class PairMain {
    public static void main(String[] args) {
        Pair<String,String> nameData = new Pair<>("이효석","name");
        Pair<Integer,String> ageData = new Pair<>(40,"age");
        Pair<Boolean,String> marriedData = new Pair<>(false,"age");

        System.out.println("nameData = " + nameData);
        System.out.println("ageData = " + ageData);
        System.out.println("marriedData = " + marriedData);
    }
}
