import java.util.Scanner;
public class DriversLicense {

	public static final int MIN_AGE = 16;
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter your age (in years): ");
		
		int age = key.nextInt();
		
		//input validation
		
		if(age < 0)
		{
			System.out.println("Invalid age entered. Exiting the program!");
			System.exit(0);
		}
		if (age >= MIN_AGE)
		{
			System.out.println("You are eligble to drive!");
		}
		else
		{
			int waitTime = MIN_AGE - age;
			
			System.out.println("You will have to wait another "+ waitTime+" years to become eligble for a driver\'s license!");
			
		}

	}

}
