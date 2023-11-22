import javax.swing.JOptionPane;
import java.util.*;
import java.text.*;
public class Practice1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9)*100000;
		String Withdraw = JOptionPane.showInputDialog("Your balance : "+balance
				+"\nInput money to withdraw : ");
		int sWithdraw = Integer.parseInt(Withdraw);
		String error = "Error";
		if(sWithdraw > balance) {
			JOptionPane.showMessageDialog
			(null, "Error: Cannot withdraw more than balance", error, JOptionPane.ERROR_MESSAGE);
		}
		else if(sWithdraw > 20000) {
			JOptionPane.showMessageDialog
			(null, "Error: Cannot withdraw more than 20,000", error, JOptionPane.ERROR_MESSAGE);
			
		}
		else if (sWithdraw % 100 != 0) {
			JOptionPane.showMessageDialog
			(null, "Error: Cannot withdraw 15 baht.", error, JOptionPane.ERROR_MESSAGE);
			
		}
		else {
			JOptionPane.showMessageDialog
			(null, "You withdraw "+frm.format(sWithdraw)+" baht."
			+"\n1000 = "+sWithdraw/1000+"\n500 = "+sWithdraw%1000/500
			+"\n100 = "+sWithdraw%1000%500/100);
		}
			
		

	}

}
