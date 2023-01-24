package lab_1st_sem;
import java.text.DecimalFormat;

public class LAB01_2 {
	
	//change format of decimal to only two decimal places
	private static final DecimalFormat df = new DecimalFormat("0.00");
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//state the height in inches
double inches = 41.2;

//way to convert inches to centimeter is by multiply by 2.54
double centimeter = 2.54 * inches;

System.out.println("Your height in inches is:" + inches);
System.out.println("Your height in centimeter is:" + df.format(centimeter));


//state the weight in pounds
double pounds = 89.6;

//way to convert pounds into kilogram is by multiply by 0.454
double kilogram = 0.454 * pounds;

System.out.println("Your weight in pounds is:" + pounds);
System.out.println("Your weight in kilogram is:" + df.format(kilogram));
	}

}
