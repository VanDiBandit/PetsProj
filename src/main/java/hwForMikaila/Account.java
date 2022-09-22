package hwForMikaila;

public class Account {
    private String name;
    private double balance;
    private int accNum;

    public Account(String name, int accNum, double amount){
        this.name = name;
        this.balance = amount;
        this.accNum = accNum;
    }
    public Account(String name, int accNum) {
        accNum = 1;
        balance = 0.00;
    }
    public void deposit(double amount){
        if (amount <=0){
            System.out.println("ERROR CANNOT DEPOSIT NEGATIVE AMOUNT, TRY AGAIN.");
        }else {
            this.balance+=amount;
            System.out.format("$%.2f Has Been Successfully Deposited\n", amount);
        }
    }

    public void withdraw(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
            System.out.format("$%.2f Has Been Withdrawn\n", amount);
        }else{
            System.out.println("TRANSACTION CANCELLED DUE TO INSUFFICIENT FUNDS.");
        }
        }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
