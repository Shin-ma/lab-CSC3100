package lab_1st_sem;
import java.text.DecimalFormat;
import java.util.Scanner;

public class LAB01_4 {
//change format of decimal to only two decimal places
private static final DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		// declare user_input as a space where the user will give their answers
		Scanner user_input = new Scanner(System.in);
		
//ask user to enter their quiz1 and quiz2 marks
		System.out.println("Enter mark for Quiz1: ");
		double quiz1 = user_input.nextDouble(); 
		System.out.println("Enter mark for Quiz2: ");
		double quiz2 = user_input.nextDouble();
		double quizzes_avg = (quiz1 + quiz2) / 2;
		System.out.println("Your Quizzes average is: " + quizzes_avg);			
//ask user to enter their assignment1 and assignment2 marks
		System.out.println("Enter mark for Asignment1: ");
		double assignment1 = user_input.nextDouble();
		System.out.println("Enter mark for Asignment2: ");
		double assignment2 = user_input.nextDouble();
		double assignment_avg = (assignment1 + assignment2) / 2;
		System.out.println("Your Assignment average is: " + assignment_avg);		
//ask user to enter mid term and final year marks	
		System.out.println("Enter your Mid-Term Exam mark: ");
		double midTerm = user_input.nextDouble();
		System.out.println("Enter your Final Exam mark: ");
		double finalExam = user_input.nextDouble();
		
		user_input.close();
		
//show the final score  	
		double finalMark = (quizzes_avg * 0.15) + (assignment_avg * 0.25) + (midTerm * 0.2) + (finalExam * 0.4);
		System.out.println("Your final mark for SSK3100 is " + finalMark);		
//show percentage of each score		
		System.out.println("(Quiz: " + df.format(quizzes_avg * 0.15) + " Assignment: " + df.format(assignment_avg * 0.25) 
						+ " Mid-Term: " + df.format((midTerm * 0.2)) + " Final: " + df.format((finalExam * 0.4)) + ")" ); 
	}

}
