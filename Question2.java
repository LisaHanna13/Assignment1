/*
Lisa Hanna
February 15, 2020
This program calculates the total cost of a product, 
taking into consideration TPS, TVQ and a 15% tip.
*/

//Import the two classes necessary for this program to run
import java.util.Scanner;
import java.text.NumberFormat;

public class Question2{

	public static void main(String[] args){
		//Construct a scanner for user input
		Scanner keyboard = new Scanner(System.in);

		//Print instructions for the user
		System.out.print("\nHello! Please insert the price of your product in CAD: ");
		//Store the data
		Double price = keyboard.nextDouble();

		//Create variables of costs (percentages) added to the product
		final double TPS = 0.05 * price;
		final double TVQ = 0.09975 * price ;
		final double TIPS = 0.15 * price;

		//Calculate the final price 
		double finalPrice = price + TPS + TVQ + TIPS;

		//Create object that will display price with the proper formatting
		NumberFormat cost = NumberFormat.getCurrencyInstance();

		//Print out the results
		System.out.println("\nHere is your original price, TPS, TVQ, TIPS, And Total Price!");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Original Price: " + cost.format(price));
		System.out.println("TPS: " + cost.format(TPS));
		System.out.println("TVQ: " + cost.format(TVQ));
		System.out.println("TIPS: " + cost.format(TIPS));
		System.out.println("Total Price: " + cost.format(finalPrice));
    }
}