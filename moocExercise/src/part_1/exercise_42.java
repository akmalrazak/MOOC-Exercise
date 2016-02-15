package part_1;

import java.util.Scanner;

public class exercise_42 {

	public static void main(String[] args) {
		
	
	Scanner reader = new Scanner(System.in);
    Hangman hangman = new Hangman();

    System.out.println("************");
    System.out.println("* Hangman *");
    System.out.println("************");
    System.out.println("");
    printMenu();
    System.out.println("");

    // ADD YOUR IMPLEMENTATION HERE

    //String winnie = "the pooh";
    //if (winnie.isEmpty()) {
    	//System.out.println("String was empty");
    //}
    //else {
    	//System.out.println("I found something!");
	//}
    
   
    
    int i = 0;
    while (hangman.gameOn()) {
    	System.out.println("Type a command:");
        String command = reader.nextLine();
        
         if (command.equals("quit")) {
        	 break;
		}
         
         if (command.equals("status")) {
        	 hangman.printStatus();
        	 hangman.printMan();
        	 hangman.printWord(command);
        	 
		}
         
         if (command.length() == 1) {
        	 hangman.guess(command);
        	 hangman.printMan();
        	 hangman.printWord(command);
		}
         
         else{
			i++;
		} 
    }

    System.out.println("Thank you for playing!");

	}
	
	
	
public static void printMenu() {
    System.out.println(" * menu *");
    System.out.println("quit   - quits the game");
    System.out.println("status  - prints the game status");
    System.out.println("a single letter uses the letter as a guess");
    System.out.println("an empty line prints this menu");
}

}
