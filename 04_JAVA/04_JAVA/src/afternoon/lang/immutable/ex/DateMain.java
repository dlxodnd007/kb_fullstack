package afternoon.lang.immutable.ex;

public class DateMain {
    public static void main(String[] args) {
        ImmutableDate date1 = new ImmutableDate(2024,7,1);
        ImmutableDate date2 = date1;

        System.out.println("date2 의 년도만 2025년으로 변경");
        date2 = date2.setYear(2025);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("date2 의 월만 8월로 변경");
        date2 = date2.setMonth(8);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("date2 의 일만 2일로 변경");
        date2 = date2.setDay(2);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
