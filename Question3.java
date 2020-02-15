/*
Lisa Hanna
February 15, 2020
This program calculates the sum of 3 digits from the number input by the user
*/

//Import the class necessary for this program to run
import java.util.Scanner;

public class Question3{

	public static void main(String[] args){
		//construct a scanner for user input
		Scanner keyboard = new Scanner(System.in);

		//Print the instructions for the user
		System.out.print("\nHello! Please enter a three digit number. Be careful not include decimals: " );
		//Store the data as a string, and trim it to keep only the number
		String number = keyboard.nextLine().trim();

		//Locate the position of the first, second, and third digit
		String firstPos = number.substring(0, 1);
		String secondPos = number.substring(1,2);
		String thirdPos = number.substring(2,3);
		
		//Transform the strings into integers
		int firstNumber = Integer.parseInt(firstPos);
		int secondNumber = Integer.parseInt(secondPos);
		int thirdNumber = Integer.parseInt(thirdPos);
		
		//Calculate the sum
		int sum = firstNumber + secondNumber + thirdNumber;

		//Print the result
		System.out.println("\nThe sum of the three digits you input is equal to " + sum + "!");
	}
}