
public class FindMax {
	//Given a binary array, find the maximum number of consecutive 1s in this array.

	public int findMaxConsecutiveOnes(int[] nums) {
		int counter_one = 0;
		int current_count = 0;
		boolean found_one = false;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 1) {
				found_one = true;
				if(found_one) {
					current_count++;
				}
			} else {
				if (current_count > counter_one) {
					counter_one = current_count;
				}
				found_one = false;
				current_count = 0;
			}
		}
		if (current_count > counter_one) {
			counter_one = current_count;
		}
		
		return counter_one;
	}

	public static void main(String[] args) {
		int nums[] = {1,0};
		
		FindMax FindMaxInstance = new FindMax();
		System.out.println(FindMaxInstance.findMaxConsecutiveOnes(nums));
	}

}
