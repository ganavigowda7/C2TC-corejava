package tnsif.c2tc;

import tnsif.c2tc.application.GSprimeAcc;
import tnsif.c2tc.application.GSNormalAcc;
import tnsif.c2tc.application.GSShopfactory;
import tnsif.c2tc.framework.shopfactory;
import tnsif.c2tc.framework.Normalacc;
import tnsif.c2tc.framework.primeacc;


public class client {

	public static void main(String[] args) {
		shopfactory sf=new GSShopfactory();
		primeacc pa=new GSprimeAcc(123,"ganavi",1000);
		pa.bookproducts(500);
		Normalacc na=new GSNormalAcc(1234,"ashika",0);
		na.bookproducts(500);
	}

}
