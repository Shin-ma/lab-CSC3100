//Matric Number: 216876
//Name: Shahrul Amin bin Saidul Amin
//Program: Bachelor of Software Engineerng with Hons
//Lab Assignment Number: Lab 5 (question 4)
package lab_1st_sem;
import java.util.Scanner;
import java.text.DecimalFormat;

public class LAB05_4 {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		Character yes = 'Y';
		Character no = 'N';
		boolean istrue = true;
		int visitor =1;
		
		outer:
		while(istrue) {
			System.out.print("******VISITOR " + visitor + "*******");
			System.out.print("\nEnter your nationality: ");
			String nationality = input.nextLine();
			double charge =0.0;
			double total = 0.0;	
		
		while(istrue) {
			if (nationality.equals("M")) {
			System.out.print("Choose category of visitor (A - Adult, C - Children, S - Senior): ");
			char category = input.next().charAt(0);
			
			switch(category){
				case 'A':
					charge = 43.00;
					break;
					
				case 'C':
					charge = 16.00;
					break;
					
				case 'S':
					charge = 21.00;
					break;
					
				default:
					System.out.println("Invalid Input");
					continue;
			}
			
			System.out.print("Number of tickets: ");
			int tickets = input.nextInt();
			double totalCharge = charge*tickets;
			System.out.print("Visitor Type " + category + " Charge: " + df.format(totalCharge));
			total = total + totalCharge;
			System.out.println("\nBuy other ticket (Y/N)?: ");
			char other = input.next().charAt(0);

			
				if(other == yes) 
					break;
				
				if(other == no) {
					System.out.print("\nEnter another visitor (Y/N)?: ");
				char another = input.next().charAt(0);
				
					if(another == yes) 
					break;
				
					if(another ==  no) 
					istrue =false;
				}
			}
			
			else if (nationality.equals("F")) {
				System.out.print("From which part? (I - Kad/Working Permit/Dependent Pass, E - Asean, O - Others): ");
				char part = input.next().charAt(0);
				char category;
				
				switch(part) {
					case 'I':
						System.out.print("Choose category of visitor (A - Adult, C - Children, S - Senior): ");
						category = input.next().charAt(0);
				
						switch(category){
							case 'A':
								charge = 50.00;
								break;
								
							case 'C':
								charge = 25.00;
								break;
								
							case 'S':
								charge = 50.00;
								break;
								
							default:
								System.out.println("Invalid Input");
								continue;
						}
						break;
						
					case 'E':
						System.out.print("Choose category of visitor (A - Adult, C - Children, S - Senior): ");
						category = input.next().charAt(0);
				
						switch(category){
							case 'A':
								charge = 61.00;
								break;
								
							case 'C':
								charge = 33.00;
								break;
								
							case 'S':
								charge = 61.00;
								break;
								
							default:
								System.out.println("Invalid Input");
								continue;
						}
						break;
						
					case 'O':
						System.out.print("Choose category of visitor (A - Adult, C - Children, S - Senior): ");
						category = input.next().charAt(0);
				
						switch(category){
							case 'A':
								charge = 82.00;
								break;
								
							case 'C':
								charge = 43.00;
								break;
								
							case 'S':
								charge = 82.00;
								break;
								
							default:
								System.out.println("Invalid Input");
								continue;
						}
						break;
						
					default:
						System.out.println("Invalid Input");
						continue;	
				}
				System.out.print("Number of tickets: ");
				int tickets = input.nextInt();
				double totalCharge = charge*tickets;
				System.out.print("Visitor Type " + category + " Charge: " + df.format(totalCharge));
				total = total + totalCharge;
				System.out.println("\nBuy other ticket (Y/N)?: ");
				char other = input.next().charAt(0);
				
				
					if(other == yes) 
						continue;
					
					if(other == no) { 
						System.out.print("\nEnter another visitor (Y/N)?: ");
					char another = input.next().charAt(0);
					
						if(another == yes) 
						break;
					
						if(another ==  no) 
						istrue =false;
					}
			}		
			visitor++;
			continue outer;
			}
		}
	}
}
