class Sports
{

	
  static String IplTeamNames[]={"Chennai Super Kings","Delhi Capitals","Gujarat Titans","Kolkata Knight Riders"};
  static String Batsmen[]={"Sai Sudharsan","Shubman Gill","Suryakumar Yadav","Suryakumar Yadav"};
  static String Bowlers[]={"Anil Kumble","Kapil Dev","Ravichandran Ashwin","Harbhajan Singh"};
  static String iccTeamNames[]={"Australia","India","England","New zealand"};
  public static void main (String[] cricket)
  
  {
  
   System.out.println("The IplTeam Names are:");
   for(String IplTeamNames:IplTeamNames)
   { 	
	   System.out.println(IplTeamNames); 
	   }
	   
   System.out.println("The Batsmen Names are:");
   for(String Batsmen : Batsmen)
   {
	   System.out.println(Batsmen);
   }
    
	System.out.println("The Bowlers Names are:");
	for(String Bowlers : Bowlers)
	{
		System.out.println(Bowlers);
	}
   System.out.println("The iccTeamNames are:");
   for(String iccTeamNames : iccTeamNames)
   {
	   System.out.println(iccTeamNames);
   }
  }
}