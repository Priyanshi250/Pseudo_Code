package Class2_Array;

import java.util.*;

public class Second_Largest_in_Array {
	public static void main(String args[]) {
		int[] arr = {2,3,9,6,5,4,10};
		int max = arr[0];
		int second_max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] >max) {
				second_max = max;
				max = arr[i];
			}
			else if(arr[i] >second_max && arr[i] != max) {
				second_max = arr[i];
				
			}
		}
		System.out.println(second_max);
	}

}
