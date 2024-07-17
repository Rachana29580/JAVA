class RedChilliesEntertainment
{
	
	static String movieActors[] = {null, null, null, null, null, null, null, null, null};
	static int Index;
	public static boolean addMovieActor(String movieActor)
	{
		boolean isMovieActorCreated = false;
		System.out.println("addMovieActor started..!");
		if(movieActor != null)
		{
			movieActors[Index++] = movieActor;
			isMovieActorCreated = true;
		}else System.out.println("Movie Actor is null, cannot be null");
		
		
		System.out.println("addMovieActor ended..!");
		return isMovieActorCreated;
		
	}
	
	public static void getMovieActor(){
		
		System.out.println("---------------------");
		
		System.out.println("Movie Actor Are : ");
		for(String movieActor : movieActors) 
			System.out.println(movieActor);
		
	}
public static boolean updateMovieActor(String oldMovieActor , String newMovieActor)
{
	System.out.println("updateMovieActor Started");
	boolean isMovieActorUpdated = false;
	for(int index=0; index <movieActors.length;index++){
		if(oldMovieActor == movieActors[index]){
			movieActors[index]=newMovieActor;
			isMovieActorUpdated=true;
		}
	}
	if(isMovieActorUpdated==false){
		System.out.println(oldMovieActor+"not found");
	}
	System.out.println("updateMovieActor ended");
	return isMovieActorUpdated;
	
}
 public static boolean deleteMovieActor(String movieActorTobeDeleted)
	 {
		 System.out.println("deleteMovieActor started");
		 boolean isMovieActorDeleted =false;
		 int newIndex , oldIndex;
		 for( newIndex=0, oldIndex=0; oldIndex < movieActors.length ; oldIndex++){
		 if(movieActors[oldIndex] != movieActorTobeDeleted)
		 {
			 movieActors[newIndex] = movieActors[oldIndex];
			 newIndex++;
		 }
	 }
	 movieActors = Arrays.copyOf(movieActors , newIndex);
	 if(movieActors != null){
		 isMovieActorDeleted = true;
	 }
	 if(isMovieActorDeleted == false){
		 System.out.println(movieActorTobeDeleted + "Not found");
	 }
	 System.out.println("deleteMovieActor ended");
	 return isMovieActorDeleted;

     }
}