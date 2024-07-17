class GoldShopRunner
{

	public static void main(String shop[])
	{
	
		boolean isAdded = GoldShop.addGoldItem("short gold chain");
		System.out.println("is Gold Item Added : " + isAdded);
		
		isAdded = GoldShop.addGoldItem("Ring");
		System.out.println("is Gold Item Added : " + isAdded);
		
		isAdded = GoldShop.addGoldItem(" bangles");
		System.out.println("is Gold Item Added : " + isAdded);
		
		isAdded = GoldShop.addGoldItem("Barclets");
		System.out.println("is Gold Item Added : " + isAdded);
		
		isAdded = GoldShop.addGoldItem("Earings");
		System.out.println("is Gold Item Added : " + isAdded);
		
		isAdded = GoldShop.addGoldItem("Diamond ring");
		System.out.println("is Gold Item Added : " + isAdded);
		
		isAdded = GoldShop.addGoldItem("NecKlace");
		System.out.println("is Gold Item Added : " + isAdded);
		
		
    GoldShop.getGoldItem();
	boolean newGoldItemUpdate=GoldShop.updateGoldItem("Diamond ring","Pearl long chain");
	GoldShop.getGoldItem();
	
	GoldShop.deleteGoldItem("Ring");
	GoldShop.getGoldItem();
	}


}