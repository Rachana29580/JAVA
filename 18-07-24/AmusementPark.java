class AmusementPark 
{
  int noOfGames;
  String place;
  String name;
  
public boolean createAmusementPark( int noOfGames, String place, String name)
	{
      	boolean isCreated = false;
		if( noOfGames > 0  && place != null && name != null )
		{
		
		this.noOfGames = noOfGames;
		this.place = place;
		this.name = name;
		
		isCreated = true ; 
	    }return isCreated ; 
	}
	public void displayAmusementParkInfo()
	{
		System.out.println("--------------------------------------");
		
		System.out.println("The No Of Games  is: "+ this.noOfGames);
		System.out.println("The Place is: "+ this.place);
		System.out.println("The Name is :" +this.name);
  }
}
