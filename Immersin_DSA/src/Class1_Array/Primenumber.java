package Class1_Array;

import java.util.*;
public class Primenumber {
	
	public static  boolean isPrime(int n) {
		for(int i =2;i<n/2;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i =0;i<n;i++) {
			System.out.println(isPrime(arr[i]));
		
	}
		

		        

	}

}
  // optimal approach is square root of n