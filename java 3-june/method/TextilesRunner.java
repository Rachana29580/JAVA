class TextilesRunner
{

	public static void main(String clothes[])
	{
	
		boolean isAdded = Textiles.addMaterial("cotton");
		System.out.println("is Appliance Added : " + isAdded); 
		
		 isAdded = Textiles.addMaterial("Mysore silk");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Textiles.addMaterial("linen");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Textiles.addMaterial("chiffon");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Textiles.addMaterial("crepe");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Textiles.addMaterial("Denim");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Textiles.addMaterial("Jute");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Textiles.addMaterial("Satin");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Textiles.addMaterial("Leather");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Textiles.addMaterial("Traffeta");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Textiles.addMaterial("Tweed");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Textiles.addMaterial("Fabric");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Textiles.addMaterial("Cheese cloth");
		System.out.println("is Appliance Added : " + isAdded);
		
		 isAdded = Textiles.addMaterial("Polyster");
		System.out.println("is Appliance Added : " + isAdded);
		
		
		Textiles.getAllMaterial();
	boolean newMaterialUpdate=Textiles.updateMaterial("Rayon"," Traffeta");
	Textiles.getAllMaterial();
	
	 Textiles.deleteMaterialName("Cheese cloth");
	 Textiles.getAllMaterial();
	}


}