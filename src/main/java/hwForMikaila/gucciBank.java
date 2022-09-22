package hwForMikaila;

public class gucciBank {
    public static void main(String[] args) {

        Account vanGucci = new Account("Van Gucci",1,00);
        vanGucci.deposit(200);//Deposit first
        vanGucci.deposit(-500);//Try to take negative amount it won't allow you
        vanGucci.deposit(10);//more deposit
        vanGucci.deposit(5000);//bigger deposit
        vanGucci.withdraw(1000);//try to withdraw
        System.out.println(vanGucci.getBalance());//display current balance
        vanGucci.withdraw(4000);//transaction will be canceled if you try to take over your amount deposited
        System.out.println(vanGucci.getBalance());

        //could've did more with it but I didn't have enough time :)


    }
}
