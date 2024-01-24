import javax.swing.*;
public class Example602 {

	public static void main(String[] args) {
		int inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
		
		while(!checkYear(inputYear)) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog("Pls ,Input year between 1000-3000:"
		                +"\nInput year again"));
		}
		if (isLeapYear(inputYear)==true){
			JOptionPane.showMessageDialog(null, inputYear + " is Leap year");
		}
		else {
			JOptionPane.showMessageDialog(null, inputYear + " is not Leap year");
		}
		

	}
	public static boolean isLeapYear(int year){
		if(year%4== 0 && year%100!=0 || year%400==0) {
			return true;
		}
		else return false;
			
		
	}
    public static boolean checkYear(int year){
    	if(year >= 1000 & year <=3000) {
    		return true;
    	}
    	else return false;
	}

}
