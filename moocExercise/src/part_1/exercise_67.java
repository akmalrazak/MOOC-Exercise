package week3;

import java.util.ArrayList;

public class exercise_67 {

	public static double variance(ArrayList<Integer> list) {
	    // write your code here
		
		double average =0.0;
		int count = 0;
		double sum = 0.0;
		
		while(count < list.size()){
			sum += list.get(count);
			count++;		
		}
		
		average = (double)sum/list.size();
		
		sum = 0;
		
		for(double i : list){
			i = Math.pow(i-average, 2);
			sum += i;
		}
		return sum/(list.size()-1);
		
	}

	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The variance is: " + variance(list));
	}

	
}
