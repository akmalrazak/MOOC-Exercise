package part_1;

public class Exercise_45 {
	
	public static void main(String[] args) {
	    int answer =  greatest(2, 7, 3);
	    System.out.println("Greatest: " + answer);
	}

	public static int greatest(int number1, int number2, int number3) {
	    // write your code here
	int max1 = Math.max(number1, number2);
	int max2 = Math.max(number3, max1);
	
	return max2;
	
	}
}
