package part_1;

import java.util.Scanner;

public class exercise_35 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type a number:");
		int number = Integer.parseInt(reader.nextLine());
		
		int result = 0;
		int i = 0;
		int sum = 0;
		
		while ( i <= number){
			result = (int)Math.pow(2,i);
			sum = sum + result;
			i++;
		}
		
		System.out.println("The result is "+sum);
	}

}
