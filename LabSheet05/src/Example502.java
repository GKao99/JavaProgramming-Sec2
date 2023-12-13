import javax.swing.JOptionPane;
public class Example502 {

	public static void main(String[] args) {
		String yourEmail = JOptionPane.showInputDialog("Input your email:");
		//check email start with @ or " " or not
		while(yourEmail.startsWith("@")||yourEmail.startsWith(" ")) {
			yourEmail = JOptionPane.showInputDialog("Input your email,again:");			
		}
		if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null, "Your E-mail is "+yourEmail);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Your E-mail is not hotmail.com or gmail.com");
		}

	}

}
