/*
Lisa Hanna
February 15, 2020
This program generates a random number between 0 and 100, 
and performs mathematical operations with
*/

//Import the classes necessary for this program to run
import java.util.Random;
import java.text.NumberFormat;

public class Question5{

	public static void main(String[] args){
		//Creating the object to generate a random number
		Random random = new Random();
		//Obtain a number between [0-100]
		double number = random.nextInt(101);

		//Print the random number with proper formatting
		System.out.println("\nThe random number is: " + String.format("%.2f", number));

		//Calculate the power of 2 and 3 of the random number
		double pow2 = Math.pow(number, 2);
		double pow3 = Math.pow(number, 3);
		//Calculate the square root of the random number
		double sqrt = Math.sqrt(number);
		//Calculate the natural logarithm of the random number
		double natLog = Math.log(number);
		//Calculate the base 10 logarithm of the random number
		double log10 = Math.log10(number);

		//Print out the results with proper formatting
		System.out.println("\nThe number to the power of 2 is equal to: " + String.format("%.2f", pow2));
		System.out.println("The number to the power of 3 is equal to: " + String.format("%.2f", pow3));
		System.out.println("The square root of the number is equal to: " + String.format("%.2f", sqrt));
		System.out.println("The natural logarithm of the number is equal to: " + String.format("%.2f", natLog));
		System.out.println("The base 10 logarithm of the number is equal to: " + String.format("%.2f", log10));




	}
}