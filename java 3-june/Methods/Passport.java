class Passport
{
	static String cprLoc;
	static int dcdrLoc;
	static String surNm;
	static String givenNm; 
	static String doB;
	static String eMail; 
	static boolean isemailLoginSm; 
	static String Pwd; 
	static String confirmPwd;
	static String hintQue;
	static String hintAnswer; 
	static String capthar;
	
	public static boolean createpassword(String cprLocation, int dcdrLocation, String surName, String givenName, String dob, String email, 
	boolean isemailLoginSame, String Password, String confirmPassword, String hintQ, String hintAns, String captha)
	{
	boolean isPasswordDataCreated =false;
	
	if(dcdrLocation>0 && surName!=null && givenName!=null && email!=null && hintQ!=null && hintAns!=null && cprLocation!=null && givenName!=null && 
	    dob!=null && isemailLoginSame!=false && Password!=null &&  confirmPassword!=null && captha!=null)
	{
	cprLoc=cprLocation;
	dcdrLoc=dcdrLocation;
	surNm=surName;
	givenNm=givenName;
	doB=dob;
	eMail=email;
	isemailLoginSm=isemailLoginSame;
	Pwd=Password;
	confirmPwd=confirmPassword;
	hintQue=hintQ;
	hintAnswer=hintAns;
	capthar=captha;
	isPasswordDataCreated=true;
	}else
	{
		System.out.println("Please provide a valid cprLocation/dcdrLocation/surName/givenName/dob/email/isemailLoginSame/Password/confirmPassword/hintQ/hintAns/captha");
	}
	return isPasswordDataCreated;
	}
	public static void getpassPassportDetails()
	{	
	System.out.println("The cprLocation is:" +cprLoc);
	System.out.println("The dcdrLocation is:" +dcdrLoc);
	System.out.println("The Surname is:" +surNm);
	System.out.println("The name of the user is:" +givenNm);
	System.out.println("The dob is:" +doB);
	System.out.println("The email of the user is:" +eMail);
	System.out.println("is we can login with the same emaiid:" +isemailLoginSm);
	System.out.println("The password is:" +Pwd);
	System.out.println("The confirmPassword is:" +confirmPwd);
	System.out.println("The hint question is:" +hintQue);
	System.out.println("The hint answer is:" +hintAnswer);
	System.out.println("The captha is :"+capthar);
}
}
