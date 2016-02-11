package part_1;

import java.util.Scanner;

public class exercise_25 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int sum = 0;
		int read;
		
		System.out.println("Type the first number:");
		read = Integer.parseInt(reader.nextLine());
		sum = sum + read;
		
		System.out.println("Type the second number:");
		read = Integer.parseInt(reader.nextLine());
		sum = sum + read;
		
		System.out.println("Type the third number:");
		read = Integer.parseInt(reader.nextLine());
		sum = sum + read;
		
		System.out.println("Sum: "+sum);
	}
}
