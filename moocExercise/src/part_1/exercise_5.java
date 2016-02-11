package part_1;

public class exercise_5 {

	public static void main(String[] args) {
		
		int total;
		int day;
		
		//calculate second a day
		day = 24 * 60 * 60;
		
		//calculate second a year
		total = 365 * day;
		
		System.out.println("There are "+total+" seconds in a year.");
	}
}
