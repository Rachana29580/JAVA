class JobApplication
{
        static String nam;
	    static String db;
	    static String gen;
		static String eml;
		static String add;
		static int pNo;
		
		 	 
      public static boolean createJobApplication(String name, String dob, String gender,String email, String address ,int phoneNum ) { 
         
		 boolean isJobApplicationDataCreated = false;
		 
		 nam = name;
		 db = dob;
		 gen = gender;
		 eml = email;
		 add = address;
		 pNo = phoneNum;
		
		   
		 return isJobApplicationDataCreated; 
}    

         public static void getJobApplicationDetails()
		 {
         System.out.println("The user Name is:" + nam);
		 System.out.println("The date of birth is:" + db);
		 System.out.println("The Gender is:" + gen);
		 System.out.println("The Email Id  is:" + eml);
		 System.out.println("The Address is:" +  add);
		 System.out.println("The Phone Number is:"+ pNo);
		 
		  
		 }
		  }
		 
		 
		 
		 
		 
