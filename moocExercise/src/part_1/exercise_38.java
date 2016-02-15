package part_1;

import java.util.Scanner;

public class exercise_38 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("How many?");
		int number = Integer.parseInt(reader.nextLine());
		int i = 1;
		
		while (i <= number) {
			printText();	
			i++;
		}
	}
	
	public static void printText() {
	System.out.println("In the beginning there were the swamp, the hoe and Java.");	
	}

}
