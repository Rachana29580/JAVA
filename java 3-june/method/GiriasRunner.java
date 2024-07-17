class GiriasRunner
{

	public static void main(String shop[])
	{
	
		boolean isAdded = Girias.addHomeAppliance("Fan");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Girias.addHomeAppliance("Television");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Girias.addHomeAppliance("AirConditioner");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Girias.addHomeAppliance("Cooler");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Girias.addHomeAppliance("Freezer");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Girias.addHomeAppliance("Kettle");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Girias.addHomeAppliance("Head Phone");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Girias.addHomeAppliance("Mobile Phone");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Girias.addHomeAppliance("Smart Watch");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Girias.addHomeAppliance("Ear buds");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Girias.addHomeAppliance("Laptop");
		System.out.println("is Appliance Added : " + isAdded);
		
		isAdded = Girias.addHomeAppliance("Speaker");
		System.out.println("is Appliance Added : " + isAdded);
		
		
			Girias.getHomeAppliance();
	boolean newHomeApplicationUpdate=Girias.updateHomeAppliance("Cooler","Water Heater");
	Girias.getHomeAppliance();
	
	Girias.deleteHomeAppliances("Speaker");
	Girias.getHomeAppliance();
	}


}