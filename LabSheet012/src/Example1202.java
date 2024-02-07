import java.io.*;
import java.util.*;

public class Example1202 {

	public static void main(String[] args)throws IOException{
		Scanner scnInput = new Scanner(System.in);
		System.out.print("Input Section: ");
		int sec = scnInput.nextInt();
		Header();
		showListStudent(sec);
	}
	
	public static void showListStudent(int sec) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("C:\\\\Users\\\\2313110971\\\\Downloads\\\\txtFile\\\\txtFile\\\\List107.txt"));
		String tmp = "";
		while((tmp = readFile.readLine()) !=null) {
			String[] data = tmp.split("\t");
			int secdata = Integer.parseInt(data[3]);
			double midterm = Double.parseDouble(data[4]);
			double finterm = Double.parseDouble(data[5]);
			if(secdata == sec) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midterm+"\t"+finterm+"\t"+findResult(midterm,finterm));
			}
		}
		readFile.close();
			
		
	}
	
	public static String findResult(double midterm,double finterm) {
		double total = midterm+finterm;
		return total <= 40?"Fail":"Pass";
		/*if(total<=40)
		return "Fail";
		else return "Pass";*/
		
	}
	
	public static void Header() {
		System.out.println("****************************************************************");
		System.out.println("\t\tList of Data for Section 1");
		System.out.println("****************************************************************");
	}

}
