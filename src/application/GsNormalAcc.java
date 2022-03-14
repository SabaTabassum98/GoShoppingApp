package application;

import framework.NormalAcc;

public class GsNormalAcc extends NormalAcc{

	public GsNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
	}
	
	public void bookProduct(float charges)
	{
		
	}

	@Override
	public String toString() {
		return "GsNormalAcc [accNo=" + accNo + ", charges=" + charges + ", toString()=" + super.toString()
				+ ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
