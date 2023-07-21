package composition;

public class ConstructorUseBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engin e1 = new Engin(12000, 566);

		ConstructorBike b1 = new ConstructorBike("Kawasaki", 250000, "green",e1);
		System.out.println(b1.getBrand());
		System.out.println(b1.getPrice());
		System.out.println(b1.getColor());
		System.out.println(b1.getEngine().getPrice());

	}

}
