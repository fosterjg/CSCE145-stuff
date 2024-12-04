//Joi Foster
import java.util.Scanner;
public class Homework1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your information for the following questions!");
		System.out.println("First and Last Name: ");
		String name=key.nextLine();
		
		
		System.out.println("Age (in years): ");
		int age = key.nextInt();
		key.nextLine();

		System.out.println("Phone number(no dashes/parenthesis): ");
		String phone = key.nextLine();
		
		System.out.print("Major: ");
		String major= key.nextLine();
		
		
		System.out.println("Enter your year(e.g. freshman,sophmore.junior,senior): ");
		String year = key.nextLine();
		
		System.out.println("Today's date(mm/dd/yyyy): ");
		String date = key.nextLine();
		
		//additional questions
		System.out.println("Favorite ice cream flavor: ");
		String icecream = key.nextLine();
		
		System.out.println("Favorite movie: ");
		String movie = key.nextLine();
		
		System.out.println("Favorite song: ");
		String song = key.nextLine();
		
		//calculating the birth year
		int currentyear = 2024;
		int birthyear = currentyear - age;
		
		//convert the date into European format (dd.mm.yyyy)
		String[] dateParts = date.split("/");
	
		String europeanDate = dateParts[1] + "." + dateParts[0] + "." + dateParts[2];
		
		
		//formatting the phone number into (xxx)-xxx-xxxx
		String formattedPhoneNumber = "(" + phone.substring(0,3) + ")" + phone.substring(3,6) + "-" + phone.substring(6);
		
		//displaying the intro for/about the user
		System.out.println("Here's a quick intro for " + name +":");
		System.out.println("You were born in " + birthyear +". You are a curent " + year +" at the University of South Carolina majoring in " + major +". In your free time you like eating " + icecream +" ice cream while watching your favorite movie " + movie +". Your favorite song to listen to is " + song +". You can reach " + name+" at " +formattedPhoneNumber +".");
		System.out.println("Last Updated: " + europeanDate);
		
		
		
		
		
		
		

	}

}
