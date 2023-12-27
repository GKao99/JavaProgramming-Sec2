import java.text.*;
import java.util.*;
public class Lab702 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.00");
		Scanner scan = new Scanner(System.in);
		double[] nums = new double[5];
		double beaverage = 0;
		for(int i = 0 ; i<nums.length ; i++) {
			System.out.print("Input Score of Student "+(i+1)+" : ");
			nums[i] = scan.nextDouble();
			beaverage += nums[i];
		}
		double totalAverage = beaverage/nums.length;
		System.out.println("Average of 5 student is "+frm.format(totalAverage));
		for(int i = 0 ; i<nums.length ; i++) {
			if(nums[i]>totalAverage) {
				System.out.println("> Student "+(i+1)+" ("+frm.format(nums[i])+")");
			}
		}

	}

}
