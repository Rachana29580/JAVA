class NewsPaper
{
  String companyName;
  int id;
  int noOfPages;
  String language;
  double price;
  
 public boolean createNewsPaper(String companyName, int id, int noOfPages, String language, double price)
	{
      	boolean isCreated = false;
		if(companyName != null && id > 0 && noOfPages > 0 && language != null && price > 0.0 )
		{
		this.companyName = companyName;
		this.id = id;
		this.noOfPages = noOfPages;
		this.language = language;
		this.price = price;
		
		isCreated = true ; 
	    }return isCreated ; 
	}
	public void displayNewsPaperInfo()
	{
		System.out.println("--------------------------------------");
		System.out.println("The companyName is: "+ this.companyName);
		System.out.println("The id  is: "+ this.id);
		System.out.println("The no of pages  is: "+ this.noOfPages);
		System.out.println("The language is: "+ this.language);
		System.out.println("The price is :" +this.price);
  }
}