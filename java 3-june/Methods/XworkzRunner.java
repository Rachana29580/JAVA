class XworkzRunner{
public static void main(String institute[]){

   boolean isTraineeRegistered = Xworkz.registerTrainee("Ganga","4CA20CS025","Cauvery Institute of Technology",
                           "14/11/2002",8904039998L,"ganga@gmail.com",7.80);

	
	 
	 if(isTraineeRegistered=true){
	      Xworkz.getTraineeDetails();
	 }
		 else{
			 System.out.println("Please Provide valid Candidate Details......");
		 }
}
}	 