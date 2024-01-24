import java.text.*;
import java.util.*;
//1. import library for input form press key and format number
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner InputData = new Scanner(System.in);
		System.out.print("Input Product Name   : ");
		String ProductName = InputData.nextLine();
		System.out.print("Input Product Unit   : ");
		int ProductUnit = InputData.nextInt();
		System.out.print("Input Price per Unit : ");
		double Price = InputData.nextDouble();
		System.out.println();
		System.out.println("Total Price is "+frm.format(ProductUnit*Price)+" Baht.");
		System.out.println("Add VAT 7%  is "
		+frm.format((ProductUnit*Price*7/100)+ProductUnit*Price)+" Baht.");
	}

}
