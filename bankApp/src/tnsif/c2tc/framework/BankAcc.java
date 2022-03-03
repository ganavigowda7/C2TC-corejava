package tnsif.c2tc.framework;

public class BankAcc {
	private int accNo;
	 private String accNm;
	 private  float accBal;
	 
	public BankAcc(int accNo, String accNm, float accBal) { //lazy intialization//
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	 public void withdraw(float accBal)
	 {
		 System.out.println("The withdrawed ammount is"+accBal);
	 }
	 public void deposite(float accBal )
	 {
		 System.out.println("The ammount deposited is:"+accBal);
	 }
	@Override
	public String toString() {
		return "Bank [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	 
	}


