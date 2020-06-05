package practiceAssignments;

public class FindPairs {
	public static void main(String args[]) 
    { 
        int[] arr = { 3, 6, 8, -8, 10, 8  }; 
        int sum = 16; 
        getPairsCount(arr, sum); 
    } 
  
    // Prints number of pairs in arr[0..n-1] with sum equal 
    // to 'sum' 
    public static void getPairsCount(int[] arr, int sum) 
    { 
    	System.out.println("pairs with sum 16 are:");
        int count = 0;// Initialize result 
  
        // Consider all possible pairs and check their sums 
        for (int i = 0; i < arr.length; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if ((arr[i] + arr[j]) == sum)
                	
                	System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    count++; 
  
        System.out.printf("Count of pairs is %d",count); 
        
    } 

}
