package tnsif.c2tc.framework;

public class CurrentAcc extends BankAcc {
	protected final float creditLimit=5000;
	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);

}
}
