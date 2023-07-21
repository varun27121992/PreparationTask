package OOPS2;

public class UsePen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1 = new Pen();
		p1.product="ballpoint";
		p1.price= 1500;
		p1.netPrice(5,p1.price);
		p1.penBrand="Parker";
		p1.ledSize=1;
		System.out.println(p1.quality(p1.price));
		
		System.out.println(p1);	

	}

}
