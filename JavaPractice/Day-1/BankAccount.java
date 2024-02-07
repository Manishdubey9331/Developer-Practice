/*Design a class named BankAccount with attributes
 accountNumber, accountHolder, and balance. 
 Include methods for deposit, withdrawal, and 
 displaying the balance. 
 Ensure that the balance is encapsulated and cannot be accessed directly. */

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private int balance;
    BankAccount(String  accountNumber, String accountHolder, int balance)
    {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(int amount)
    {
        this.balance+=amount;
        System.out.println("Successfully $"+ " "+amount+" "+"is deposited");
        System.out.println("Available amout is $"+" "+this.balance);

    }
    public void withdrawal(int amount)
    {
        this.balance-=amount;
        System.out.println("Successfully $"+ " "+amount+" "+"is withdraw");
        System.out.println("Available amout is 4"+" "+this.balance);
    }
    public void custmInfo()
    {
        System.out.println("Account Holder Name is "+" "+this.accountHolder);
        System.out.println("Account number is "+" "+this.accountNumber);
        System.out.println("Available amount is $"+" "+this.balance);
  }

  public static void main(String[] args) {
    BankAccount cust1 = new BankAccount("6096000100042285","MANISH DUBEY",2500);
    //cust1.custmInfo();
    cust1.deposit(3200);
    cust1.withdrawal(300);
  }
}

