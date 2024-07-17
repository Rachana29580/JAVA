import java.util.Arrays;
class ChatShop
{
	static String name = "";
	static String ownerName = "";
	
	static String chatNames[] = {null, null, null, null, null, null};
	//static double chatPrices[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	static int chatIndex;
	static int priceIndex;
	public static boolean addChatName(String chatName)
	{
		boolean isChatNameCreated = false;
		System.out.println("addChatName started..!");
		if(chatName != null)
		{
			chatNames[chatIndex++] = chatName;
			isChatNameCreated = true;
		}else System.out.println("Chat name is null, cannot be null");
		
		
		System.out.println("addChatName ended..!");
		return isChatNameCreated;
		
	}
	
	/*public static boolean addChatPrice(double chatPrice)
	{
		boolean isChatPriceAdded = false;
		System.out.println("addChatPrice started..!");
		if(chatPrice > 0.0)
		{
			chatPrices[priceIndex++] = chatPrice;
			isChatPriceAdded = true;
		}else System.out.println("Chat Price cannot be zero");
		
		
		System.out.println("addChatPrice ended..!");
		return isChatPriceAdded;
		
	}*/
	
	
	public static void getChatName(){
		
		System.out.println("------------------------");
		
		System.out.println("Chat Names Are : ");
		for(String chatName : chatNames) 
			System.out.println(chatName);
		
	}
/*	public static void getChatPrice(){
		
		System.out.println("-------------------------");
		
		System.out.println("Chat Price Are : ");
		for(double chatPrice : chatPrices) System.out.println(chatPrice);
		
	}*/
     public static boolean updateChartName(String oldChatName , String newChatName)
{
	System.out.println("updateChartName Started");
	boolean isChatNameUpdated = false;
	for(int index=0; index <chatNames.length;index++){
		if(oldChatName == chatNames[index]){
			chatNames[index]=newChatName;
			isChatNameUpdated=true;
		}
	}
	if(isChatNameUpdated==false){
		System.out.println(oldChatName+"not found");
	}
	System.out.println("updateChartName ended");
	return isChatNameUpdated;
	
}
     public static boolean deleteChatName(String chatNameTobeDeleted)
	 {
		 System.out.println("deleteChatName started");
		 boolean isChatNameDeleted =false;
		 int newIndex , oldIndex;
		 for( newIndex=0, oldIndex=0; oldIndex < chatNames.length ; oldIndex++){
		 if(chatNames[oldIndex] != chatNameTobeDeleted)
		 {
			 chatNames[newIndex] = chatNames[oldIndex];
			 newIndex++;
		 }
	 }
	 chatNames = Arrays.copyOf(chatNames , newIndex);
	 if(chatNames != null){
		 isChatNameDeleted = true;
	 }
	 if(isChatNameDeleted == false){
		 System.out.println(chatNameTobeDeleted + "Not found");
	 }
	 System.out.println("deletedChatName ended");
	 return isChatNameDeleted;
	 
	 }
}
	 