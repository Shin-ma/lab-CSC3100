//Matric Number: 216876
//Name: Shahrul Amin bin Saidul Amin
//Program: Bachelor of Software Engineerng with Hons
//Lab Assignment Number: Lab 5 (question 2_1)
package lab_1st_sem;
import java.text.DecimalFormat;

public class LAB05_2_1 {

	private static final DecimalFormat df = new DecimalFormat("0.000");
	private static final DecimalFormat fd = new DecimalFormat("0");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ping = 10;
		double meterSquare = 30;
		System.out.print("\nPing		Square meter	|	Square meter	Ping");
		for (int i=1; i<=15; i++) {
			double squareMeter = ping*3.305;
			double pingTwo  = 	meterSquare/3.305;
			System.out.print("\n"+fd.format(ping) +"\t\t" + df.format(squareMeter)	+"		|	"	+ fd.format(meterSquare) + "\t\t"+df.format(pingTwo));
			ping = ping+5;
			meterSquare = meterSquare +5;
		}
	}
}
