class Hospital
{
	static String name;
	static String dob;
	static String address;
	static String email; 
	static int phoneNum;
	static long addharNum; 
	static String rationCard ; 
	static String job; 
	
	
	public static boolean createHospital(String name ,String dob, String address, String email,int phoneNum, long addharNum, String rationCard,String job)
	{
	boolean isHospitalDataCreated =false;
	
	if(name !=null && dob !=null && address !=null && email !=null && phoneNum !=null && addharNum !=num && rationCard !=null && job !=null)
	{
	nme = name;
	dob=dob;
	adr  =address;
	eml =email;
	phNum=phoneNum;
	adNum =addharNum;
	ratCd =rationCard;
	job =job;
	
	isHospitalDataCreated=true;
	}
	else
	{
		System.out.println("Please provide a valid name/dob/address/email/phoneNum/addharNum/rationCard/job");
	}
	return isHospitalDataCreated;
	}
	public static void getHospitalDetails()
	{	
	System.out.println("The name is:" +nme);
	System.out.println("The dob is:" + dob);
	System.out.println("The address is:" +adr);
	System.out.println("The email is:" + eml);
	System.out.println("The phoneNum is:" + phnNum);
	System.out.println("The addharNum is:" +adNum);
	System.out.println("The rationCard is:" + ratCd);
	System.out.println("The job is:" +job);
	
}
}
