package Class2_Array;

public class num_appears_once_other_twice {
	public static void main(String args[]){
		int[] arr = {4,1,2,1,2};
		
		int unique = 0;
		
		for(int num : arr) {
			unique ^= num;
		}
		System.out.println(unique);
	}

}
