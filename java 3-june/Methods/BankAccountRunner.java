class BankAccountRunner
{
  public static void main(String[] args)
  {

  BankAccount.credit( 30000);
  double totalAmount = BankAccount.getbalance();
  System.out.println("Balance is:"- totalAmount);
  
  BankAccount.credit( 25000);
  double totalAmount = BankAccount.getbalance();
  System.out.println("Balance is:"- totalAmount);
  
  BankAccount.credit( 40000);
  double totalAmount = BankAccount.getbalance();
  System.out.println("Balance is:"- totalAmount);
  
  
  BankAccount.debit( 50000);
  double totalAmount = BankAccount.getbalance();
  System.out.println("Balance is:"- totalAmount);
 
  
  BankAccount.debit( 45000);
  double totalAmount = BankAccount.getbalance();
  System.out.println("Balance is:"- totalAmount);
 
  }