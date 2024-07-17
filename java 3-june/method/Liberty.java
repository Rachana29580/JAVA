import java.util.Arrays;
class Liberty
{
	static String brandNames[] = {null, null, null, null, null, null, null,null ,null,null,null,null,null,null, null};
	static int Index;
	public static boolean addShoeBrand(String brandName)
	{
		boolean isbrandnameCreated = false;
		System.out.println("addShoeBrand started..!");
		if(brandName != null)
		{
			brandNames[Index++] = brandName;
			isbrandnameCreated = true;
		}else 
			System.out.println("Shoe brand name is null, cannot be null");
		System.out.println("addShoeBrand ended..!");
		return isbrandnameCreated;
		
	}
	
	public static void getAllShoeBrand(){
		
		System.out.println(".........");
		
		System.out.println("Shoe Brand Are : ");
		for(String brandName : brandNames) 
			System.out.println(brandName);
		
	}
public static boolean updateShoeBrand(String oldShoeBrand , String newShoeBrand)
{
	System.out.println("updateShoeBrand Started");
	boolean isShoeBrandUpdated = false;
	for(int index=0; index <brandNames.length;index++){
		if(oldShoeBrand == brandNames[index]){
			brandNames[index]=newShoeBrand;
			isShoeBrandUpdated=true;
		}
	}
	if(isShoeBrandUpdated==false){
		System.out.println(oldShoeBrand+"not found");
	}
	System.out.println("updateShoeBrand ended");
	return isShoeBrandUpdated;
}
	  public static boolean deleteShoeBrand(String shoeBrandTobeDeleted)
	 {
		 System.out.println("deleteShoeBrand started");
		 boolean isshoeBrandDeleted =false;
		 int newIndex , oldIndex;
		 for( newIndex=0, oldIndex=0; oldIndex < brandNames.length ; oldIndex++){
		 if(brandNames[oldIndex] != shoeBrandTobeDeleted)
		 {
			 brandNames[newIndex] = brandNames[oldIndex];
			 newIndex++;
		 }
	 }
	 brandNames = Arrays.copyOf(brandNames , newIndex);
	 if(brandNames != null){
		 isshoeBrandDeleted = true;
	 }
	 if(isshoeBrandDeleted == false){
		 System.out.println(shoeBrandTobeDeleted + "Not found");
	 }
	 System.out.println("deleteShoeBrand ended");
	 return isshoeBrandDeleted;
}

}