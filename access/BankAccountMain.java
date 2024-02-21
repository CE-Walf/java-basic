// 캡슐화

package access;

public class BankAccountMain {
    public static void main(String[] args) {
       BankAccount account = new BankAccount();
       account.deposit(10000);
       account.withdraw(3000);
       System.out.println("balance = " + account.getBalance());
    }
}

// 사용하는 입장에서는
// deposit, withdraw, getBalance 이 3가지 메서드만 알면 된다.
// 접근 제어자와 캡슐화를 통해 데이터를 안전하게 보호하는 것은 물론이고,
// BankAccount를 사용하는 개발자 입장에서 해당하는 기능을 사용하는 복잡도도 낮출 수 있다.