package afternoon.lang.wrapper;

public class Performancemain {
    public static void main(String[] args) {
        int max = 1_000_000_000;
        long starTime, endTime;

        long sum1 = 0;
        starTime = System.currentTimeMillis();

        for (int i = 0; i < max; i++) {
            sum1 += i;
        }

        endTime = System.currentTimeMillis();
        long spentTime = endTime - starTime;
        System.out.println("for문 작업에 걸린 시간 : " + spentTime + "ms");

        Long sum2 = 0L;

        starTime = System.currentTimeMillis();

        for (int i = 0; i < max; i++) {
            sum2 += i;
        }

        endTime = System.currentTimeMillis();
        long spentTime2 = endTime - starTime;
        System.out.println("for문 작업에 걸린 시간 : " + spentTime2 + "ms");
    }
}
