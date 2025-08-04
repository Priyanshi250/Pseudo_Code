package Class3_BinarySearch;

public class Subarrays {
	public static void printSubarray(int[]arr) {
		int ts = 0;// total subarray
		for(int i = 0;i<=arr.length;i++) {// start
			for(int j = i;j<=arr.length;j++) {//end
				for(int k = i;k<j;k++) {//start to end
					System.out.print(arr[k] + " ");// subarray
				}
				ts++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("toatl no. of subarray:-" + ts);
	}
	public static void main(String args[]) {
		int[] arr = {2,4,6,8,10,12,14};
		printSubarray(arr);
	}
}
