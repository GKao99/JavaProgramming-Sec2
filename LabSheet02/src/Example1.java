
public class Example1 {

	public static void main(String[] args) {
		String BookISBN = "IB2-6325-85-4-1 ";
		String BookTitle = "Basic Java Programming ";
		int BookUnit = 5; 
		float BookPrice = 225.75f;
		//double totalPrice = 1128.75;
		//double BookPrice = 225.75;
		//display to console below
		System.out.println("Book ISBN  : " +BookISBN );
		System.out.println("Book Title : " +BookTitle );
		System.out.println("Book Unit  : " +BookUnit+" Books.");
		System.out.println("Book Price : " +BookPrice+" Baht.");
		System.out.println("----------------------------------");
		System.out.println("Total Price is " +(225.75*5));
		//double vat = totalPrice +(totalPrice*7/100);
		System.out.println("Add VAT 7% " +((1128.75*7/100)+ 1128.75));
		
		
	}

}
