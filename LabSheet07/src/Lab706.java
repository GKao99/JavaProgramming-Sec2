import javax.swing.*;
public class Lab706 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		
		int indexNums = Integer.parseInt(JOptionPane.showInputDialog("Input Index of Array : "));
		
		while(checkIndex(nums,indexNums)) {
			indexNums = Integer.parseInt(JOptionPane.showInputDialog("Input Index of Array, again : "));
		}
		int currentValue = currentData(nums,indexNums);
		JOptionPane.showMessageDialog(null, "Current data,nums["+indexNums+"] is "+currentValue 
				+((indexNums-1 < 0)?"\nNo Previous data":"\nPrevious data,nums["+(indexNums-1)+"] is "+prevData(nums,indexNums))
				+((indexNums+1 >= nums.length-1)?"\nNo next data":"\nnext data,nums["+(indexNums+1)+"] is "+nextData(nums,indexNums)));

	}//end main
	
	public static boolean checkIndex(int[] nums,int index) {
		//if((index>=nums.length) || (index < 0)) {
			//return true;
		//}
		//else return false;	
		return ((index>=nums.length) || (index < 0))?true:false ;
	}
	
	public static int currentData(int[] nums,int index){	
		return nums[index];
	}
	
	public static int prevData(int[] nums,int index) {
		return nums[index-1];
	}
	
	public static int nextData(int[] nums,int index) {
		return nums[index+1];
	}
	
	

}
