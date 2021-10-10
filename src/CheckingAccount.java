public class CheckingAccount
{
 private double balance;
 private int number;
 public CheckingAccount(int number1)
  {
   number = number1;
  }
 public void deposit(double amount)
 {
   balance = balance + amount;
   System.out.println("In deposit method balance is:" +balance);
 }
 public void withdraw(double amount) throws InsufficientFundsException
{
 if(amount <= balance)
  {
    balance -= amount;
  System.out.println("In withdraw method if block balance is:" + balance);
  }
else
{
   System.out.println("In withdraw method else");
   double needs = amount - balance;
   throw new InsufficientFundsException(needs);
}
}
}   