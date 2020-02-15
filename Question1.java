/*
Lisa Hanna
February 15, 2020
This program calculates the cost of a road trip, 
based on how many km a car travels
*/

//Import the two classes necessary for this program to run
import java.util.Scanner;
import java.text.NumberFormat;

public class Question1{

	public static void main(String[] args){
		//construct a scanner for user input
		Scanner keyboard = new Scanner(System.in);

		//Print out the instructions for the user
		System.out.print("\nHello! Please enter the amount of kilometers that will be driven: ");
		//Store the data
		double kilometers = keyboard.nextDouble();
		//Print out the second part of instructions
		System.out.print("Thank you! Now please enter the average distance that your car runs with 1 liter of gas: ");
		//Store the data
		double distPerLiter = keyboard.nextDouble();

		//Calculate the liters required
		double liters = kilometers/distPerLiter;
		//Calculate the cost
		double cost = liters * 1.16;
		
		//Create an object that formats the cost with the right punctuation and two decimals
		NumberFormat decimals = NumberFormat.getCurrencyInstance();
		
		//Print out the results, formatting everything to two decimals
		System.out.println("\nGreat! To drive " + String.format("%.2f", kilometers) + " kilometers, it will cost you " + decimals.format(cost) + " CAD, considering gas is $1.16 CAD per liter.");
	}
}
