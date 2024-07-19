class AtmMachine 
{
  String types;
  int pincode;
  String place;
  
 public boolean createAtmMachine(String types, int pincode,  String place )
	{
      	boolean isCreated = false;
		if(types != null && pincode > 0 && place != null)
		{
		this.types = types;
		this.pincode = pincode;
		
		this.place = place;
		
		isCreated = true ; 
	    }return isCreated ; 
	}
	public void displayAtmMachineInfo()
	{
		System.out.println("--------------------------------------");
		System.out.println("The types is: "+ this.types);
		System.out.println("The Pin Code  is: "+ this.pincode);
		System.out.println("The place is: "+ this.place);
  }
}
