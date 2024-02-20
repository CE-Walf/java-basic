package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(); // 객체 생성

        account.deposit(10000); // 10000원 입금
        account.withdraw(9000); // 9000원 출금
        account.withdraw(2000); // 2000원 출금 시도 (잔액 부족 출력)

        // 잔고 출력
        System.out.println("잔고 : " + account.balance);
    }
}
