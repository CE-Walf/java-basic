package oop1.ex;

public class Account {
    // 잔액
    int balance;

    // 입금 메서드
    void deposit(int amount) {
        balance += amount;
    }

    // 출금 메서드
    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}
