package composition;

public class ConstructorBike {
	private String brand;
	private int price;
	private String color;
	private Engin engine;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
		
	}
	public void setColor( String color) {
		this.color= color;
		
	}
	public String getColor() {
		return color;
	}
	
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
		
	}
	
	public void setEngin(Engin engine) {
		this.engine=engine;
	}
	public Engin getEngine() {
		return engine;
	}

		
	public ConstructorBike(String brand, int price, String color,Engin engine) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.engine=engine;
	}
	
	}

