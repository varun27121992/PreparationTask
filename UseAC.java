package composition;

public class UseAC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compressor c = new Compressor();
		c.setCapacity(500);
		c.setWarrenty(2);
		Ac ac = new Ac();
		ac.setBrand("voltas");
		ac.setColor("white");
		ac.setPrice(25000);
		ac.setCompressor(c);
		System.out.println(ac.getCompressor().getCapacity());
		System.out.println(ac.getCompressor().getWarranty());
		System.out.println(ac.getBrand());
		System.out.println(ac.getColor());
		System.out.println(ac.getPrice());

	}
}
