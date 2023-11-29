import java.text.*;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		Scanner InputData = new Scanner(System.in); 
		int currentnum , previousnum;
		System.out.print("Input number : ");
		previousnum = InputData.nextInt();
		System.out.print("Input number : ");
		while(true) {
			currentnum = InputData.nextInt();
			if(currentnum < previousnum) {
				System.out.println("BYE BYE");
			}
		}

	}
		
}
