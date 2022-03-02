package tnsif.c2tc.application;
import tnsif.c2tc.framework.primeacc;

public class GSprimeAcc  extends primeacc {

	public GSprimeAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookproducts(float charges) {
		System.out.println("you have purchased the product of charges"+charges);
	}

	@Override
	public String toString() {
		return "GSprimeAcc [isIsprime()=" + isIsprime() + ", toString()=" + super.toString() + ", getAccno()="
				+ getAccno() + ", getAccname()=" + getAccname() + ", getCharges()=" + getCharges( )+ "]";
	}
	



	

}
