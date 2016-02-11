package part_1;

import java.util.Scanner;

public class exercise_34 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type a number:");
		int number = Integer.parseInt(reader.nextLine());
		
		int result = 1;
		int i = 1;
		
		while ( i <= number) {
			result = result * i;
			i++;
		}
		System.out.println("Factorial is "+result);
	}
}
