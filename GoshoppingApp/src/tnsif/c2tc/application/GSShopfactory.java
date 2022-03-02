package tnsif.c2tc.application;
import tnsif.c2tc.framework.Normalacc;
import tnsif.c2tc.framework.primeacc;
import tnsif.c2tc.framework.shopfactory;
public class GSShopfactory implements shopfactory {

	@Override
	public primeacc getNewPrimeAccount( int accno, String accname, float charges) {
		primeacc pa=new primeacc(accno, accname, charges);
		return pa;
	}

	@Override
	public Normalacc getNewNormalAccount(int accno, String accname, float charges) {
		Normalacc na=new Normalacc(accno,accname,charges);
		return na;
	}
	

}
