package tnsif.c2tc.framework;

public interface BankFactory {
	public SavingAcc getNewSavingAccount(int accNo,String accNm,float accBal);
	public CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal);

}
