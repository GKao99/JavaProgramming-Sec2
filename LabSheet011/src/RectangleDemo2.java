import javax.swing.JOptionPane;

public class RectangleDemo2 {

	public static void main(String[] args) {
		double wid=Double.parseDouble(JOptionPane.showInputDialog("Input Width:"));
		double len=Double.parseDouble(JOptionPane.showInputDialog("Input Length:"));		
		Rectangle2 obj2 = new Rectangle2(wid,len);
		
		JOptionPane.showMessageDialog(null, obj2.toString()+"\nArea of Rectangle is "+obj2.getArea());
		

	}

}
