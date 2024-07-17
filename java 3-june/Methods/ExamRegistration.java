class ExamRegistration 
{
        static String stNam;
	    static int stRegiNo;
		static String cour;
		static String dB;
		static String pl;
		 	 
public static boolean createRegistration(String studentName, int studentRegistrationNumber, String course,String dOB,String place )
{ 
         
		 boolean isExamRegistrationDataCreated =false;
		 
		 stNam =studentName;
		 stRegiNo =studentRegistrationNumber;
		 cour =course;
		 dB =dOB;
		 pl = place;
		 
		 return isExamRegistrationDataCreated; 
}    
         public static void getExamRegistrationDetails() 
		 {
		 
		 
         System.out.println("Student Name:" +stNam);
		 System.out.println("The Student Registration Number:" +stRegiNo);
		 System.out.println("Course Name :" +cour);
		 System.out.println("Date of Birth is :" +dB);
		 System.out.println("Place :" +pl);
		  
		 }
		  }