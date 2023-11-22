import java.text.*;
import java.util.Scanner;
public class Lab101 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner InputData = new Scanner(System.in);
		System.out.print("Input Product Name      : ");
		String ProName = InputData.nextLine();
		System.out.print("Input Product Unit      : ");
		int ProductUnit = InputData.nextInt();
		System.out.print("Input Price per Unit    : ");
		double Price = InputData.nextDouble();
		
		System.out.println("--------------------------------");
		System.out.println("Total Price is "+(ProductUnit*Price)+" baht.");
		System.out.println("--------------------------------");
		System.out.print("How many discount (%)   : ");
		int Dis = InputData.nextInt();
		System.out.println("--------------------------------");
		System.out.println("Discount from    "+Dis+"%"+"       "
		                   +frm.format(ProductUnit*Price*15/100)+" baht.");
		System.out.println("Amount to be paid         "+frm.format(ProductUnit*Price-(ProductUnit*Price*15/100))+" baht.");
	}

}
