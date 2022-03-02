package tnsif.c2tc.framework;

public class primeacc extends shopaccount {
	public primeacc(int accno, String accname, float charges) {
		super(accno, accname, charges);
	}
	
  private  static boolean isprime=true;
  
		public boolean isIsprime() {
	return isprime;
}




public void setIsprime(boolean isprime) {
	this.isprime = isprime;
}




	@Override
	public String toString() {
		return "primeacc [isprime=" + isprime + ", getAccno()=" + getAccno() + ", getAccname()=" + getAccname()
				+ ", getCharges()=" + getCharges() +"]";
	}

	
	}
	


