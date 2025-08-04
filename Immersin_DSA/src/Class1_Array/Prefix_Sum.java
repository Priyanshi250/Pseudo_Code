package Class1_Array;

import java.util.*;

public class Prefix_Sum {
	public static void maxSubarraySum(int arr[]){
		int currSum = 0;
		int max_sum = Integer.MIN_VALUE;
		int prefix[] = new int[arr.length];
		
		prefix[0] = arr[0];
		
		for(int i =0 ;i<prefix.length;i++) {
			prefix[i] = prefix[i-1]+arr[i];
		}
		
		for(int i = 0;i<=arr.length;i++) {// start
			for(int j = i;j<=arr.length;j++) {//end
				currSum = 0;
				currSum = arr[i] == 0? prefix[arr[j]] : prefix[j] - prefix[i-1];
				
				if(currSum >max_sum) {
					max_sum = currSum;
					
				}
			}
			
		}
		System.out.println("max sum = " + max_sum);
		
	}
	public static void main(String args[]) {
		int arr[] = {1,-2,6,-1,3};
		maxSubarraySum(arr);
		
	}

}
