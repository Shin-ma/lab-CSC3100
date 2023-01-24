//Name: Shahrul Amin bin Saidul Amin 
//Matric Number: 216876
//Program: String Calculation And Replacement
//Lab Assignment Number: (Lab 4) Question 1
package lab_1st_sem;
import java.util.Scanner;

public class LAB04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner (System.in);
	
//take input from user for 1st input
		System.out.print("Enter first string: ");
		String firstLine = input.nextLine();
//getting characters count from input	
		int firstLineLength = firstLine.length();
//if the count exceed 10		
			if (firstLineLength >= 10) {
				System.out.printf("Substring from 5 to 10 " + firstLine.substring(4,9) + ", length %d", firstLineLength);
			}
//if count is less than 10			
			for (firstLineLength = firstLine.length(); firstLineLength < 10;) {
				System.out.print("\nString length less than 10");
				System.out.print("\nEnter first string: ");
				firstLine = input.nextLine();
				firstLineLength = firstLine.length();
				
				if (firstLineLength < 10)
					continue;
				if (firstLineLength >= 10) 
					System.out.printf("Substring from 5 to 10 " + firstLine.substring(4,9) + ", length %d", firstLineLength);
			}

//take input from user for 2nd input
		System.out.print("\n\nEnter second string: ");
		String secondLine = input.nextLine();

//determine whether the second string exists in the first string
		int subString = firstLine.indexOf(secondLine);
		
//if the the string exist, replace that particular string with the word Selamat Datang		
			if (subString!= -1) {
				System.out.print("Second String exists in First String");
				String replaceString = firstLine.replace(secondLine, "Selamat Datang");
				System.out.printf("\n\nNew Statement in String 1: %s", replaceString);
			}

//if it is not exists		
			for(subString = firstLine.indexOf(secondLine); subString == -1;) {
				System.out.print("Second String not exists in First String");	
				System.out.print("\n\nEnter second string: ");
				secondLine = input.nextLine();
				subString = firstLine.indexOf(secondLine);
				
				if (subString == -1) 
					continue;
				if (subString != -1)
					System.out.print("Second String exists in First String");
					String replaceString = firstLine.replace(secondLine, "Selamat Datang");
					System.out.printf("\n\nNew Statement in String 1: %s", replaceString); 	
				
			}
	input.close();	
	}

}
