//Matric Number: 216876
//Name: Shahrul Amin bin Saidul Amin
//Program: Bachelor of Software Engineerng with Hons
//Lab Assignment Number: Lab 5 (question 2_3)
package lab_1st_sem;
import java.util.Scanner;

public class LAB05_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		
		int count=0, max=1;
		int number;
		
		while((number = input.nextInt()) != 0) {
		
			if (number>max) {
				max = number;
				count=1;
			}
			else if(number==max) {
				count++;
			}
		}
		System.out.print("The largest number is " + max);
		System.out.print("\nThe occurrence count of the largest number is " + count);
	}

}
