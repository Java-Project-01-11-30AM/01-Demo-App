package practiceAssignments;

import java.util.HashSet;
import java.util.Set;

/*Java program to find duplicate elements in an Array using HashSet*/

public class FindDuplicateElement {
	public static void main(String[] args) {
		
		  int[] inputNumArray = {1, 2, 5, 5, 6, 6, 7, 2,100,100,100 };	
		  Set<Integer> dupNumberSet = new HashSet<>();
		  for (Integer number : inputNumArray) {
			if(!dupNumberSet.add(number)) {
				System.out.println("Duplicate Element found:"+number);
			}
		}
		/*
		 * for(Integer number: inputNumArray) { if(!dupNumberSet.add(number)) {
		 * System.out.println("Duplicate Element found: "+number);
		 * 
		 * } }
		 */
	}
}
