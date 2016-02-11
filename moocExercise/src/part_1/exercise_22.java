package part_1;

import java.util.Scanner;

public class exercise_22 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while(true){
		System.out.println("Type the password:");
		String password = reader.nextLine();
		
			if (password.toLowerCase().equals("carrot")) {
				System.out.println("Right!");
				String encrypt = "";
				for (int i = 0; i < password.length(); i++) {
		            char c = password.toLowerCase().charAt(i);
		            if       (c >= 'a' && c <= 'm') c += 13;
		            else if  (c >= 'n' && c <= 'z') c -= 13;
		
		            encrypt+=c;
				}
				System.out.print("The secret is: "+encrypt);
				break;
			}
			else{
				System.out.println("Wrong!");
			}
		}
	}
}
