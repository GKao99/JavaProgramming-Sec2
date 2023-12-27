
public class Example701 {

	public static void main(String[] args) {
		int[] nums = {12,50,93,45,75,52,80};
		for(int i = 0 ;i<nums.length;i++) {
			System.out.println("nums["+i+"] = "+nums[i]);
			}
		System.out.println("using foreach to display value from array nums");
		int i=0;
		for(int _nums:nums) {
			System.out.println("nums["+i+"] = "+nums[i]);
			i++;
		}
		printArray(nums);

	}
	public static void printArray(int[] _nums) {
		System.out.println("using method to display value from array nums");
		for(int i = 0 ; i<_nums.length;i++) {
			System.out.println("nums["+i+"] = "+_nums[i]);
		}
		
		
	}

}
