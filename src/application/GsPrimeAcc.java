package application;

import framework.PrimeAcc;

public class GsPrimeAcc extends PrimeAcc {
private static final float charges=0; 
	
	
	public GsPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
	{
		super(accNo, accNm, charges, isPrime);
		
	}
	
	public void bookProduct(float charges)
	{
		
	}

	@Override
	public String toString() {
		return "GsPrimeAcc [isPrime=" + isPrime() + ", accNo=" + accNo + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
