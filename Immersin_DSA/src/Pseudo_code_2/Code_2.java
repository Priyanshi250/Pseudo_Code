package Pseudo_code_2;

public class Code_2 {
	public static void update(int arr[] , int i) {
		arr[i] = arr[i] + 5;
	}
	public static void main(String args[]) {
		int arr[] = {1,2,3};
		update(arr,1);
		System.out.println(arr[1]);
		
	}

}
