package week3;

import java.util.ArrayList;
import java.util.Collections;

public class exercise_62 {
	
	public static void main(String[] args) {
		
		ArrayList<String> brothers = new ArrayList<String>();
		
		brothers.add("Dick");
		brothers.add("Henry");
		brothers.add("Michael");
		brothers.add("Bob");

		System.out.println("brothers:");
		System.out.println(brothers);

		// sorting brothers
		Collections.sort(brothers);

		// removing the last item
		removeLast(brothers);

		System.out.println(brothers);

	}

	private static void removeLast(ArrayList<String> brothers) {
		// TODO Auto-generated method stub
		brothers.remove(brothers.size()-1);
	}

}
