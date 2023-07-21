package composition;

public class Battery {
	private int capacity;
	int price;
	
	public void setCapacity(int capacity ) {
		this.capacity=capacity;
	}
	public void setPrice(int price ) {
		this.price=price;
	}
	public int getCapacity() {
		return capacity;
	}
	public int getPrice() {
		return price;
	}
}
