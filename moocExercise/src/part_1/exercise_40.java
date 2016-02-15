package part_1;

public class exercise_40 {
	
	public static void main(String[] args) {
		printStars(5);
	}
	
	private static void printStars(int amount){
		int i = 0;
		while (i <= amount) {
			System.out.print("*");
			i++;
		}
		System.out.println();
	}
	
	private static void printWhitespaces(int size) {
		int a = 0;
		while (a <= size) {
			System.out.print(" ");
			a++;
		}
		System.out.println("");
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

}
