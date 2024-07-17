class Myntra
{
	static String userNm;
	static String pwd;
	static long pNo;
	static String doB;
	static String emailId;
	
	public static boolean createaccount(String userName, String password, long phoneNumber, String dob, String emailid)
	{
		boolean isusernamevalid;
		boolean ispasswordvalid;
		boolean isphonenumbervalid;
		boolean isdobvalid;
		boolean isemailidvalid;
		
		boolean isuserexist=true;
		if(userName != null)
		{
		userNm=userName;
		isusernamevalid=true;
		}else{
			System.out.println("Please provide the proper username");
		}
		if(password != null)
		{
		pwd=password;
		ispasswordvalid=true;
		}else{
			System.out.println("I think you forgot your password");
		}
		if(phoneNumber > 0)
		{
		pNo=phoneNumber;
		isphonenumbervalid=true;
		}else{
			System.out.println("please provide proper phone number");
		}
		if(dob != null)
		{
		doB=dob;
		isdobvalid=true;
		}else{
			System.out.println("please provide correct date of birth");
		}
		if(emailid != null)
		{
		emailId=emailid;
		isemailidvalid=true;
		}else{
			System.out.println("Please mention your login id");
		}
		
		return isuserexist;
	}
	public static void getaccount()
	{
		System.out.println("The name of the useer is: "+userNm);
		System.out.println("The password of the user is: "+pwd);
		System.out.println("The contact details of the user is: "+pNo);
		System.out.println("wish the user on: "+doB);
		System.out.println("The gmail of the user is: "+emailId);
}
}
		