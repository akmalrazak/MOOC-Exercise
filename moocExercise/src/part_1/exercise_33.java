package part_1;

import java.util.Scanner;

public class exercise_33 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("First:");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.println("Last:");
		int num2 = Integer.parseInt(reader.nextLine());
		
		int result=0;
		int i =num1;
		
		while (i <= num2) {
			result +=i;
			i++;
		}
		
		System.out.println("The sum "+result);
	}

}
