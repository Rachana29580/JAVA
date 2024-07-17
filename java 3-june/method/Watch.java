import java.util.Arrays;
class Watch
{
  static String watchBrandNames[] = {null,null,null,null,null,null,null,null,null,null};
  static int index;
  public static boolean addWatchBrandName (String watchBrandName)
  {
	  boolean isWatchBrandNamecreate=false;
	  System.out.println( "addWatchBrandName started " );
	  if(watchBrandName!= null)
	  {
        watchBrandNames[index++]=watchBrandName;
		isWatchBrandNamecreate = true;
	  }else
		  System.out.println("Watch Brand name is null,connot be null");
  
  System.out.println("addWatchBrandName ended");
  return isWatchBrandNamecreate;
  }
    public static void getWatchBrandName()
	{
		System.out.println("Watch brand names are:");
		for(String WatchBrandName : watchBrandNames)
			System.out.println(WatchBrandName);
	}
	public static  boolean updateWatchBrandName(String oldWatchBrandName ,String newWatchBrandName)
	{
		System.out.println("updateWatchBrandName started");
		boolean iswatchBrandNameUpdated=false;
		for(int index=0;  index <watchBrandNames.length; index++){
			if( oldWatchBrandName == watchBrandNames[index]){
				        watchBrandNames[index]=newWatchBrandName;
					iswatchBrandNameUpdated=true;
	}
}
     if(iswatchBrandNameUpdated==false){
     System.out.println(oldWatchBrandName + "not found");	
}

    System.out.println("updateWatchBrandName ended");
    return 	iswatchBrandNameUpdated;
	
	}
     public static boolean deletewatchBrandName(String watchBrandNameTobeDeleted)
	 {
		 System.out.println("deletewatchBrandName started");
		 boolean iswatchBrandNameDeleted =false;
		 int newIndex , oldIndex;
		 for( newIndex=0, oldIndex=0; oldIndex < watchBrandNames.length ; oldIndex++){
		 if(watchBrandNames[oldIndex] != watchBrandNameTobeDeleted)
		 {
			 watchBrandNames[newIndex] = watchBrandNames[oldIndex];
			 newIndex++;
		 }
	 }
	 watchBrandNames = Arrays.copyOf(watchBrandNames , newIndex);
	 if(watchBrandNames != null){
		 iswatchBrandNameDeleted = true;
	 }
	 if(iswatchBrandNameDeleted == false){
		 System.out.println(watchBrandNameTobeDeleted + "Not found");
	 }
	 System.out.println("deletewatchBrandName ended");
	 return iswatchBrandNameDeleted;
	
	}
					
}					
					
					
					