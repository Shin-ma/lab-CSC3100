//Matric Number: 216876
//Name: Shahrul Amin bin Saidul Amin
//Program: Bachelor of Software Engineerng with Hons
//Lab Assignment Number: Lab 6 (question 1)
package lab_1st_sem;
import java.util.Scanner;
import java.text.DecimalFormat;

public class LAB06_1 {
	private static final DecimalFormat df = new DecimalFormat("0.00");
	public static int getAge() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter age:");
		int age = input.nextInt();
		return age;
	}
	
	public static double getWeight() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight (kg):");
		double weight = input.nextDouble();
		return weight;
	}

	public static double getHeight() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter height (cm):");
		double height = input.nextDouble();
		return height;
	}
	
	public static char getGender() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Gender (f/m): ");
		char gender = input.next().charAt(0);
		return gender;
	}
	
	public static int getChoice() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter choice (1-BMI, 2-BMR): ");
		int choice = input.nextInt();
		return choice;
	}
	
	public static double calcBMI(double weight, double height) {
		double heightM = height/100;
		double bmi =weight/ Math.pow(heightM, 2);
		return bmi;
	}
	
	public static double calcBMR(double weight, double height, int age, char gender) {
		double bmr = 0.0;
		switch(gender){
			case 'm':
				bmr = (66+(6.23*weight)+(12.7 * height)-(6.8*age));
				break;
				
			case 'f':
				bmr = 655 + (9.6*weight) + (1.8*height) - (4.7*age);
				break;
		}
		return bmr;
	}
	
	public static void displayBMI(double height, double weight, double bmi) {
		System.out.print("Your height is " + height + "cm and weight is " + weight + "kg. So your BMI is " + df.format(bmi));
	}
	
	public static void displayBMR(int age, char gender, double bmr) {
		System.out.print("Your age is " + age + ". So your BMR is " + df.format(bmr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double height,weight,bmi,bmr;
		int age, choice;
		char gender;
		boolean istrue = true;
		Scanner scan = new Scanner(System.in);
		
		while(istrue) {
			age = getAge();
			weight = getWeight();
			height = getHeight();
			gender = getGender();
			choice = getChoice();
			
			if (choice == 1) {
				bmi = calcBMI(weight, height);
				displayBMI(height, weight, bmi);
			}	
				
			else if (choice == 2) {
				bmr = calcBMR(weight, height, age, gender);
				displayBMR(age, gender, bmr);
			}
	
			System.out.print("\nDo you want to continue?(y/n) ");
			char cnt = scan.next().charAt(0);
		
			if (cnt == 'y') {
				System.out.print("********************");
				System.out.println("");
				continue;
			}
			else if(cnt == 'n') {
				istrue = false;
			}
		}
	}

}
