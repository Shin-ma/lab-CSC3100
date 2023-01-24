package lab_1st_sem;
import java.util.Scanner;
import java.text.DecimalFormat;

public class LAB03_1 {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
		
//input from user on number of bags ordered
	System.out.print("Number of Bags Ordered: ");
		int bags_ordered = input.nextInt(); 
	while (true) {
		
		if (bags_ordered <=0) {
			System.out.print("Error, please try again.");
			System.out.print("\nNumber of Bags Ordered: ");
			bags_ordered = input.nextInt();
			}
		else
			break;
	}
	
	input.close();
	
		double price_bags = bags_ordered*5.5;
	System.out.print("\t\t      = RM" + df.format(price_bags));
	
	
		if ((bags_ordered >=1) && (bags_ordered <25)) {
			System.out.print("\n\nDiscount:");
			System.out.print("\n\n\t   0% - RM" + price_bags*0);
		}
		
		if ((bags_ordered >=25) && (bags_ordered <50)) {
			System.out.print("\n\nDiscount:");
			double  discount = price_bags*0.05;
			System.out.print("\n\n\t   5% - RM" + df.format(discount));
		}
		
		if ((bags_ordered >=50) && (bags_ordered <100)) {
			System.out.print("\n\nDiscount:");
			double discount = price_bags*0.1;
			System.out.print("\n\n\t   10% - RM" + df.format(discount));
		}
		
		if ((bags_ordered >=100) && (bags_ordered <150)) {
			System.out.print("\n\nDiscount:");
			double  discount = price_bags*0.15;
			System.out.print("\n\n\t   15% - RM" + df.format(discount));
		}
		
		if ((bags_ordered >=150) && (bags_ordered <200)) {
			System.out.print("\n\nDiscount:");
			double  discount = price_bags*0.2;
			System.out.print("\n\n\t   20% - RM" + df.format(discount));
		}
		
		if ((bags_ordered >=200) && (bags_ordered <300)) {
			System.out.print("\n\nDiscount:");
			double  discount = price_bags*0.25;
			System.out.print("\n\n\t   25% - RM" + df.format(discount));
		}	
		
		if (bags_ordered >=300) {
			System.out.print("\n\nDiscount:");
			double  discount = price_bags*0.3;
			System.out.print("\n\n\t   30% - RM" + df.format(discount));
		}
	
	System.out.println("\n\nBoxes Used: ");
	int largeBox = bags_ordered/20;
	int mediumBox = (bags_ordered%20)/10;
	int smallBox = ((bags_ordered%20%10)/5);
	 if (smallBox == bags_ordered%20%10%5) {
		 smallBox++;
	 }
	
	double priceLarge = largeBox*1.8;
	double priceMedium = mediumBox*1;
	double priceSmall = (++smallBox)*0.6;
	
	System.out.print("\n\t" + largeBox +" Large\t\t\t - RM" + df.format(priceLarge));
	System.out.print("\n\t" + mediumBox +" Medium\t\t - RM" + df.format(priceMedium));
	System.out.print("\n\t" + smallBox++ +" Small\t\t\t - RM" + df.format(priceSmall));
	
	
	
		if ((bags_ordered >=1) && (bags_ordered <25)) {
			double pricetotal = price_bags + priceLarge + priceMedium + priceSmall;
			System.out.print("\n\nYour Total cost is: RM " + df.format(pricetotal));
		}
		
		if ((bags_ordered >=25) && (bags_ordered <50)) {
			double  discount = price_bags*0.05;
			double pricetotal = (price_bags - discount) + priceLarge + priceMedium + priceSmall;
			System.out.print("\n\nYour Total cost is: RM " + df.format(pricetotal));
		}
		
		if ((bags_ordered >=50) && (bags_ordered <100)) {
			double discount = price_bags*0.1;
			double pricetotal = (price_bags - discount) + priceLarge + priceMedium + priceSmall;
			System.out.print("\n\nYour Total cost is: RM " + df.format(pricetotal));
		}
		
		if ((bags_ordered >=100) && (bags_ordered <150)) {
			double  discount = price_bags*0.15;
			double pricetotal = (price_bags - discount) + priceLarge + priceMedium + priceSmall;
			System.out.print("\n\nYour Total cost is: RM " + df.format(pricetotal));
		}
		
		if ((bags_ordered >=150) && (bags_ordered <200)) {
			double  discount = price_bags*0.2;
			double pricetotal = (price_bags - discount) + priceLarge + priceMedium + priceSmall;
			System.out.print("\n\nYour Total cost is: RM " + df.format(pricetotal));
		}
		
		if ((bags_ordered >=200) && (bags_ordered <300)) {
			double  discount = price_bags*0.25;
			double pricetotal = (price_bags - discount) + priceLarge + priceMedium + priceSmall;
			System.out.print("\n\nYour Total cost is: RM " + df.format(pricetotal));
		}
		
		if (bags_ordered >=300) {
			double  discount = price_bags*0.3;
			double pricetotal = (price_bags - discount) + priceLarge + priceMedium + priceSmall;
			System.out.print("\n\nYour Total cost is: RM " + df.format(pricetotal));
		}
	
	}
}