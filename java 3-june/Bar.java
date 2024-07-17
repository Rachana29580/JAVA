import java.util.Arrays;
class Bar
{
	
	static String wineBrands[] = {null, null, null, null, null, null, null, null};
	static int Index;
	public static boolean addWineBrands(String wineBrand)
	{
		boolean isWineBrandCreated = false;
		System.out.println("addWineBrands started..!");
		if(wineBrand != null)
		{
			wineBrands[Index++] = wineBrand;
			isWineBrandCreated = true;
		}else System.out.println("Wine Brand is null, cannot be null");
		
		
		System.out.println("addWineBrands ended..!");
		return isWineBrandCreated;
		
	}
	
	public static void getAllBrands(){
		
		System.out.println("---------------------");
		
		System.out.println("Wine Brand Are : ");
		for(String wineBrand : wineBrands) 
			System.out.println(wineBrand);
		
	}
public static boolean updateWineBrand(String oldWineBrand , String newWineBrand)
{
	System.out.println("updateWineBrand Started");
	boolean isWineBrandUpdated = false;
	for(int index=0; index <wineBrands.length;index++){
		if(oldWineBrand == wineBrands[index]){
			wineBrands[index]=newWineBrand;
			isWineBrandUpdated=true;
		}
	}
	if(isWineBrandUpdated==false){
		System.out.println(oldWineBrand+"not found");
	}
	System.out.println("updateWineBrand ended");
	return isWineBrandUpdated;
	
}	
	  public static boolean deleteWineBrand(String wineBrandTobeDeleted)
	 {
		 System.out.println("deleteWineBrand started");
		 boolean iswineBrandDeleted =false;
		 int newIndex , oldIndex;
		 for( newIndex=0, oldIndex=0; oldIndex < wineBrands.length ; oldIndex++){
		 if(wineBrands[oldIndex] != wineBrandTobeDeleted)
		 {
			 wineBrands[newIndex] = wineBrands[oldIndex];
			 newIndex++;
		 }
	 }
	 wineBrands = Arrays.copyOf(wineBrands , newIndex);
	 if(wineBrands != null){
		 iswineBrandDeleted = true;
	 }
	 if(iswineBrandDeleted == false){
		 System.out.println(wineBrandTobeDeleted + "Not found");
	 }
	 System.out.println("deleteWineBrand ended");
	 return iswineBrandDeleted;
}

}