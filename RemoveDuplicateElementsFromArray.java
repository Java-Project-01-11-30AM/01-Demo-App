package practiceAssignments;

import java.util.HashSet;
import java.util.Set;

/*java program to remove duplicate elements from an array using collection APIs*/

public class RemoveDuplicateElementsFromArray {
	
	public static void main(String[] args) {
		int[] inputArrayWithDupElements = {1, 2, 5, 5, 6, 6, 7, 2};
		Integer[] outputArrayWithoutDupElements = removeDuplicatesUsingSet(inputArrayWithDupElements);
		
		System.out.println("Original array : : :");
		for (Integer element : outputArrayWithoutDupElements) {
			System.out.println(element);
		}
	}

	public static Integer[] removeDuplicatesUsingSet(int[] input) {
		
		Set<Integer> set = new HashSet<Integer>();
		for (Integer element : input) {
			set.add(element);			
		}
		Integer[] outputArrayWithoutDupElemtents = set.toArray(new Integer[set.size()]);
		
		return outputArrayWithoutDupElemtents;
	}

}
