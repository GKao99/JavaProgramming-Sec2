import java.text.*; //1. import library for format number
public class Example2 {

	public static void main(String[] args) {
		//2. define object call DecimalFormat Class
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		final int BUFFET = 299; 
		int NUMofCUS = 5;
		
		float TotalPrice = BUFFET*NUMofCUS;
		//3.apply frm object to totalPrice
		System.out.println("Buffet of "+NUMofCUS+" customers is "
		+frm.format(TotalPrice));
		System.out.println("Add Service Charge 3% is "
		+frm.format((TotalPrice*3/100)+TotalPrice));

	}

}
