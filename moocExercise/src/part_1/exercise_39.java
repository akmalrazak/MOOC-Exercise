package part_1;

import javax.swing.plaf.SliderUI;

public class exercise_39 {
	
	private static void printStars(int amount){
		int i = 0;
		while (i <= amount) {
			System.out.print("*");
			i++;
		}
		System.out.println();
	}
	
	private static void printSquare(int sideSize) {
		int a = 1;
		int b = 1;
		
		while (a <= sideSize) {
			while (b <= sideSize) {
				System.out.print("*");
				b++;
			}
			System.out.println("");
			a++;
			b = 1;
		}
	}
	
	private static void printRectangle(int width, int height) {
		
		int width1=1;
		int height1 =1;
		
		while (height1 <= height) {
			while (width1 <= width) {
				System.out.print("*");
				width1++;
			}
			System.out.println("");
			height1++;
			width1 = 1;
		}
	}
	
	private static void printTriangle(int size) {
		int x = 0;
		int y = 0;
		
		while (y < size) {
			while (x <= y) {
				System.out.print("*");
				x++;
			}
			System.out.println("");
			y++;
			x = 0;
		}
		
	}
	
	public static void main(String[] args) {
		//printStars(5);
	    //printStars(3);
	    //printStars(9);
	    //printSquare(4);
	    //printRectangle(17,3);
	    printTriangle(4);
	    
	}
}
