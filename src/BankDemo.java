public class BankDemo
{
  public static void main(String [] args)
   {
      CheckingAccount c = new CheckingAccount(101);
      try
  {
       c.deposit(1500.00);	 
       System.out.println("Depositing Rs1500...");
       c.withdraw(600.00);
       System.out.println("Withdrawing Rs600..");
       c.withdraw(1000.00);
       System.out.println("Withdrawing Rs1000...");  
  }
      catch(InsufficientFundsException e)
   {
    System.out.println("Sorry you are short Rs" +e.getAmount());
    e.printStackTrace();
   }
}
} 