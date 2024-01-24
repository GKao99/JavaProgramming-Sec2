import java.util.*;
public class Example501 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		String Word;
		String text = "";
		while(true) {
			System.out.print("Enter word: ");
			Word = Input.next();
			if (Word.equalsIgnoreCase("Stop")) {
				break;
			}
			text = text+Word+" ";
		}
		System.out.print(text.toUpperCase());

	}

}
