package lab_1st_sem;
import java.text.DecimalFormat;
import java.util.Scanner;

public class LAB01_3 {

//change format of decimal to only two decimal places
private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// declare user_input as a space where the user will give their answers
Scanner user_input = new Scanner(System.in);
		
//ask user to enter their name
System.out.println("Enter your name: ");
String name = user_input.next ();

//ask user to enter their weight
System.out.println("What is your weight in kilogram?");
double weight = user_input.nextDouble ();

//ask user to enter their height
System.out.println("What is height in meter?");
double height = user_input.nextDouble ();

user_input.close();

//calculate the BMI
double bmi = weight / (height * height);
		System.out.println("Your name is: " + name);
System.out.println("Your Body Mass Index (BMI) is: " + df.format(bmi));
	}

}
