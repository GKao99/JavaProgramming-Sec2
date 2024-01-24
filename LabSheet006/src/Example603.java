import java.util.*;
public class Example603 {
	static String fullname,firstName;
	static String abbname;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name,separated by a space. \n:");
		String fullname = scan.nextLine();
		String firstName = fullname.substring(0,fullname.indexOf(" "));
		String abbname = abbreviatName(fullname);
		int space = fullname.indexOf(' ');
		String name = fullname.substring(0,space);	
	    System.out.println(abbreviatName(fullname)+name);
	   }
	   
	public static String abbreviatName(String fullname) {
		String name = "";
		for(int i = 0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				name = name + fullname.charAt(i+1)+".";		
	        }
        } 
		return name;
	
	}
}
