import javax.swing.JOptionPane;
public class Example2 {

	public static void main(String[] args) {
		double Weight = Double.parseDouble(JOptionPane.showInputDialog
				("Input Weight: "));
		double Height = Double.parseDouble(JOptionPane.showInputDialog
				("Input Height: "));
		Height = Height/100;
		double BMI = Weight/(Height*Height);
		String BMICategory;
		JOptionPane.showMessageDialog(null, "BMI = "+String.format("%.1f", BMI) );
		if(BMI<18.5) {
			BMICategory="Underweight";
		}
		else if(BMI<25) {
			BMICategory="Normal-weight";
		}
		else if(BMI<30) {
			BMICategory="Overweight";
		}
		else {
			BMICategory="Obesity";
		}

	}

}
