package day4_arithmeticOperators;


import java.util.Calendar;

public class arithmeticOperatorsAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Question One
		double gallonToLiter = 3.7854;
		int gallonAmount=15;
		
		System.out.println(gallonAmount + " gallon is  " + gallonAmount*gallonToLiter + "liter");
		System.out.println("---------------------------------------------------------");
		
		// Question Two
		// create a calendar
	    Calendar cal = Calendar.getInstance();
	    String name="Muhammet";
	    int birthYear=1986;
	    int age=cal.get(Calendar.YEAR)-birthYear;
		
		System.out.println("\"Hello, " + name +"! Based on your input, your age is " + age + " :)\"");
		System.out.println("---------------------------------------------------------");
		
		// Question Three
	    
	    double width=4.5;
	    double height=7.9;
	    double area=width*height;
		
		System.out.println("The area of a rectangle: " + area);
		System.out.println("---------------------------------------------------------");
		
		// Question Four
		int Num1=10, Num2=20, Num3;
	    System.out.println("n1=" + Num1 +"\n" + "n2=" + Num2);
		System.out.println("----------");
		
	    Num3=Num1; Num1=Num2; Num2=Num3;
	    System.out.println("n1=" + Num1 +"\n" + "n2=" + Num2);
		System.out.println("---------------------------------------------------------");
		
		// Question Five
		int inputSecond=3695;
		int hour=inputSecond/3600;
		int remainMinutes = (inputSecond%3600);
		int minutes=remainMinutes/60;
		int seconds=remainMinutes%60;
		
		System.out.println(hour + " hours, " + minutes +" minutes, and " + seconds +" seconds");
		System.out.println("---------------------------------------------------------");
		
		// Question Six
		int milligramsInDrink=500;
		int maximumMilligram=10*1000;
		int overdoseLimit=maximumMilligram/milligramsInDrink;
		
		System.out.println("Number of milligrams in drink: " + milligramsInDrink);
		System.out.println("It would take about "+ overdoseLimit + " drinks for a lethal overdose");
		System.out.println("---------------------------------------------------------");
		
		
		// Question Seven
		int priceInCents=35;
		int dispensed=100-priceInCents;
		int quarters = dispensed/25;
		int dimes= (dispensed%25)/10;
		int nickles = ((dispensed%25)%10)/5;
		
		System.out.println("Your change is " + quarters + " quarters, "+ dimes + " dimes, and " + nickles + " nickles");
		System.out.println("---------------------------------------------------------");
		
		
		
	}

}
