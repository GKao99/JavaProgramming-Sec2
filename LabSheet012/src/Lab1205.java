import java.util.*;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Header();
		Scanner scn1 = new Scanner(new File("C:\\\\Users\\\\2313110971\\\\Downloads\\\\txtFile\\\\txtFile\\\\student.txt"));
		String tmp = "";
		String id = "";
		String firstname = "";
		String lastname = "";
		String grade = "";
		int i = 1;
		while(scn1.hasNext()) {
			id = scn1.next();
			scn1.next();
			firstname = scn1.next();
			lastname = scn1.next();
			grade = scn1.next();
			scn1.next();
			System.out.println(i+".\t"+id+"\t"+Level(id)+"\t"+firstname.substring(0,1).toUpperCase()
					+"."+lastname+"\t"+grade+"\t"+Status(grade));
			i++;
			
			
		}
		scn1.close();
		//Level(id);
		//Status(grade);
		

	}
	
	public static String Level(String id){
		if(id.substring(0,2).equals("18")) {
			return "4th";
		}
		else return "3th";
	}
	
	public static String Status(String grade) {
		float gradeCheck = Float.parseFloat(grade);
		if(gradeCheck >= 2.00) return "Pass";
		else if(gradeCheck >= 1.00 ||gradeCheck < 2.00) return "Critical";
		else return "Retired";
	}
	
	public static void Header() {
		System.out.println("No."+"\t"+"ID"+"\t\t"+"Level"+"\t"+"Name"+"\t\t"+"Grade"+"\t"+"Status");
		System.out.println("************************************************************************************************************");

	}

}
