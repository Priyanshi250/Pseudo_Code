package Class3_BinarySearch;

import java.util.*;
public class binary_search {
	public static int BinarySearch(int[]arr, int key) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<= high) {
			int mid = low+(high-low)/2;
			
			if(arr[mid] == key) {
				return mid;
			}else if(arr[mid] < key) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int[] arr = {2,4,6,8,10,12,14};
		int key = 10;
		
		System.out.println("index for key is: " + BinarySearch(arr,key));
	}

}
