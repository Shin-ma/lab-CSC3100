//Matric Number: 216876
//Name: Shahrul Amin bin Saidul Amin
//Program: Bachelor of Software Engineerng with Hons
//Lab Assignment Number: Lab 5 (question 3)
package lab_1st_sem;
import java.util.Scanner;
import java.text.DecimalFormat;

public class LAB05_3 {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the monthly saving amount: ");
		double saving = input.nextDouble();
		double interest = 1+0.00417;
		double total = 0;
		
			for (int i=0; i<6; i++) {
					total = (saving + total)*interest;	
			}
		input.close();	
		System.out.print("After the sixth month, the account value is RM" + df.format(total));
		}
		
	}