public class FindEven {
	//Given an array nums of integers, return how many of them contain an even number of digits.

	static int countDigit(int num) {
		int count = 0;
		while(num>0) {
			num/=10;
			count++;
		}
		
		return count;
	}
    
    public int findNumbers(int[] nums) {
        int m = 0;
		
		for (int num : nums) {
			if (countDigit(num)%2 == 0) {
				m++;
			}
		}
		
		return m;
    }
    
	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		
		FindEven FindEvenInstance = new FindEven();
		System.out.println(FindEvenInstance.findNumbers(nums));
	}

}
