class AmazonPrime
{

static String TopMovies[]={"The Idea of You","Road House","Bottoms","Saltburn","The Burial"};
static String EnglishMovies[]={"A Hero","Psyco","AirPlane","Maverick","Blackklansman"};
static String KannadaMovies[]={"Kantara","KGf","Yuvarathna","Rathnan Prapancha","ACT 1978"};
static String HindiMovies[]={"The Lunchbox","Unpaused","Shikara","Ponniyin Selvan","Dilwale Dulhania Le Jayenge"};
static String KoreanSeries[]={"Taxi Driver","Strangers from Hell","Voice","The Doctors","Mr. Queen"};

public static void main(String[] ootplatform)
{
	System.out.println("The Top movies of prime is:");
	for(int index=0; index<=TopMovies.length-1; index++)
	{
		System.out.println(TopMovies[index]);
	}
	System.out.println("The Top English movies of prime is:");
	for(int index =0; index<=EnglishMovies.length-1; index++)
	{
		System.out.println(EnglishMovies[index]);
	}
	System.out.println("The Top Kannada movies of prime is:");
	for(int index=0; index<=KannadaMovies.length-1; index++)
	{
		System.out.println(KannadaMovies[index]);
	}
	System.out.println("The Top Hindi movies of prime is:");
	for(int index=0; index<=HindiMovies.length-1; index++)
	{
		System.out.println(HindiMovies[index]);
	}
	
	System.out.println("The Top Korean movies of prime is:");
	for(int index=0; index<=KoreanSeries.length-1; index++)
	{
		System.out.println(KoreanSeries[index]);
	}
	
}
}


