import java.util.*;
public class TestPiggyBank {
    static Scanner scan = new Scanner(System.in);
    static PiggyBank pb = new PiggyBank();
	public static void main(String[] args) {
		
		/*PiggyBank pb = new PiggyBank();
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal()); 
		pb.addFive(100);*/	
		inputCoin();
		mainMenu();
		}
	
	public static void inputCoin() {
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please difine size of PiggyBank = ");
		int sizeofPiggy = scan.nextInt();
		pb.setPiggyBank(sizeofPiggy);
		System.out.println("Size of your PiggyBank : " + pb.getPiggyBank());
	}
	
	public static void mainMenu() {
		while(true) {
			System.out.println("============================================");
			System.out.println("Menu of PiggyBank");
			System.out.println("============================================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit");
			System.out.println("============================================");
			System.out.print("Please Select Menu[1-5] : ");
			int select = scan.nextInt();
			int insert = 0 ;
			if(select == 1) {
				System.out.print("Insert 1 Baht Money : ");
				insert = scan.nextInt();
				pb.addOne(insert);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(select == 2) {
				System.out.print("Insert 2 Baht Money : ");
				insert = scan.nextInt();
				pb.addTwo(insert);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(select == 3) {
				System.out.print("Insert 5 Baht Money : ");
				insert = scan.nextInt();
				pb.addFive(insert);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(select == 4) {
				System.out.print("Insert 10 Baht Money : ");
				insert = scan.nextInt();
				pb.addTen(insert);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if (select == 5){ 
				System.out.println("Bye Bye");
				break;
			}
		}
	}

}
