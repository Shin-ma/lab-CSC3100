package lab_1st_sem;
import java.util.Scanner;

public class LAB03_2 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Do you have a driving permit (Y/N)? ");
		String drivingPermit = input.nextLine();
		
			if ((drivingPermit.equals("n")) || (drivingPermit.equals("N"))) {
				System.out.print("Driving permit is a prequisite to purchase a vehicle!");
			}
			
			else if ((drivingPermit.equals("y")) || (drivingPermit.equals("Y"))) {
				System.out.print("Do you have a commercial driving license (Y/N)? ");
				String commercialLicense = input.nextLine();
				
				if ((commercialLicense.equals("n")) || (commercialLicense.equals("N"))) {
					System.out.print("Commercial driving license is a prerequisite to purchase a vehicle!");
				}
					else if ((commercialLicense.equals("y")) || (commercialLicense.equals("Y")));{
						System.out.print("Congratulations! You can purchase a vehicle, let's start talking options!");
				}
				
				
			}
		
	}

}
