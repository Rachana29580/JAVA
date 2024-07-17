class BarRunner
{

	public static void main(String drinks[])
	{
	
		boolean isAdded = Bar.addWineBrands("Red Wine");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Knights Bridge");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Tinhorn Creek");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("White Wine");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Sparkling Wine");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Myra Misfit");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Suls Rasa Shiraz");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Grover La Reserve");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Charosa");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Sula Chenin Blanc");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Zampa Soiree Brut");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("J'noon White");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Belstar Cult Prosecco");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Crios Torrontes");
		System.out.println("is Brand Added : " + isAdded);
		
		isAdded = Bar.addWineBrands("Riesling");
		System.out.println("is Brand Added : " + isAdded);
		
	Bar.getAllBrands();
	boolean newWineBrandUpdate=Bar.updateWineBrand(" Zampa Soiree Brut"," York Arros");
	Bar.getAllBrands();
	
	 Bar.deleteWineBrand("Belstar Cult Prosecco");
	 Bar.getAllBrands();
	}


}