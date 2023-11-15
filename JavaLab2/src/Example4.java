import javax.swing.JOptionPane;
import java.text.*;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String Name = JOptionPane.showInputDialog
				("Input Product name : ");
		String Unit = JOptionPane.showInputDialog
				("Input Product Unit : ");
		String Price = JOptionPane.showInputDialog
				("Input Price per Unit : ");
		
		Double ProUnit = Double.parseDouble(Unit);
		Double ProPrice = Double.parseDouble(Price);
		JOptionPane.showMessageDialog
		(null, "Total Price is "+frm.format(ProUnit*ProPrice)+" Baht.\n"+"Add VAT 7% is "
				+frm.format((ProUnit*ProPrice*7/100)+ProUnit*ProPrice)+" Baht.");
	}

}
