import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X,Y,Z;
		System.out.print("Input value of X : ");
		X = scan.nextInt();
		System.out.print("Input value of Y : ");
		Y = scan.nextInt();
		while(X>Y) {
				System.out.print("Input value of Y, again : ");
				Y = scan.nextInt();
				if(Y>X){
					break;
				}
			}
		int Total = X;
		while(Y>X) {
			System.out.println(Total+"+"+(X+1)+"="+(Total+X+1));
			Total=Total+X+1;
			X++;
		}

	}
		
}

