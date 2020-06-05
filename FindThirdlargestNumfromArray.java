package practiceAssignments;

public class FindThirdlargestNumfromArray {

	public static void main(String[] args) {
		//int[] a = { 6, 8, 1, 9, 2, 1, 10 };
		//int[] a = { 6, 8, 1, 9, 2, 1, 10, 12};
		int []a = {6};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+"");
			
		}
		
		System.out.println("Third largest eleent is: " + a[2]);
	}

}
