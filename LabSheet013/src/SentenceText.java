import java.io.*;
import java.util.*;
public class SentenceText {

	public static void main(String[] args) throws IOException{
		PrintStream writeFile = new PrintStream(new File("C://Users//2313110971//Downloads//txtFile//txtFile//sentence.txt"));
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while(true) {
			System.out.print("Sentence: ");
			String word = scan.next();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			writeFile.println(i+"."+word);
			i++;
		}
		System.out.println("File is save!!");
		writeFile.close();

	}

}
