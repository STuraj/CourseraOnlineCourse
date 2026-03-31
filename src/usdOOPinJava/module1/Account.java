package usdOOPinJava.module1;

public class Account {
    private int balance;
    private int id;

    public Account(int startBalance, int startId) {
        balance = startBalance;
        id = startId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Account acc = new Account(100, 7);

        acc.setBalance(150);
        // acc.setId(9); // imagine this line is attempted but it does not compile
        // acc.id = 9;   // and this direct access also does not compile

        System.out.println(acc.getBalance() + " " + acc.getId());
    }
}
