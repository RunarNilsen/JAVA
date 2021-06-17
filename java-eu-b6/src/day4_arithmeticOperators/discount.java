package day4_arithmeticOperators;

public class discount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int regularPrice=59; 
		double discount; 
		double salesPrice; 
		
		discount = regularPrice*0.2;
		salesPrice = regularPrice-discount;
		
		System.out.println("Regular price is  $ " + regularPrice);
		System.out.println("Discount is  $ " + discount);
		System.out.println("Sales price is  $ " + salesPrice);
		
	}

}
