import java.io.*;
public class Lab1203 {

	public static void main(String[] args)throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("C:\\Users\\2313110971\\Downloads\\txtFile\\txtFile\\BookData.txt"));
		String tmp = "";
		int countbook = 0,i=1;
		while((tmp = readFile.readLine()) !=null) {
			String[] data = tmp.split("\t");
			System.out.println(i+"."+data[0]+"("+data[1]+"), Rating "+data[2]+" publish on "+data[5]);
			countbook++;
			i++;
		}
		System.out.println("=====================================");
		System.out.println("Total number of book :"+ countbook);
		readFile.close();
		
	}

}
