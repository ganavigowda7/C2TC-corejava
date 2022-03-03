package tnsif.c2tc.application;
import tnsif.c2tc.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

public MMSavingAcc(int accNo, String accNm, float accBal) {
		super(accNo,accNm,accBal);
	}
@Override
public void withdraw(float accBal)
{
	System.out.println("the total amount after reciving salary is"+accBal);

    
}

     @Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

	

	
	

}

