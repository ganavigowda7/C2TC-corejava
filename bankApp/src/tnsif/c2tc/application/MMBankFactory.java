package tnsif.c2tc.application;
import tnsif.c2tc.framework.BankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal) {
		SavingAcc sa=new SavingAcc(accNo,accNm,accBal);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal) {
		CurrentAcc ca=new CurrentAcc(accNo,accNm,accBal);
		return ca;
	}

	
}
	
