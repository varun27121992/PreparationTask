package OOPS2;

public class UseSportsBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	SportsBike s1 = new SportsBike();
	
	s1.cc=979;
	s1.color= "Green";
	s1.speed=190;
	s1.price=500000;
	s1.power(156);
	s1.weight(800);
	s1.brand("Kawasaki");
	s1.netPrice(s1.price);
System.out.println(s1.brand("Kawasaki"));
System.out.println(s1.netPrice(s1.price));
System.out.println(s1.color);
	}

}
 