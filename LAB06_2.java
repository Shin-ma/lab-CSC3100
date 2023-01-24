//Matric Number: 216876
//Name: Shahrul Amin bin Saidul Amin
//Program: Bachelor of Software Engineerng with Hons
//Lab Assignment Number: Lab 6 (question 2)
package lab_1st_sem;
import java.util.Scanner;
import java.text.DecimalFormat;

public class LAB06_2 {
	public static char getGrade(int weight){
		char grade ='x';
			switch((weight<25) ? 0 : 
				  (weight <=29 && weight >= 25) ? 1 :
				  (weight <=44 && weight >=30) ? 2 :
				  (weight>44) ? 3 : 4 ) {
			case 0:
				grade = 'D';
				break;
			case 1:
				grade = 'C';
				break;
			case 2:
				grade = 'B';
				break;
			case 3: 
				grade = 'A';
				break;
			}
		
			return grade;
		}
	
	public static int countGrade(char grade) {
		int count=0;
			if(grade=='A') {
				count+=1;
			}
			else if(grade=='B') {
				count+=1;
			}
			else if(grade=='C') {
				count+=1;
			}
			else if(grade=='D') {
				count+=1;
			}
		
		return count;
		
	}
	private static final DecimalFormat fd = new DecimalFormat("0.00");
	public static void displayReport(int gradeACount, int gradeBCount, int gradeCCount, int gradeDCount, 
									double gradeAAverage, double gradeBAverage, double gradeCAverage, double gradeDAverage,
									double totalWeight){
		System.out.print("\nThe total amount of eggs by grade");
		System.out.print("\nGrade A: " + gradeACount);
		System.out.print("\nGrade B: " + gradeBCount);
		System.out.print("\nGrade C: " + gradeCCount);
		System.out.print("\nGrade D: " + gradeDCount);
		
		System.out.print("\nThe average weight of each grade produced");
		System.out.print("\nGrade A: " + fd.format(gradeAAverage));
		System.out.print("\nGrade B: " + fd.format(gradeBAverage));
		System.out.print("\nGrade C: " + fd.format(gradeCAverage));
		System.out.print("\nGrade D: " + fd.format(gradeDAverage));
		
		System.out.print("\nThe total amount of weight of all eggs produced: "+ totalWeight);
		
		
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		Scanner takeInput =new Scanner(System.in);
		boolean isTrue = true;
		
		while(isTrue) {
			int weight;
			char eggType, report;
			int gradeACount=0, gradeBCount=0, gradeCCount=0, gradeDCount=0;
			double gradeAAverage=0, gradeBAverage=0, gradeCAverage=0, gradeDAverage=0;
			double totalWeight=0, gradeATotal=0, gradeBTotal=0, gradeCTotal=0, gradeDTotal=0;
			
			System.out.print("Report "+ num);
			System.out.println("\n\nEnter weight for 10 eggs in grams");
			
				for(int i =1; i<=10; i++) {
					System.out.print(i+". ");
					weight=takeInput.nextInt();
					
					eggType = getGrade(weight);
					switch(eggType) {
					
					case 'A':
							gradeACount += countGrade(eggType);
							gradeATotal+=weight;
							break;	
					case 'B':
							gradeBCount+=countGrade(eggType);
							gradeBTotal+=weight;
							break;
					case 'C':
							gradeCCount+=countGrade(eggType);
							gradeCTotal+=weight;
							break;
					case 'D':
							gradeDCount+=countGrade(eggType);
							gradeDTotal+=weight;
							break;
					}
					totalWeight+=weight;
				}
				if (gradeACount != 0) {
					gradeAAverage = gradeATotal/gradeACount;}
				else 
					gradeAAverage =0;
				
				if (gradeBCount != 0) {
					gradeBAverage = gradeBTotal/gradeBCount;}
				else 
					gradeBAverage =0;
				
				if (gradeCCount != 0) {
					gradeCAverage = gradeCTotal/gradeCCount;}
				else 
					gradeCAverage =0;
				
				if (gradeDCount != 0) {
					gradeDAverage = gradeDTotal/gradeDCount;}
				else 
					gradeDAverage =0;
				
				displayReport(gradeACount, gradeBCount, gradeCCount, gradeDCount, 
						gradeAAverage, gradeBAverage, gradeCAverage, gradeDAverage,
						totalWeight);
				
				System.out.println("\nDo you want to enter data for another 10 eggs?");
				report = takeInput.next().charAt(0);
				if (report == 'y') {
					isTrue = true;
					num++;
				}
				else 
					isTrue = false;
		}
		
	}

}
