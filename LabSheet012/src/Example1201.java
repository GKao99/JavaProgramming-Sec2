import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example1201 {
	public static void main(String[] args)throws IOException{
		Scanner scn1 = new Scanner(new File("C:\\Users\\2313110971\\Downloads\\txtFile\\txtFile\\MemberLogin.txt"));
		while (scn1.hasNext()) {
			String list = scn1.nextLine();
			System.out.println(list);
		}
		scn1.close();
	}

}
