import java.util.*;
import java.io.*;
public class SaveAndOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert() throws IOException {
		PrintStream writeFile = new PrintStream(new File("C://Users//2313110971//Downloads//txtFile//txtFile//employee.txt"));
		Scanner scan = new Scanner(System.in);	
		String answer;
		do {
			
			header();
			System.out.print("Enter name: ");
			name = scan.next();
			System.out.print("Enter department: ");
			dept = scan.next();
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again?: ");
			answer = scan.next();
		
		}while(answer.equalsIgnoreCase("y"));
		
	}
	public void read() {
		try {
			Scanner readFile = new Scanner(new File("C://Users//2313110971//Downloads//txtFile//txtFile//employee.txt"));
			boolean check = false;
			int i = 1;
			int employ = 0;
			header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(i+")"+name);
					i++;
					employ++;
					check = true;
				}
			
			}
			if(check == true) {
				header();
				System.out.println("Employee in dept "+super.getDept()+" is "+employ+" person.");
			}
			if(check == false) {
				System.out.println("Sorry, no dept : "+super.getDept()+"in file.");
			}
			readFile.close();
			
		}catch(IOException e){
			System.out.println("\nFile not found....");
		}
	}
	

}
