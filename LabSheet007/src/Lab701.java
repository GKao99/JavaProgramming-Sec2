import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[7];
		int oddcount = 0;
		for(int i = 0 ; i<nums.length ; i++) {
			System.out.print("Input number "+(i+1)+" : ");
			nums[i] = scan.nextInt();
		}
		for(int _nums:nums) {
			if (_nums%2!=0) {
				oddcount++;
			}
		}
		System.out.print("There are "+oddcount+" of odd number.");
		System.out.print("List of odd number : ");
		for(int _nums1:nums) {
			if(_nums1%2 != 0) {
				System.out.print(_nums1+" ");
			}
		}

	}

}
