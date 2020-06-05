package practiceAssignments;

public class FindMaxDiffTwoElements {
	
	public static int diff(int[] a)
	{
		int diff = Integer.MIN_VALUE;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				diff = Integer.max(diff, a[j] - a[i]);
			}
		}

		return diff;
	}

	public static void main(String[] args)
	{
		int[] a = {2, 5, 1, 7, 3, 9, 5 };

		System.out.print("The maximum difference is " + diff(a));
	}
}


