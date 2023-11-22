import javax.swing.JOptionPane;
import java.text.*;
public class Example1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int Price = 299;
		String Customer = JOptionPane.showInputDialog
				("How many customer per bill?", JOptionPane.YES_NO_OPTION);
		int AllCustomer = Integer.parseInt(Customer);
		int discount , totalprice=0;
		int memberCard;
		String Message = "Select an Option";
		totalprice = Price*AllCustomer;
		do {
			memberCard = JOptionPane.showConfirmDialog
					(null , "Total Price is " +frm.format(totalprice)
					+ " bath."+"\nDo you have a member card?", Message, JOptionPane.YES_NO_CANCEL_OPTION);
		}while(memberCard == JOptionPane.CANCEL_OPTION);
		if(memberCard == JOptionPane.YES_OPTION) {
			discount = totalprice*10/100;
			int disprice = totalprice-discount; 
			JOptionPane.showMessageDialog
			(null, "Amount to be paid is "+frm.format(disprice)+" baht.");
		}
		if(memberCard == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(totalprice)+" baht." );
		}

	}

}
