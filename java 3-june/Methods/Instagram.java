class Instagram
{
	static String userNm;
	static String dob;
	static long pNo;
	static String emailId;
	static String pwd;
	
	public static boolean createaccount(String userName, String dob, long phoneNumber, String emailid , String pwd)
	{
		boolean isusernamevalid;
		boolean isdobvalid;
		boolean isphonenumbervalid;
		boolean isemailidvalid;
		boolean ispasswordvalid;
		
		boolean isuserexist=true;
		
		if(userName != null)
		{
		userNm=userName;
		isusernamevalid=true;
		}
		else{
			System.out.println("Please provide the proper username");
		}
		if(dob != null)
		{
		doB=dob;
		isdobvalid=true;
		}
		else{
			System.out.println("please provide correct date of birth");
		}
		if(phoneNumber > 0)
		{
		pNo=phoneNumber;
		isphonenumbervalid=true;
		}
		else{
			System.out.println("please provide proper phone number");
		}
		if(emailid != null)
		{
		emailId=emailid;
		isemailidvalid=true;
		}
		else{
			System.out.println("Please mention your login id");
		}
		if(password != null)
		{
		pwd=password;
		ispasswordvalid=true;
		}
		else{
			System.out.println("I think you forgot your password");
		}
		
		return isuserexist;
	}
	public static void getaccount()
	{
		System.out.println("The name of the useer is: "+userNm);
		System.out.println("wish the user on: "+doB);
		System.out.println("The contact details of the user is: "+pNo);
	    System.out.println("The gmail of the user is: "+emailId);
		System.out.println("The password of the user is: "+pwd);
		
		
		System.out.println("The gmail of the user is: "+emailId);
}
}
		