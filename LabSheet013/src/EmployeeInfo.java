import java.util.*;
import java.io.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String choice,depart;
		System.out.print("Insert or Read data?: ");
		choice = scan.next().toLowerCase();
		while(!(choice.equals("insert")) && !(choice.equals("read"))){
			System.out.print("Please type Insert or Read data,again: ");
			choice = scan.next().toLowerCase();
			
		}
		SaveAndOpen obj = new SaveAndOpen();
		if(choice.equals("insert")) {
			obj.insert();
		}
		else if(choice.equals("read")) {
			System.out.print("Enter dept: ");
			depart = scan.next();
			obj.setDept(depart);
			obj.read();
			
		}
		
			

	}

}
