import java.util.Arrays;
class Textiles
{
	
	static String materialNames[] = {null, null, null, null, null, null, null, null, null,null, null, null,null ,null};
	static int Index;
	public static boolean addMaterial(String materialName)
	{
		boolean isMaterialNameCreated = false;
		System.out.println("addMaterial started..!");
		if(materialName != null)
		{
			materialNames[Index++] = materialName;
			isMaterialNameCreated = true;
		}else System.out.println("Material Nameis null, cannot be null");
		
		
		System.out.println("addMaterial ended..!");
		return isMaterialNameCreated;
		
	}
	
	public static void getAllMaterial(){
		
		System.out.println("Material Are : ");
		for(String materialName : materialNames) 
			System.out.println(materialName);
		
	}
public static boolean updateMaterial(String oldMaterial , String newMaterial)
{
	System.out.println("updateMaterial Started");
	boolean isMaterialNameUpdated = false;
	for(int index=0; index <materialNames.length;index++){
		if(oldMaterial == materialNames[index]){
			materialNames[index]=newMaterial;
			isMaterialNameUpdated=true;
		}
	}
	if(isMaterialNameUpdated==false){
		System.out.println(oldMaterial+"not found");
	}
	System.out.println("updateMaterial ended");
	return isMaterialNameUpdated;
	
}	
	  public static boolean deleteMaterialName(String materialNameTobeDeleted)
	 {
		 System.out.println("deleteMaterialName started");
		 boolean ismaterialNameDeleted =false;
		 int newIndex , oldIndex;
		 for( newIndex=0, oldIndex=0; oldIndex < materialNames.length ; oldIndex++){
		 if(materialNames[oldIndex] != materialNameTobeDeleted)
		 {
			 materialNames[newIndex] = materialNames[oldIndex];
			 newIndex++;
		 }
	 }
	 materialNames = Arrays.copyOf(materialNames , newIndex);
	 if(materialNames != null){
		 ismaterialNameDeleted = true;
	 }
	 if(ismaterialNameDeleted == false){
		 System.out.println(materialNameTobeDeleted + "Not found");
	 }
	 System.out.println("deleteMaterialName ended");
	 return ismaterialNameDeleted;
}

}