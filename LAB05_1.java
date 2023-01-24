//Matric Number: 216876
//Name: Shahrul Amin bin Saidul Amin
//Program: Bachelor of Software Engineerng with Hons
//Lab Assignment Number: Lab 5 (question 1)
package lab_1st_sem;
import java.util.Scanner;

public class LAB05_1 {
	 public static void main(String[] args) {
	
		 Scanner input = new Scanner(System.in);
		 int product;
		 int quantity;
		 double price =0.0;
		 double retailValue = 0.0;
		 System.out.println("Enter 0 for product or quantity or both to display the total retail value ");
		 
		 do{
		 		System.out.println("Enter the product number. May choose product 1 to 5.");
		 		product = input.nextInt();
				 switch (product) {
				 	case 1:
				 		price = 2.98;
				 	break;
				 	
				 	case 2:
				 		price = 4.50;
			 		break;
				 	
				 	case 3:
				 		price = 9.98;
			 		break;
				 	
				 	case 4:
				 		price = 4.49;
			 		break;
				 	
				 	case 5:
				 		price = 6.87;
			 		break;
				 }
				 
				System.out.println("Enter the number of quantity");
				quantity = input.nextInt();	
				double total = quantity*price;
				retailValue = retailValue + total;
			 		
		 }while (product>=1 && product<=5);
		 
			if(product == 0 || quantity == 0);
	 		System.out.println("\nThe total retail value of all products sold: RM" + retailValue);
	 		
	input.close();
		
	
	 }
 }
