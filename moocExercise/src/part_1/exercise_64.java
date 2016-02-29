package week3;

import java.util.ArrayList;

public class exercise_64 {

	
	public static double average(ArrayList<Integer> list) {
	    // write your code here
		int count = 0;
		int sum = 0;
		double average = 0.0;
		
		while(count < list.size()){
			sum += list.get(count);
			count++;		
		}
		
		average = (double)sum / list.size();
		
		return average; 
		
	}

	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The average is: " + average(list));
	}

	
}
