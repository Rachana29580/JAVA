import java.util.Arrays;
class Gym
{
	
	static String equipmentNames[] = {null, null, null, null, null, null, null, null};
	static int Index;
	public static boolean addEquipmentName(String equipmentName)
	{
		boolean isEquipmentNameCreated = false;
		System.out.println("addEquipmentName started..!");
		if(equipmentName != null)
		{
			equipmentNames[Index++] = equipmentName;
			isEquipmentNameCreated = true;
		}else System.out.println("Equipment Name is null, cannot be null");
		
		
		System.out.println("addEquipmentName ended..!");
		return isEquipmentNameCreated;
		
	}
	
	public static void getEquipmentName(){
			
		System.out.println("Equipment Name Are : ");
		for(String equipmentName : equipmentNames) 
			System.out.println(equipmentName);
		
	}
public static boolean updateEquipmentName(String oldEquipmentName , String newEquipmentName)
{
	System.out.println("updateEquipmentName Started");
	boolean isEquipmentNameUpdated = false;
	for(int index=0; index <equipmentNames.length;index++){
		if(oldEquipmentName == equipmentNames[index]){
			equipmentNames[index]=newEquipmentName;
			isEquipmentNameUpdated=true;
		}
	}
	if(isEquipmentNameUpdated==false){
		System.out.println(oldEquipmentName+"not found");
	}
	System.out.println("updateEquipmentName ended");
	return isEquipmentNameUpdated;
	}
	     public static boolean deleteEquipmentName(String equipmentNameTobeDeleted)
	 {
		 System.out.println("deleteEquipmentName started");
		 boolean isEquipmentNameDeleted =false;
		 int newIndex , oldIndex;
		 for( newIndex=0, oldIndex=0; oldIndex < equipmentNames.length ; oldIndex++){
		 if(equipmentNames[oldIndex] != equipmentNameTobeDeleted)
		 {
			 equipmentNames[newIndex] = equipmentNames[oldIndex];
			  }
	 }
	 equipmentNames = Arrays.copyOf(equipmentNames , newIndex);
	 if(equipmentNames != null){
		 isEquipmentNameDeleted = true;
		  }
	 if(isEquipmentNameDeleted == false){
		 System.out.println(equipmentNameTobeDeleted + "Not found");
	 }
	 System.out.println("deleteEquipmentName ended");
	 return isEquipmentNameDeleted;
	 
	 }	


}