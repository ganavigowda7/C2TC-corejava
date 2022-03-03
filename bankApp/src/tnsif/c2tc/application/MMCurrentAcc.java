package tnsif.c2tc.application;
	import tnsif.c2tc.framework.CurrentAcc;

	public class MMCurrentAcc extends CurrentAcc {

		public MMCurrentAcc(int accNo, String accNm, float accBal) {
			super(accNo, accNm, accBal);
			// TODO Auto-generated constructor stub
		}
		public void withdraw(float accBal)
		{
			System.out.println("the withdraw the amount with creditlimit:"
	                + accBal +" along with crediteLimit is:" 
		           + creditLimit);		     

}
	
}
