package OOPS2;

public class StationaryProduct {
	
	String product;
	int price;
	
	public int netPrice( int taxpt, int price) {
		return price*taxpt/100;
		
	}


}
