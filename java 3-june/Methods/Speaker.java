class Speaker
{

	static boolean isConnected;
	static int currentSpeakerVolume;
	static int minSpeakerVolume;
	static int maxSpeakerVolume = 10;

	public static void onOrOff()
	{
		System.out.println("onOrOff() started");
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println("Speaker Turned on");
		}else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("Speaker Turned off");
		}
		System.out.println("onOrOff() ended");
		return;
	}
	
	public static void increaseSpeakerVolume()
	{
		System.out.println("increaseSpeakerVolume() started");
		if(isConnected == true)
		{
			if(currentSpeakerVolume < maxSpeakerVolume)
			{
				currentSpeakerVolume = currentSpeakerVolume + 1;
				System.out.println("The current Volume is " + currentSpeakerVolume);
			}else
			{
				System.out.println("Speaker Max Volume Reached");
			}
		}else
		{
			System.out.println("Gubee... Speaker na On Maadu...");
		}
		
		System.out.println("increaseSpeakerVolume() ended");
		return ;
		
	}
	

}