class AirConditioner
{
	static boolean isconnected = true;
		static int currenttemperature;
		static int mintemperature;
		static int maxtemperature = 6;

	public static void getfeature()
	{
		System.out.println("The getfeature started");
		String Brand = "Samsung";
		int price = 10000;
		System.out.println("The brand of the AirConditioner is:" +Brand);
		System.out.println("The price of the AirConditioner is:" + price);
		System.out.println("The getfeature ended");
	return;
	}
	public static void increasetemperature()
	{
		System.out.println("Increase temperature started");
		if(isconnected==true)
		{
			if(currenttemperature<maxtemperature)
			{
				currenttemperature=currenttemperature+1;
				System.out.println("The currenttemperature is"+currenttemperature);
			}
		else{
				System.out.println("Max temperature reached");
			}
		}else
		{
			System.out.println("Please switch on the AirConditioner");
		}
		System.out.println("Increase temperature ended");
		return;
	}
	
	public static void onoroff()
	{
	System.out.println("onoroff started");
	if(isconnected==false)
	{
		isconnected=true;
		System.out.println("The AirConditioner turned on");
	}
	else if(isconnected==true)
	{
		isconnected=false;
		System.out.println("The AirConditioner is turned off");
	}
	System.out.println("onoroff ended");
	}

}

	
