import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		int salary,age;
		int contributableSalary;
		double employeeContribution,employerContribution,totalContribution;
		System.out.print("Enter the mothly salary : $ ");
		salary = scan.nextInt();
		System.out.print("Enter the age : ");
		age = scan.nextInt();
		contributableSalary = Math.min(salary, SALARY_CEILING);
		if(age<=55) {
			System.out.printf("The employee's contribution is : $%.2f",(salary*EMPLOYEE_RATE_55_AND_BELOW));
			System.out.printf("\nThe employer's contribution is : $%.2f",(salary*EMPLOYER_RATE_55_AND_BELOW));
			System.out.printf("\nThe total contribution is : $%.2f",(salary*EMPLOYEE_RATE_55_AND_BELOW+salary*EMPLOYER_RATE_55_AND_BELOW));
		}
		else if(age<=60) {
			System.out.printf("The employee's contribution is : $%.2f",(salary*EMPLOYEE_RATE_55_TO_60));
			System.out.printf("\nThe employer's contribution is : $%.2f",(salary*EMPLOYER_RATE_55_TO_60));
			System.out.printf("\nThe total contribution is : $%.2f",(salary*EMPLOYEE_RATE_55_TO_60+salary*EMPLOYER_RATE_55_TO_60));
		}
		else if(age<=65) {
			System.out.printf("The employee's contribution is : $%.2f",(salary*EMPLOYEE_RATE_60_TO_65));
			System.out.printf("\nThe employer's contribution is : $%.2f",(salary*EMPLOYER_RATE_60_TO_65));
			System.out.printf("\nThe total contribution is : $%.2f",(salary*EMPLOYEE_RATE_60_TO_65+salary*EMPLOYER_RATE_60_TO_65));
		}
		else {
			System.out.printf("The employee's contribution is : $%.2f",(salary*EMPLOYEE_RATE_65_ABOVE));
			System.out.printf("\nThe employer's contribution is : $%.2f",(salary*EMPLOYER_RATE_65_ABOVE));
			System.out.printf("\nThe total contribution is : $%.2f",(salary*EMPLOYEE_RATE_65_ABOVE+salary*EMPLOYER_RATE_65_ABOVE));
		}
		

	}

}
