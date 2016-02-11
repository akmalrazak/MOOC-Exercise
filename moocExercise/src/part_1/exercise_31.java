package part_1;

import java.util.Scanner;

public class exercise_31 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("First:");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.println("Last:");
		int num2 = Integer.parseInt(reader.nextLine());
		
		int number = num1;
		if (num1 > num2) {
			System.out.println("");
		} else {
			while (number <= num2) {
				System.out.println(number);
				number++;
		}
		}
	}
}
