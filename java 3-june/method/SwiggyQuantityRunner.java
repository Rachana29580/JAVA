class SwiggyQuantityRunner
{
  public static void main(String[] food)
  {
	  System.out.printtln("Main Started");
	  double output = SwiggyQuantity.takeOrder("pizza" , 2);
	  System.out.printtln(output);
	  double value = SwiggyQuantity.takeOrder("Buger" , 2);
	  System.out.printtln(value);
	  System.out.printtln("Main Ended");
  }
}
	  