package composition;

public class Mobile {
private String brand;
private int price;
private Battery battery;

public void setBrand(String brand ) {
	this.brand=brand;
}
public void setPrice(int price ) {
	this.price=price;
}
public void setBattery(Battery battery) {
	this.battery=battery;
}
public String getBrand() {
	return brand;
}

public int getPrice() {
	return price;
}

public Battery getBattery() {
	return battery;
}
}
