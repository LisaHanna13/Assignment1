/*
Lisa Hanna
February 15, 2020
This program verifies if an input website is valid and secure or not
*/

//Import the class necessary for this program to run
import java.util.Scanner;

public class Question4{

	public static void main(String[] args){
		//construct a scanner for user input
		Scanner keyboard = new Scanner(System.in);

		//Print the instructions for the user
		System.out.print("\nHello! Please enter a URL: ");
		//Store the data, and trim it
		String url = keyboard.nextLine().trim();

		//Printing out the first output, determining how many characters the string has
		System.out.println("\nVerifying an URL with " + url.length() + " characters...");

		//Extract the first 8 characters of the url
		String http = url.substring(0,8);
		//Create a string for what is required, so that the two strings can be compared
		String required =  "https://";

		//Creating if statement to verify if the URL is valid and secure
		if (http.equals(required)){
			System.out.println("Is this a valid and secure URL? true.");
		}
		else{
			System.out.println("Is this a valid and secure URL? false.");
		}
	}
}