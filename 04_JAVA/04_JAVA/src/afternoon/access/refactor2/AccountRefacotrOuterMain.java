package afternoon.access.refactor2;

import afternoon.access.refactor.AccountRefactor;

public class AccountRefacotrOuterMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("우리은행","브론즈","이태웅",10000);

        // public 요소 접근
        System.out.println(account.bank);

        // default 요소 접근
//        System.out.println(account.grade);
    }
}
