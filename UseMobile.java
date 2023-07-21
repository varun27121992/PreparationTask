package composition;

public class UseMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battery b1 = new Battery();
		b1.setCapacity(5000);
		b1.setPrice(5000);
		Mobile m1 = new Mobile();
		m1.setBrand("Nokia");
		m1.setPrice(1500);
		m1.setBattery(b1);

		System.out.println(m1.getBrand() + " " + m1.getPrice() + " " + m1.getBattery().getCapacity() + " "
				+ m1.getBattery().getPrice());

	}

}
