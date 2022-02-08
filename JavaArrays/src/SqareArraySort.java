import java.util.Arrays;

public class SqareArraySort {
	
	// Given an integer array nums sorted in non-decreasing order,
	// return an array of the squares of each number sorted in non-decreasing order.
	public int[] sortedSquares(int[] nums) {
		
        for (int i=0, len=nums.length; i<len; i++) {
        	nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        
        return nums;
    }

	public static void main(String[] args) {
		int[] nums = {-7,-3,2,3,11};
		
		SqareArraySort sq_instance = new SqareArraySort();
		System.out.println(Arrays.toString(sq_instance.sortedSquares(nums)));
	}
}
