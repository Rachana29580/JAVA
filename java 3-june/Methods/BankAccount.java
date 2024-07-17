class BankAccount
{
  static double balance;
  
       public static void debit(double amount)
	   {
	   System.out.println("debit started");
	   balance = balance - amount;
	   if(amount <=balance)
	   {
		   else
			   System.out.println("Insuddicient funds");
	   System.out.println("debit ended");
	   return;
	   }
	   public static void credit(double amount)
	   {
	   System.out.println("credit started");
	   if(amount>=0)
	   balance = balance + amount;
	   }
	   else
	   {
		   System.out.println("Amount can't be zero");
	   }
	   System.out.println("credit ended");
	   return;
	   }
    public static double getbalance()
  {
      return balance;
  }
 }
	  