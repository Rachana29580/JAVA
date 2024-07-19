class Agarbathi
{
  String brandName;
  int noOfSticks;
  String fragnance;
  double price;
  
  public boolean createAgarbathi(String brandName, int noOfSticks, double price , String fragnance )
	{
      	boolean isCreated = false;
		if(brandName != null && noOfSticks > 0 && price > 0.0 && fragnance != null)
		{
		this.brandName = brandName;
		this.noOfSticks = noOfSticks;
		this.price = price;
		this.fragnance = fragnance;
		
		isCreated = true ; 
	    }return isCreated ; 
	}
	public void displayAgarbathiInfo()
	{
		System.out.println("--------------------------------------");
		System.out.println("The brand Name is: "+ this.brandName);
		System.out.println("The No Of Sticks  is: "+ this.noOfSticks);
		System.out.println("The price of Agarbathi is: "+ this.price);
		System.out.println("The Fragnance is: "+ this.fragnance);
		
  }
}