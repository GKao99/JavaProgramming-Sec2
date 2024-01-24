import java.util.*;
import javax.swing.*;
public class Example601 {

	public static void main(String[] args) {
		inputEmail();		
	}
	
	public static void inputEmail() {
		String yourEmail = JOptionPane.showInputDialog("Input your Email:").toLowerCase();
		JOptionPane.showMessageDialog(null, "your Email is "+yourEmail);
		
		boolean chkEmail = checkEmail(yourEmail);
        displayEmail(chkEmail,yourEmail);
		
	}
	public static boolean checkEmail(String email) {
		if (email.endsWith("hotmail.com") || email.endsWith("gmail.com")) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void displayEmail(boolean chEmail,String uEmail) {
		if(chEmail == true) {
    		JOptionPane.showMessageDialog(null, "Your Email is " + uEmail);	
	    }
        else if (chEmail == false) {
		JOptionPane.showMessageDialog(null, "Your Email is not gmail or hotmail ");	
        }
	}
	

}
