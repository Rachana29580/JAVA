class Mixer
{
	static boolean isConnected;
	static int currentMixerSpeed;
	static int minMixerSpeed;
	static int maxMixerSpeed = 5;

	public static void onOrOff()
	{
		System.out.println("onOrOff() started");
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println("Mixer Turned on");
		}else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("Mixer Turned off");
		}
		System.out.println("onOrOff() ended");
		return;
	}
	
	public static void increaseMixerSpeed()
	{
		System.out.println("increaseMixerSpeed() started");
		if(isConnected == true)
		{
			if(currentMixerSpeed < maxMixerSpeed)
			{
				currentMixerSpeed = currentMixerSpeed + 1;
				System.out.println("The current Mixer Speed is " + currentMixerSpeed);
			}else
			{
				System.out.println("Mixer Max Speed Reached");
			}
		}else
		{
			System.out.println("Gubee... Mixer na On Maadu...");
		}
		
		System.out.println("increaseMixerSpeed() ended");
		return ;
		
	}

}