package OOPS2;

public class Pen extends StationaryProduct{
	String penBrand;
	String penType;
	int ledSize;
	
	public String quality( int price) {
		if(price>150) {
			return "Good quality";
		}
		else {
			return "Bad quality";
		}
		
	}

}
