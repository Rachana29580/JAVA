class Xworkz{
      
	     static String name;
		 static String usnId;
		 static String clg;
		 static String birthDate;
		 static long contactNum;
		 static String email;
		 static double cgpaMarks;
		 
		 
public static boolean registerTrainee(String candidateName, String usn, String college,
                        String dob,long contactNo,String emailId,double cgpa) {
									  
							  
		boolean isTraineeRegistered=false;
		boolean isCandidateNameValid=false;
		boolean isUsnValid=false;
		boolean isCollegeValid=false;
		boolean isDobValid=false;
		boolean isContactNoValid=false;
		boolean isEmailIdValid=false;
		boolean isCgpaValid=false;
		
		if(candidateName!=null){
			 name=candidateName;
			isCandidateNameValid=true;
		}else{
            System.out.println("Please Provide valid Candidate name");
		}
		
		if(usn!=null){
			usnId=usn;
         isUsnValid=true;
		}else{
            System.out.println("Please Provide valid Usn");
		}
		
		if(college!=null){
			clg=college;
        	isCollegeValid=true;
        }else{
            System.out.println("Please Provide valid College name");
		}	 
        
        if(dob!=null){
           	birthDate=dob;
			isDobValid=true;
		}else{
            System.out.println("Please Provide valid Date of Birth of the Candidates");
		}
		
		if(contactNo>0){
			contactNum=contactNo;
			isContactNoValid=true;
		}else{
            System.out.println("Please Provide valid Contact Number of the Candidates");
		}
		
		if(email!=null){
			email=emailId;
			isEmailIdValid=true;
		}else{
            System.out.println("Please Provide valid Email Address of the Candidates");
		} 
		
		if(cgpa>0){
		   cgpaMarks=cgpa;
		isCgpaValid=true;
		}else{
            System.out.println("Please Provide valid Cgpa Marks of the Candidates");
		}
			
		return isTraineeRegistered;
		} 
		
		
		public static void getTraineeDetails(){
		
		    System.out.println("The candidate Name is:"+name);
			System.out.println("The Usn of the Candidate is:"+usnId);
			System.out.println("The college Name of the Candidate is :"+clg);
			System.out.println("The Date of Birth of the Candidate is:"+birthDate);
			System.out.println("The contact Number of the candidate is:"+contactNum);
			System.out.println("The Email of the Trainee is:"+email);
			System.out.println("The Obtained Cgpa of the Candidate is:"+cgpaMarks);
		 
		
		}
		}
		