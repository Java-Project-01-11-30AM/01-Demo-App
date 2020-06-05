package practiceAssignments;

import java.util.HashSet;
import java.util.Set;

/*java program to remove duplicate elements from an array using collection APIs*/

public class SumOfUniqueelementsFromArray {

	public static void main(String[] args) {
		// int[] inputArrayWithDupElements = {1, 6, 4, 3, 2, 2, 3, 8, 1};
		int[] inputArrayWithDupElements = { 1, 1, 3, 2, 2, 3 };
		int sum = 0;
		Integer[] outputArrayWithoutDupElements = removeDuplicatesUsingSet(inputArrayWithDupElements);

		System.out.println("Original array : : :");
		for (int element : inputArrayWithDupElements) {
			System.out.println(element);
		}
		System.out.println("Unique elements are: : :");
		for (int element : outputArrayWithoutDupElements) {
			System.out.println(element);
		}
		for (int element : outputArrayWithoutDupElements) {
			sum = sum + element;
		}
		System.out.println("Sum of unique elements is:" + sum);
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
