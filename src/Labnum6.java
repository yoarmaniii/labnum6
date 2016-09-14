//User input settings needed
import java.util.Scanner;
public class Labnum6 {

	public static void main(String[] args) {
		//Create welcome line
		System.out.println("Welcome to the Pig Latin Translator!!");
		System.out.println();
		System.out.println( "Enter a line to be translated:");
		
		//Declare and initialize new user input
		Scanner userInput = new Scanner (System.in);
		
		//Declare your variables
		String input = userInput.nextLine();
		String character = new String(input);
		
		//lower case transformation value
		System.out.println("Return Value");
		System.out.println(character.toLowerCase());
		
		//get first letter of each word
		char firstLetter = input.charAt(0);
		input = input.substring(0);
		
		//adding "ay" to words with consonats
		input = input + firstLetter + "ay";
		System.out.println(input);
		
		
		
		
		

	}

}
