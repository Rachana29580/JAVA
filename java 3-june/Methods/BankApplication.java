class BankApplication
  {
        static String nme;
	    static String eml;
	    static String add;
		static int phne;
		static int pan;
		static int adh;
		 	 
      public static boolean createBankApplication(String name, String emailId, String address, int phoneNumber, int panCard ,int  addharCard )
	  
	  { 
         
		 boolean isBankApplicationDataCreated = false;
		 
		 nme = name;
		 eml = emailId;
		 add = address;
		 phne = phoneNumber;
		 pan = panCard;
		 adh = addharCard;
		 
   return isBankApplicationDataCreated; 
}    

         public static void getBankApplicationDetails()
    {
         System.out.println("The Name  is:" + nme);
		 System.out.println("The  Email Id is:" + eml);
		 System.out.println("The Address is:" + add);
		 System.out.println("The Phone number is:" + phne);
		 System.out.println("The PanCard is:" + pan);
		 System.out.println("The Addhar Card is:" + adh);
		 
		 
		 }
		  }
		 
		 