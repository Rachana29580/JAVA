class LIC {
		static String nam;
		static String db; 
		static String sta;
	    static int mNo;
		static String dist;
		static String ain;
		static String pro;
		 	 
public static boolean createLIC(String name, int mobileNumber, String products, String state, String district , String dob , String annualIncome){ 
         
		 boolean isLICDataCreated =false;
		 nam = name;
		 mNo =mobileNumber;
		 sta =state;
		 pro =products;
		 db=dob;
		 dist = district;
		 ain = annualIncome;
		 return isLICDataCreated; 
}    
         public static void getLICDetails() {
		 System.out.println("Mobile Number:" +mNo);
		 System.out.println("Products :" +pro);
		 System.out.println(" DOB :" +db);
		 System.out.println("State :" +sta);
		 System.out.println("Name:" +nam);
		 System.out.println("district :" +dist);
		 System.out.println("Annual Income:" +ain);
		 }
		  }