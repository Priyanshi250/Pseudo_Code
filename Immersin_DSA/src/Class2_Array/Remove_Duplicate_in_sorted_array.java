package Class2_Array;

public class Remove_Duplicate_in_sorted_array {
	public static void main(String args[]) {
		int[] arr = { 1,1,2,2,3,4,4,5};
		if(arr.length == 0) {
			System.out.println("0");
		}
		int index = 1;
		
		for(int i =1;i<arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				arr[index] = arr[i];
				index++;
				
			}
		}
		System.out.println(index);
	}

}
