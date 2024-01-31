import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		double wid=Double.parseDouble(JOptionPane.showInputDialog("Input Width:"));
		double len=Double.parseDouble(JOptionPane.showInputDialog("Input Length:"));
		String colorInput = JOptionPane.showInputDialog("Input Color:");
		
		Rectangle obj1 = new Rectangle(wid,len,colorInput);
		
		JOptionPane.showMessageDialog(null, obj1.toString()+"\nArea of Rectangle is "+obj1.getArea());
		

	}

}
