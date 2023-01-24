//Matric Number: 216876
//Name: Shahrul Amin bin Saidul Amin
//Program: Bachelor of Software Engineerng with Hons
//Lab Assignment Number: Lab 6 (question 3)
package lab_1st_sem;
import java.util.Scanner;

public class LAB06_3 {

	public static double readMark(String markType){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter mark for " +markType+": "); 
		double mark = input.nextDouble();
		return mark;
	}
	
	public static double calcQuizAvg(double quizOne, double quizTwo, double quizThree) {
		double quizAvg = (quizOne+quizTwo+quizThree)/3;	
		return quizAvg;
	}
	
	public static double calcAssignmentAvg(double assignmentOne, double assignmentTwo) {
		double assignmentAvg = (assignmentOne+assignmentTwo)/2;	
		return assignmentAvg;
	}
	
	public static double calcFinalMark(double quizAvg, double assignmentAvg, double midTermExam, double finalExam) {
		double finalMark = ((quizAvg*0.15)+(assignmentAvg*0.25)+(midTermExam*0.4)+(finalExam*0.5));
		return finalMark;
	}
	public static char getGrade(double finalMark) {
		char grade='x';
		if(finalMark>=80 && finalMark<=100) {
			grade = 'A';
		}
		else if(finalMark>=70 && finalMark<80) {
			grade = 'B';
		}
		else if(finalMark>=55 && finalMark<70) {
			grade = 'C';
		}
		else if(finalMark>=45 && finalMark<55) {
			grade = 'D';
		}
		else if(finalMark>=0 && finalMark<45) {
			grade = 'F';
		}
		return grade;
	}
	public static void displayMark(String studentName,double finalMark, char grade) {
		System.out.printf((studentName+", your final mark for CSC3100 is %.2\n and grade "+grade),finalMark);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner takeInput = new Scanner (System.in);
		String studentName="";
		double quizOne=0, quizTwo=0, quizThree=0, assignmentOne=0, assignmentTwo=0, midTermExam=0, 
				finalExam=0, quizAvg=0, assignmentAvg=0;
		double finalMark= calcFinalMark(quizAvg, assignmentAvg, midTermExam, finalExam);
		char grade= getGrade(finalMark);
		boolean isTrue =true;
		
		while(isTrue){
			System.out.print("Enter student's name: ");
			studentName=takeInput.nextLine();
			System.out.print("\n");
			quizOne=readMark("Quiz1"); 
			quizTwo=readMark("Quiz2");
			quizThree=readMark("Quiz3");
			quizAvg = calcQuizAvg(quizOne,quizTwo,quizThree);
			System.out.printf("Quizzes average is: %.2f\n", quizAvg);
			System.out.print("\n\n");
			assignmentOne=readMark("Assignment1");
			assignmentTwo=readMark("Assignment2");
			assignmentAvg= calcAssignmentAvg(assignmentOne,assignmentTwo);
			System.out.printf("Assignments average is: %.2f\n",assignmentAvg);
			
			while(true) {
				System.out.print("\n\n");
				midTermExam=readMark("Mid-Term Exam");
					if(midTermExam<=50) {
						break;
					}
					else
						System.out.println("Maximum mark for Mid-Term Examination is 50. Please enter again");
						continue;
	}
			while(true) {
				System.out.print("\n\n");
				finalExam=readMark("Final Exam");
				if(finalExam<=80) {
					break;
				}
				else
					System.out.println("Maximum mark for Final Examination is 80. Please enter again");
					continue;
			}
			System.out.print("\n\n");
			finalMark=calcFinalMark(quizAvg,assignmentAvg,midTermExam,finalExam);
			grade =getGrade(finalMark);
			displayMark(studentName,finalMark,grade);
			System.out.println("\nMore grade computation? y/n");
				char computation=takeInput.next().charAt(0);
				if(computation =='y') {
					System.out.print("\n\n");
					isTrue=true;
				}
				else if(computation=='n') {
					isTrue = false;
				}
					
		}
			
			
			
		
			
		
		
	}

}
