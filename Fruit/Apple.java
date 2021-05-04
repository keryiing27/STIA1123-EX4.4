package Fruit;

public class Apple extends Fruit{
	private double price;
	private int quantity;
	private String color, taste;
	
	public Apple(String name, int q, double p, String t, String c) { // constructor with 3 args
		super(name);
		this.quantity = q;
		this.price = p;
		this.color = c;
		this.taste = t;
		
		if(this.color == null) {
			color();
			System.out.println("Color is not detected ------ " + color());	
		}
		else {
			color();
			System.out.println("Color                       : " + color());
		}
		
		if(this.taste == null) {
			taste();
			System.out.println("Taste is not detected-- " + taste());	
		}
		else {
			taste();
			System.out.println("Taste                       : " + taste());
		}
		
		
		if (this.quantity <= 5) {
			total();
			System.out.println("**Quantity less than 5**");
			System.out.println("Total Price                 : RM "+ total());
			
		}
		else if((this.quantity > 5) && (this.quantity <= 100)) {
			double pr = 1.99;
			total(pr);
			System.out.println("**Quantity more than 5**");
			System.out.printf("Total Price                 : RM %.2f%n", total(pr));
		}
			else {  
				double pr = 1.25;
				double disc = 0.9;
				total(disc,pr);
				System.out.println("**Quantity more than 100,Special Discount Given**");
				System.out.printf("Total Price                 : RM %.2f%n", total(disc,pr)); 
				} 

	}
	public double total() {
		return this.price * this.quantity;
	}
	
	public double total(double disc, double p) {  // overloading with 2 parameters
		return this.quantity * disc * p;
	}
	public double total(double p) { // overloading with 1 parameter
		return this.quantity * p ;
	}

	public String taste() {
		return this.taste;
	}
	
	public String color() {
		return this.color;
	}
	
	public int getQuantity(){
		return this.quantity ;
	}
	public String toString() { // overriding method
		return "Total apples sold           : ";
	}
	
	public void printInfo() { //overriding method
	 System.out.println(toString() + getQuantity());
	 
	}
}


