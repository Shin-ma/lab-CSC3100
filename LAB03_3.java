package lab_1st_sem;
import java.util.Scanner;
import java.text.DecimalFormat;

public class LAB03_3 {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	private static final DecimalFormat fd = new DecimalFormat("0");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input = new Scanner (System.in);
		
		System.out.print("Customer IDNO: ");
		double id = input.nextDouble();
		
		System.out.print("Customer Name: ");
		String name = input.next();
		
		System.out.print("Unit Consumed: ");
		double unit = input.nextDouble();
		
		input.close();
		
		System.out.print("Electricity Bill");
		System.out.print("\nCustomer IDNO: " + fd.format(id));
		System.out.print("\nCustomer Name: " + name);
		System.out.print("\nUnit Consumed: " + fd.format(unit));
		
		
		
		if ((unit>=0) && (unit<=199)) {
			double charges = unit*1.2;
			System.out.print("\nAmount Charges @RM 1.20 per unit : " + df.format(charges));
			if (charges>=400) {
				double surcharge = charges*0.15;
				System.out.println("\nSurcharge Amount : " + df.format(surcharge));
				double netAmt = charges + surcharge;
				System.out.print("\nNet Amount Paid By the Customer : " + df.format(netAmt));
			}
		}
		
		if ((unit>=200) && (unit<=400)) {
			double charges = unit*1.5;
			System.out.print("\nAmount Charges @RM 1.50 per unit : " + df.format(charges));
			if (charges>=400) {
				double surcharge = charges*0.15;
				System.out.print("\nSurcharge Amount : " + df.format(surcharge));
				double netAmt = charges + surcharge;
				System.out.print("\nNet Amount Paid By the Customer : " + df.format(netAmt));
			}
		}
		
		if ((unit>=400) && (unit<=600)) {
			double charges = unit*1.8;
			System.out.print("\nAmount Charges @RM 1.80 per unit : " + df.format(charges));
			if (charges>=400) {
				double surcharge = charges*0.15;
				System.out.print("\nSurcharge Amount : " + df.format(surcharge));
				double netAmt = charges + surcharge;
				System.out.print("\nNet Amount Paid By the Customer : " + df.format(netAmt));
			}
		}
		
		if ((unit>= 600)) {
			double charges = unit*2;
			System.out.print("\nAmount Charges @RM 2.00 per unit : " + df.format(charges));
			if (charges>=400) {
				double surcharge = charges*0.15;
				System.out.print("\nSurcharge Amount : " + df.format(surcharge));
				double netAmt = charges + surcharge;
				System.out.print("\nNet Amount Paid By the Customer : " + df.format(netAmt));
			}
		}
		

		
	}

}
