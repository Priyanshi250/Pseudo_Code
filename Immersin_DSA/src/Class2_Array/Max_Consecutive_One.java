package Class2_Array;

public class Max_Consecutive_One {
	public static void main(String args[]) {
		int[] nums = {1,1,0,1,1,1};
		int curr = 0;
		int max= 0;
		
		for(int i =0;i<nums.length;i++) {
			if(nums[i] == 1) {
				curr++;
			}
			else {
				max =Math.max(curr, max);
				curr= 0;
			}
		}
		System.out.println(curr);
	}

}
