package Fruit;

public class Fuji extends Apple{
	
	private String country;
	private double weight;
	private double yen;
	
	public Fuji(String n, int q, double p, String c, double w, double y,String t, String col) { // constructor with  args
		super(n,q,p,t,col);
		this.country = c;
		this.weight = w;
		this.yen = y;
		
		if (this.yen != 0.0) {
			total(q,p,yen);
		}
		
		if(this.country != null) {
			printInfo();
		}
		
		
	}
	public void total(int q, double p, double y) { // overloading with 3 parameters
		System.out.println(String.format("Total Price (in yen)        : %.2f yen", (q * p * y)));
	}
	
	public String getCountry() { //overloading with no parameter
		return this.country;
	}
	public double calAver(int q) { // overloading with 1 parameter
		return this.weight / q;
	}
	
	public String calAver() { // overloading method without parameter
		return String.format("Average Weight              : %.2f", (calAver(7)));
	}
	
	public String toString() { // overriding method
		return "=>Granny Smith Apple is orignated in " ;
	}
	
	public void printInfo() { //overriding
		System.out.println(calAver() + " gm");
		System.out.println(toString() + getCountry());
		
	}
	
}
