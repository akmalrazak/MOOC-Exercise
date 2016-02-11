package part_1;

import java.util.Scanner;

public class exercise_26 {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int sum = 0;
		
		while (true) {
			int read = Integer.parseInt(reader.nextLine());
			if (read == 0) {
				break;
			}
			else if (read > 0) {
				sum = sum + read;
			}
			
			System.out.println("Sum now: "+sum);
		}
		
		System.out.println("Sum in the end: "+sum);
	}


}
