package day35_Escapsulation;

public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber) {
       setAccountHolder(accountHolder);
       setAccountNumber(accountNumber);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    // did not generate setter for balance, because balance should only be set when deposit() & withdraw() methods are being executed

    public void deposit(double amount){
        if (amount<=0){
            System.err.println("Deposit can not be zero or negative");
            System.exit(1);
        }
        System.out.println("Depositing $"+amount+" to the account "+ accountNumber);
        balance+=amount;

    }
    public void withdraw(double amount){
        if (amount>balance || amount<=0){
            System.err.println("Invalid Balance");
            System.exit(0);
        }
        if(balance <= 0){
            System.err.println("Insufficient balance");
            System.exit(1);
        }
        balance-=amount;
        System.out.println("withdrawing $"+amount+" to the account "+ accountNumber);
    }
    public void checkBalance(){
        System.out.println(balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
/*
3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments
 */