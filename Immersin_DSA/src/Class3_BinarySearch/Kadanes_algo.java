package Class3_BinarySearch;

public class Kadanes_algo {
	public static void kadanes(int arr[]) {
		int currSum = 0;
		int max_sum = Integer.MIN_VALUE;
			
			for(int i =0;i<arr.length;i++) {
				currSum += arr[i];
				if(currSum <0) {
					currSum = 0;
				}
				max_sum = Math.max(max_sum, currSum);
				
			}
			System.out.println(max_sum);
	}
	public static void main(String args[]) {
		int arr[] = {-2,-3,4,-1,-2,1,5,-3};
		kadanes(arr);
		
	}

}
