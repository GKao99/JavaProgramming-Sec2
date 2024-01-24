import java.util.*;
public class Example604 {
    static Scanner scan = new Scanner(System.in);
    static String studentID,strsubjectID;
    static int subjectID;
	public static void main(String[] args) {
		inputStudent();
		displayData(isITStudent(studentID),isITSubject(strsubjectID));
		

	}
	public static void inputStudent() {
		do {
			System.out.print("Enter Student ID: ");
			studentID = scan.next();
			System.out.print("Enter Subject ID: ");
			subjectID = scan.nextInt();
			strsubjectID = subjectID+"";
		}while(!(isLength(studentID,strsubjectID)));
		
	}
	public static boolean isLength(String stuid,String subid) {
		if(stuid.length() == 10 && subid.length() == 7) {
			return true;
		}
		else return false;
			
	}
	public static boolean isITStudent(String id) {
		if(id.substring(0,3).equals("211") && id.substring(3,6).equals("311")) {
			return true;		
		}
		else return false;
		
	}
    public static boolean isITSubject(String subID) {
    	if(subID.substring(0,2).equals("21")&&subID.substring(4,5).equals("1")) {
    		return true;
    	}
    	else return false;
		
	}
    public static void displayData(boolean stuID,boolean subID) {
		if(stuID) {
			System.out.println("Student id : "+studentID+" 1st year student in IT");
		}
		else {
			System.out.println("Student id : "+studentID+" is not 1st year student in IT");
		}
		if(subID) {
			System.out.println("Enoll in couses for Year 1");
		}
		else {
			System.out.println("not Enoll in couses for Year 1");
		}
	}

}
