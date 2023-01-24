package lab_1st_sem;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LAB02_1 {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);

		System.out.println("\t\t\t\t\t\t\t\t\tCOMPUTER PROGRAMMING 1");
		System.out.println("\t\t\t\t\t\t\t\t\t\t(CSC3100)");
		System.out.println("\t\t\t\t\t\t\t***********MARKS EVALUATION APPLICATION**********");

		System.out.println("");
		System.out.print("PLEASE ENTER MARKS:-");

//enter marks for test 1 & 2				
		System.out.println("\n");
		
		System.out.print("\t FIRST TEST: ");
		double first_test = input.nextDouble();
		
		while(true)
		{
		if ((first_test > 50) || (first_test < 0)) {
			System.out.print("Invalid Input, PLease try again");
			System.out.print("\n\t FIRST TEST: ");
			first_test = input.nextDouble();
		}
		else 
			break;
		}
		
		System.out.print("\tSECOND TEST: ");
		double second_test = input.nextDouble();
		
		while(true)
		{	
		if ((second_test > 50) || (second_test < 0)) {
			System.out.print("Invalid Input, PLease try again");
			System.out.print("\n\tSECOND TEST: ");
			second_test = input.nextDouble();
		}	
		else 
			break;
		}
		
//enter & calculate marks for assignments

		System.out.println("");
		
		System.out.print("\tASSIGNMENT 1: ");
		double assignment_1 = input.nextDouble();
		
		while(true){
			if ((assignment_1 >30) || (assignment_1 < 0)) {
				System.out.print("Invalid Input, PLease try again");
				System.out.print("\n\tASSIGNMENT 1: ");
				assignment_1 = input.nextDouble();
			}
			else
				break;
		}

		System.out.print("\tASSIGNMENT 2: ");
		double assignment_2 = input.nextDouble();
		
		while(true){
			if ((assignment_2 >30) || (assignment_2 <0)) {
				System.out.print("Invalid Input, PLease try again");
				System.out.print("\n\tASSIGNMENT 2: ");
				assignment_2 = input.nextDouble();
			}
			else
				break;
		}

		System.out.print("\tASSIGNMENT 3: ");
		double assignment_3 = input.nextDouble();
		
		while(true){
			if ((assignment_3 >30) || (assignment_3 < 0)) {
				System.out.print("Invalid Input, PLease try again");
				System.out.print("\n\tASSIGNMENT 3: ");
				assignment_3 = input.nextDouble();
			}
			else
				break;
		}

		double total_assignment = assignment_1 + assignment_2 + assignment_3;

//enter mark for final examination				
		System.out.println("");
		
		System.out.print("FINAL EXAMINATION: ");
		double final_exam = input.nextDouble();
		
		while(true) {
			if ((final_exam >100) || (final_exam <0)) {
				System.out.print("Invalid Input, PLease try again");
				System.out.print("\nFINAL EXAMINATION: ");
				final_exam = input.nextDouble();
			}
			else
				break;
		}
		
	input.close();
		
//calculate final marks			
		double final_marks = (0.4 * first_test + 0.4 * second_test + total_assignment/3 + 0.3 * final_exam);

		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t\tCALCULATED MARKS");

		System.out.println("\n");
		System.out.println("TEST1 \t\tTEST2 \t\tAS1 \t\tAS2 \t\tAS3 \t\tSUB TOTAL \t\tFINAL");
		System.out.println("EXAM  \t\tTOTAL");
		System.out.println("\n");
		System.out.print(first_test+"("+df.format(first_test*0.4)+"%)" + "\t"+second_test+"("+df.format(second_test*0.4)+"%)" +
						"\t"+assignment_1 + "\t\t"+assignment_2 + "\t\t"+assignment_3 + 
						"\t\t" +total_assignment+"("+df.format(total_assignment/3)+"%)" + "\t\t"+final_exam+"("+df.format(final_marks*0.3)+"%)" );
		System.out.print("\n"+df.format(final_marks)+"%");
	
	}

}
