/*
****************************************
Important Points
Two or more methods can have the same name inside the same class if they accept different arguments. This feature is known as method overloading.
Method overloading is achieved by either:
--changing the number of arguments.
--or changing the data type of arguments.
It is not method overloading if we only change the return type of methods. There must be differences in the number of parameters.
*******************************************
*/
package Fruit;

public class Main {

	
	public static void main(String[] args) {

		System.out.println("======ORANGE======");
		Fruit F = new Fruit("Orange");
		//System.out.println(F.totalPrice(5.5));
		System.out.println("------------------------------------------------");
		System.out.println();
		
		System.out.println("======APPLE======");
		Apple A = new Apple("Apple", 5, 2.59,"Sour","Red");
		A.printInfo();
		System.out.println("------------------------------------------------");
		System.out.println();
		
		
		System.out.println("======GRAPE======");
		Grape G = new Grape("Grape", 13.9, 1.1, "Vitamin C and Vitamin K", 0.31);
		System.out.println("------------------------------------------------");
		System.out.println();
		
		
		System.out.println("======KIWI======");
		Kiwi K = new Kiwi("Kiwi", 14.2, "Fiber, Vitamin C & Antioxidants", 3, 5, 1.57);
		System.out.println("------------------------------------------------");
		System.out.println(); 
		
		System.out.println("======FUJI APPLE======");
		Fuji Fj = new Fuji("Fuji Apple", 110, 2.6, "Japan", 2.03, 26.53,"Sour", null);
		System.out.println("------------------------------------------------");
		System.out.println();
		
		System.out.println("======GRANNY SMITH APPLE======");
		GrannySmith Gs = new GrannySmith("Granny Smith", 10, 2.4, "Australia", 95, 2, 0.31,"Sour","Green");
		System.out.println("-------------------------------------------------");
		System.out.println();
		
	}
	
}
