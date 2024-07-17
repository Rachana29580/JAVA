class LoanApplicationRunner
{
	public static void main(String []LoanApplicationdetails)
	{
		Passport.createLoanApplication( 876431689, "HDFC bank" , 100000,2.00, "carloan");
		
		Passport.getLoanApplicationDetails();
		
}
}