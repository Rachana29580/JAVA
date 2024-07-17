class Npr
{
   public static void main(String[] fact)
   {
    
	System.out.println("Main method started");
	// npr = n!/(n-r)!
	int factNumber = 10;
	int numThing = 4;
	
	  int npr = Factorial.getFact(factNumber)/Factorial.getFact(Factorial.totalNumberofThings(factNumber,numThing));
	  System.out.println("The final result is:" + nPr);
	  System.out.println("Main method ended");
   }
}
	