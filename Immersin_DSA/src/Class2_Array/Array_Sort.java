package Class2_Array;

import java.util.*;

public class Array_Sort {
	public static void main(String args[]) {
		int[] arr = {2,3,9,6,5,4,10};
		for(int i = 0;i<arr.length;i++) {
		if(arr[i]<arr[i+1]) {
			System.out.println("Array is sorted");
		}
		else {
			System.out.println("Array is not sorted");
		}
	}
	}

}
