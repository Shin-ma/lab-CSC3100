package lab_1st_sem;
import java.text.DecimalFormat;
import java.util.Scanner;

public class LAB01_5 {

//change format of decimal to only two decimal places
private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// declare user_input as a space where the user will give their answers
		Scanner user_input = new Scanner(System.in);
		
		//ask user to enter their driving distance
		System.out.println("Enter the driving distance: ");
		double distance = user_input.nextDouble(); 
		
		//ask user to enter the distance travelled by using 1 gallon
		System.out.println("Enter miles per gallon: ");
		double milesPerGallon = user_input.nextDouble();
		
		//ask user to enter the price for each gallon
		System.out.println("Enter price per gallon: ");
		double pricePerGallon = user_input.nextDouble();
		
		user_input.close();
		
		double costOfDriving = distance / milesPerGallon * pricePerGallon;
		System.out.println("The cost of driving is $" + df.format(costOfDriving));
	}

}
