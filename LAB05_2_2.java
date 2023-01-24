//Matric Number: 216876
//Name: Shahrul Amin bin Saidul Amin
//Program: Bachelor of Software Engineerng with Hons
//Lab Assignment Number: Lab 5 (question 2_2)
package lab_1st_sem;
import java.util.Scanner;
import java.text.DecimalFormat;

public class LAB05_2_2 {

	private static final DecimalFormat df = new DecimalFormat("0.000");
	private static final DecimalFormat fd = new DecimalFormat("0.00");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Loan Amount: ");
		int loan = input.nextInt();
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		
		System.out.print("\nInterest Rate	Monthly Payment	Total Payment");
		double annualInterest = 5;
		
		for(int i=0; i<=20; i++) {
			double monthlyInterest = annualInterest/1200;
			
			double monthlyPayment = loan * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, years*12));
			double totalPayment = monthlyPayment*years*12;
			System.out.print("\n" + df.format(annualInterest) + "%\t\t" + fd.format(monthlyPayment) + "\t\t" + fd.format(totalPayment));
			annualInterest = annualInterest + 0.25;
		}

	}

}
