package tnsif.c2tc.framework;

public class SavingAcc extends BankAcc {
	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}
 
private static boolean isSalaried=true;
private static  float MINBAL=500;
public static boolean isSalaried() {
	return isSalaried;
}
public static void setSalaried(boolean isSalaried) {
	SavingAcc.isSalaried = isSalaried;
}
public static float getMINBAL() {
	return MINBAL;
}
public static void setMINBAL(float mINBAL) {
	MINBAL = MINBAL;
}
@Override
public String toString() {
	return "SavingAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}

}





