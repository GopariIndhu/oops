package Java;

class Mobile2 {
	String brand;
	int price;
	static String name;
	
	
	public Mobile2() {
		brand ="";
		price = 200;
		System.out.println("in constructor");
	}
	static {
		name = "Phone";
		System.out.println("in static block");
	}
	
	public void show() {
		System.out.println(brand + " : " + price + " : " + name);
	}

}

public class staticblock {

	public static void main(String[] args) {
		Mobile2 obj1 = new Mobile2();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile2.name = "Smart Phone";
		
		Mobile2 obj2 = new Mobile2();
	}
}
