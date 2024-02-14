import java.io.*;
import java.util.*;
public class AddProduct {
	public static void main(String[] args) throws IOException{
		PrintWriter writeFile = new PrintWriter(new FileWriter("C://Users//2313110971//Downloads//txtFile//txtFile//Product.txt",true));
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Product ID: ");
		String productID = scan.next();
		System.out.print("Input Product Name: ");
		String productName = scan.next();
		System.out.print("Input Product Unit: ");
		int productUnit = scan.nextInt();
		System.out.print("Input Product Price: ");
		float productPrice = scan.nextFloat();
		
		writeFile.println(productID+","+productName+","+productUnit+","+productPrice);
		System.out.println("Save file already");
		writeFile.close();
		
	}
}
