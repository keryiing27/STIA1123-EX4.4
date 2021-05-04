package Fruit;

public class Grape extends Fruit{
	
	private double price, weight, sgDollar;
	private String vitamin;
	
	public Grape(String n, double p, double w, String v, double sg) { // constructor with many args
		super(n);
		this.price = p;
		this.weight = w;
		this.vitamin = v;
		this.sgDollar = sg;
		
		if (this.weight <= 2.50) {
			total();
			System.out.println("**Weight less than 2.50 **");
			System.out.printf("Total Price                 : RM %.2f%n", total());
			
		}
		else if((this.weight > 2.50 ) && (this.weight <= 50.0)) {
			double pr = 12.59;
			total(pr);
			System.out.println("**Weight more than 2.50**");
			System.out.printf("Total Price                 : RM %.2f%n", total(pr));
		}
			else {  
				double pr = 10.99;
				double disc = 0.9;
				total(disc,pr);
				System.out.println("**Weight more than 50.0,Special Discount Given**");
				System.out.printf("Total Price                 : RM %.2f%n", total(disc,pr)); 
				} 
		
		if (this.sgDollar != 0.0) {
			total(p,w,sg);
		}
		
		if(this.vitamin != null) {
			printInfo();
		}
		
	}
	public double total() {
		return this.price * this.weight;
	}
	
	public double total(double disc, double p) {  // overloading with 2 parameters
		return this.weight * disc * p;
	}
	public double total(double p) { // overloading with 1 parameter
		return this.weight * p ;
	}
	public void total(double p, double w, double sg) { // overloading with 2 parameters
		System.out.println(String.format("Total Price (in SG Dollar)  : $ %.2f" , (p * w * sg)));
	}
	
	public String printV() { //overriding
		return vitamin;
	}
	
	public String toString() { //overriding method
		return "=>Grape is a good source of ";
	}
	
	public void printInfo() { //overriding
		System.out.println(toString() + printV());
	}
	
}
