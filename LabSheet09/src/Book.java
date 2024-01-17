import java.time.Year;

public class Book {
	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return this.price;
	}
	public void setYear(int year) {
		this.publishyear = year;
	}
	public int getYear() {
		return this.publishyear;
	}
	public int getTotalYear() {
		int thisyear = Year.now().getValue();
		int total = thisyear - publishyear;
		return total;
	}
	public String toString() {
		return "Title : "+title+" Publishes for "+getTotalYear()+" year "+"("+price+" baht).";
	}

}
