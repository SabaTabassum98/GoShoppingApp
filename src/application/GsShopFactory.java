package application;

import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class GsShopFactory extends ShopFactory{
	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) {
		
		return null;
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}

}
