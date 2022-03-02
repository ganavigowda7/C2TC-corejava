package tnsif.c2tc.application;
import tnsif.c2tc.framework.Normalacc;

public class GSNormalAcc extends Normalacc {

	public GSNormalAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void bookproducts(float charges) {
		System.out.println("you have purchased the product of charges\"+charge"+charges+"along with delivery charges"+deliverycharges);
	}


	

}
