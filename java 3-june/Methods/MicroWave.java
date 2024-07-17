class MicroWave
{
	static boolean isConnected;
	static int currentMicroWaveTemperature;
	static int minMicroWaveTemperature;
	static int maxMicroWaveTemperature = 6; 
	
	public static void onOrOff()
	{
		System.out.println("onOrOff() started");
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println("Microwave Turned on");
		}else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("MicroWave Turned off");
		}
		System.out.println("onOrOff() ended"); 
		return;
	}
	
	public static void increaseMicroWaveTemperature()
	{
		System.out.println("increaseMicroWaveTemperature() started");
		if(isConnected == true)
		{
			if(currentMicroWaveTemperature < maxMicroWaveTemperature)
			{
				currentMicroWaveTemperature = currentMicroWaveTemperature + 1;
				System.out.println("The current MicroWave Temperature is " + currentMicroWaveTemperature);
			}else
			{
				System.out.println("MicroWave Max Temperature Reached");
			}
		}else
		{
			System.out.println("Gubee... MicroWave na On Maadu...");
		}
		
		System.out.println("increaseMicroWaveTemperature() ended");
		return ;
		
	}


}