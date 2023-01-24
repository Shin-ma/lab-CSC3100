package lab_1st_sem;
import java.util.Scanner;
import java.text.DecimalFormat;

public class LAB02_2 {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner (System.in);

	System.out.println("Please enter:");

//input for previous net balance
	System.out.print("Previous Net Balance: ");
		double prevNetBalance = input.nextDouble();

//input for payment amount
	System.out.print("Payment amount: ");
		double paymentAmt = input.nextDouble();

//input for number of days in the billing cycle
	System.out.print("Number of Days in the billing cycle: ");
		double daysBillingCycle = input.nextDouble();

//input for the day of the payment was made
	System.out.print("The day of the payment was made: ");
		double paymentMade = input.nextDouble();

//input for monthly interest rate
	System.out.print("Monthly interest rate: ");
		double interestRate = input.nextDouble();

	input.close();
		
//calculation for interest charge
		double step1 = prevNetBalance*daysBillingCycle;
		double step2 = paymentAmt*paymentMade;
		double step3 = step1-step2;
		double step4 = step3/daysBillingCycle;
		double step5 = step4*(interestRate/100);
		
//output interest charge
		System.out.print("\nThe interest charge is "+ df.format(step5));	

	}

}
