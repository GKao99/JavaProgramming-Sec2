import java.util.*;
import java.text.*;
public class Practice3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		final double COMMITSION_RATE = 0.15;
		final int SENTINEL = -1;
		int sales;
		double salary;
		while(true) {
			System.out.print("Enter sales in dollars(or -1 to end) : $");
			sales = scan.nextInt();
			
			if(sales == -1) {
				System.out.print("Bye");
				break;
			}
			else {
				System.out.print("Salary is : $"+frm.format(1000+sales*COMMITSION_RATE)+"\n");
			}
			
        }

	}
}
