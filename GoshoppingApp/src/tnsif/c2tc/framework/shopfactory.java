package tnsif.c2tc.framework;

public interface shopfactory {
	
    public primeacc getNewPrimeAccount( int accno,String accname, float charges);
    public Normalacc getNewNormalAccount(int accno, String accname, float charges);
}
