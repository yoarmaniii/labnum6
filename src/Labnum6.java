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
		String input;

		//Declare your variables
		//lower case transformation value
		//System.out.println("Return Value");
		//System.out.println(character.toLowerCase());
		
		
			input =userInput.nextLine();
		
			if( input.startsWith("a") || input.startsWith("e") || input.startsWith("i") ||
                input.startsWith("o") || input.startsWith("u"))
		{
			System.out.println(input + "way");
			
		} 
		
			else		
		{ 	 
			System.out.print(input.substring(1) + input.substring(0,1) + "ay");
			input=userInput.next();
			System.out.println("So you want to try another? Enter (Yes/Quit)");
			input=userInput.nextLine();
			
		}
            
				
		{	System.out.println();	
			System.out.println("See you later!");
		

		}
}
}