class RedChilliesEntertainmentRunner
{

	public static void main(String hero[])
	{
	
		boolean isAdded = RedChilliesEntertainment.addMovieActor("Nikil Kumarswami");
		System.out.println("is Actor Added : " + isAdded);
		
		isAdded = RedChilliesEntertainment.addMovieActor("Yash");
		System.out.println("is Actor Added : " + isAdded);
		
		isAdded = RedChilliesEntertainment.addMovieActor("Dhruva Surja");
		System.out.println("is Actor Added : " + isAdded);
		
		isAdded = RedChilliesEntertainment.addMovieActor("Ganesh");
		System.out.println("is Actor Added : " + isAdded);
		
		isAdded = RedChilliesEntertainment.addMovieActor("punith Rajkumar");
		System.out.println("is Actor Added : " + isAdded);
		
		isAdded = RedChilliesEntertainment.addMovieActor("Ravichandran");
		System.out.println("is Actor Added : " + isAdded);
		
		isAdded = RedChilliesEntertainment.addMovieActor("Sudeep");
		System.out.println("is Actor Added : " + isAdded);
		
		isAdded = RedChilliesEntertainment.addMovieActor("Prem");
		System.out.println("is Actor Added : " + isAdded);
		
		isAdded = RedChilliesEntertainment.addMovieActor("Darshan");
		System.out.println("is Actor Added : " + isAdded);
		
		
		
		
	RedChilliesEntertainment.getMovieActor ();
	boolean newMovieActorUpdate=RedChilliesEntertainment.updateMovieActor ("Darshan","Vijay");
	RedChilliesEntertainment.getMovieActor ();
	
     RedChilliesEntertainment.deleteMovieActor("Darshan");
	 RedChilliesEntertainment.getMovieActor();
	 
	 
     RedChilliesEntertainment.deleteMovieActor("Dhanveer");
	 RedChilliesEntertainment.getMovieActor();
	}


}       