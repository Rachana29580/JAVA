class Swiggy
 { 
    public static double takeOrder(String[] foodname)
	{
	  double price = 0.0;
	  if(foodName == "pizza") 
{	  
	      price = 99.00;
		  return price;
		  }
	  
	  
	  if(foodName == "Burger")  
	  {
	      price = 108.00;
		  return price;
	 }
		  
	    
	  if(foodName == "Momos")  
	  {
          price = 199.00;
		  return price;
	}
	else
	{
	System.out.printtln(foodName +" Not Found");
	return price;
	}
	public static double takeOrder(String foodName , int quantity)
	{
	double price = 0.0;
	if(foodName == "pizza")
	{
	price = 99.00 * Quantity;
	return price;
	}
	    
	   if(foodName == "Burger")
	{
	   price = 108.00 * Quantity;
	   return price;
	}
	   return price;
	}