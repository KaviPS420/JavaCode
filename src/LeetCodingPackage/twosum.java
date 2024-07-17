package LeetCodingPackage;

import java.util.Arrays;

public class twosum {

	public static void main(String[] args) {
		//given array get targeted result number index
		
		int[] nums = {2, 8, 7, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Result: " + Arrays.toString(result));
		
			
	}
	
	
	
	    public static int[] twoSum(int[] nums, int target) {
	        int n = nums.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (nums[i] + nums[j] == target) {
	                    return new int[]{i, j};
	                }
	            }
	        }
	        return new int[]{};
	    }

	
}
