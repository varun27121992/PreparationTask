package composition;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Engine e1= new Engine();
		e1.piston=10;
		e1.price=2500000;
		e1.type="Flat";
		e1.hp=150;
		
		Cars c1 = new Cars();
		c1.brand="Aston";
		c1.color="Blue";
		c1.price=4500000;
		c1.cc=2200;
		c1.engine=e1;
		
		System.out.println(c1.brand+","+c1.color+","+c1.price+","+c1.cc+",");
		System.out.println(c1.engine.piston+""+c1.engine.price+" "+c1.engine.type+" "+c1.engine.hp);
		

	}

}
