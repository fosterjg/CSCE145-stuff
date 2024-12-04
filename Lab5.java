//Joi Foster
import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many dollars would you like to spend on choclate from the vending machine?");
		int dollars = key.nextInt();
		
		if (dollars < 0) {
			System.out.println("Invalid Input. Exiting program!");
		}
		else {
			int totalChocolates = dollars;
			int coupons = totalChocolates;
		while (coupons >= 6) {
				int newChocolates = coupons / 6;
				totalChocolates += newChocolates;
				coupons = coupons % 6 + newChocolates;
				System.out.println("You can buy " + totalChocolates + " Chcolate bars and will have " + coupons + " coupons left.");

			}
			
		}
		
	
	}

}
