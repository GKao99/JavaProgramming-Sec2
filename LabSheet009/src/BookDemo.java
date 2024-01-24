import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Book Title : ");
		String title = scan.nextLine();
		System.out.print("Input Book Price : ");
		float price = scan.nextFloat();
		System.out.print("Input Publish Year : ");
		int publishyear = scan.nextInt();
		Book bok = new Book();
		bok.setTitle(title);
		bok.setPrice(price);
		bok.setYear(publishyear);
		System.out.println(bok);

	}

}
