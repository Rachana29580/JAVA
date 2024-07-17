class MixerRunner
{
	public static void main(String mix[])
	{
		System.out.println("main started");
		Mixer.onOrOff();
		Mixer.increaseMixerSpeed();
		System.out.println("main ended");
	}

}