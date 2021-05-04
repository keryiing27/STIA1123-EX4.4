package Fruit;

public class Kiwi extends Fruit{
	
	private String vitamin;
	private int packet;
	private int amount;
	private double price, chineseYuan;
	
	
	public Kiwi(String n, double p, String v, int pac, int a, double cNY) { //constructor with 5 args
		super(n);
		this.price = p;
		this.vitamin = v;
		this.packet = pac;
		this.amount = a;
		this.chineseYuan = cNY;
		
		
		
		if (this.packet <= 10) {
			total();
			System.out.println("**Packet less than 10 **");
			System.out.printf("Total Price                 : RM %.2f%n", total());
			
		}
		else if((this.packet > 10 ) && (this.packet <= 110)) {
			double pr = 13.50;
			total(pr);
			System.out.println("**Packet more than 10**");
			System.out.printf("Total Price                 : RM %.2f%n", total(pr));
		}
			else {  
				double pr = 11.99;
				double disc = 0.8;
				total(disc,pr);
				System.out.println("**Packet more than 110, Special Discount Given**");
				System.out.printf("Total Price                 : RM %.2f%n", total(disc,pr)); 
				} 
		
		if(this.packet != 0) {
			total(p,pac,cNY);
		} else if (this.vitamin != null) {
			printInfo();
		}
		
		
		
	}
	public double total() {
		return this.price * this.packet;
	}
	
	public double total(double disc, double p) {  // overloading with 2 parameters
		return this.packet * disc * p;
	}
	public double total(double p) { // overloading with 1 parameter
		return this.packet * p ;
	}
	
	
	public void total(double p, int pac, double cNY) { // overloading with 2 parameters
		System.out.println(String.format("Total Price (Chinese Yuan)  : CNY %.2f", (p * pac * cNY)));
	}
	
	public int amountPerPacket(int pac, int a) { // overloading with 2 parameters
		return this.packet * this.amount;
	}
	
	public String amountPerPacket() { // overloading with no parameter
		return "Total Amount of Kiwi per packet : ";
	}
	
	public String printV() { //overriding
		return this.vitamin;
	}
	
	public String toString() { // overriding
		return "=>Kiwi is high in " ;
	}
	
	public void printInfo() { //overriding
		System.out.println(amountPerPacket() + amountPerPacket(3, 5));
		System.out.println(toString() + printV());
	}
}
