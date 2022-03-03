package tnsif.c2tc;


	import tnsif.c2tc.application.MMBankFactory;
	import tnsif.c2tc.application.MMCurrentAcc;
	import tnsif.c2tc.application.MMSavingAcc;
	import tnsif.c2tc.framework.BankFactory;
	import tnsif.c2tc.framework.CurrentAcc;
	import tnsif.c2tc.framework.SavingAcc;

	public class client {

		public static void main(String[] args) {
			BankFactory bf=new MMBankFactory();
			SavingAcc sa=new MMSavingAcc(123456,"ganavi",70000);
			sa.withdraw(65000);
			sa.deposite(4000);
			CurrentAcc ca=new MMCurrentAcc(45678,"ashika",4000);
			ca.withdraw(1000);
	         ca.deposite(100);
		}

	}

