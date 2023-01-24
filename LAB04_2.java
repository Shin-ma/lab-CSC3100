//Name: Shahrul Amin bin Saidul Amin
//Matric Number: 216876
//Program: String Calculation And Combination
//Lab Assignment Number: (Lab 4) Question 2
package lab_1st_sem;
import java.util.Scanner;

public class LAB04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter first String: ");
	String password = input.nextLine();
	int passwordLength = password.length();
	
		for (passwordLength = password.length();passwordLength >= 8;) {
			System.out.print("\nValid password!!");
			System.out.printf("\nFirst String : \" %s \" with length %d",password, passwordLength);
			break;
		}
		
		for (passwordLength = password.length(); passwordLength < 8;) {
			System.out.print("\nInvalid password");
			System.out.print("\n\nEnter first String: ");
			password = input.nextLine();
			passwordLength = password.length();
			
			if(passwordLength<8)
				continue;
			
			if (passwordLength >= 8) 
				System.out.print("\nValid password!!");
				System.out.printf("\nFirst String : \" %s \" with length %d",password, passwordLength);
		}

	System.out.print("\n\nEnter second String: ");
	String secondString = input.nextLine();
	int subString = password.indexOf(secondString);
	
		for(subString = password.indexOf(secondString); subString == -1;) {
			System.out.print("Second String not exists in First String");
			System.out.printf("\n\nNew Statement in String 1 : %s%s", password, secondString);
			break;
			}
		
		for(subString = password.indexOf(secondString); subString != -1;) {
			System.out.print("Second String exists in First String");
			System.out.print("\n\nEnter second String: ");
			secondString = input.nextLine();
			subString = password.indexOf(secondString);
			
			if(subString!= -1)		
				continue;
			
			if(subString== -1)
				System.out.print("Second String not exists in First String");
				System.out.printf("\n\nNew Statement in String 1 : %s%s", password, secondString);	
			}
		
	input.close();

	}
}
