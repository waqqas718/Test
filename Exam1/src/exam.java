import java.util.Scanner;
public class exam {




	//Declaring Variables
	static java.lang.String EventName;
	static int Quantity;
	static int Price; 
	static int Total; 


	//Module 1 - Introduction

	public static void Greeting () {
		System.out.println("------- Welcome ------- ");
		System.out.println("Please follow instructions to proceed");
	}


	// Module 2 - Input
	public static void GetInput () {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Please enter your event name");
		EventName = myScanner.nextLine();

		System.out.println("Enter quantity of tickets in whole number");
		Quantity = myScanner.nextInt();

		System.out.println("Enter Price of ticket in dollars");
		Price = myScanner.nextInt();
	}


	//Module 3 - Calculation
	public static void Calculate() {

		Total = Quantity * Price;

		System.out.println("Your total cost is" + " " + Total + " " + "dollars");

	}


	//Module 4 - Discounts
	public static void Discount() {

		double Discount = 0;

		if ((Total >= 1) && (Total <=100) ) {
			Discount = Total - 5;

			System.out.println("Your discounted price is" + " " + Discount);
		}


		else if ((Total >= 101) && (Total <=500) ) {
			Discount = Total - 10;

			System.out.println("Your discounted price is" + " " + Discount);

		}

		else if  ((Total >= 500)) {
			Discount = Total - 20;

			System.out.println("Your discounted price is" + " " + Discount);

		}

		else
			System.out.println("Please enter a valid price");
	}



	public static void main(String[] args) {
		Greeting();

		for (int i=0; i<5; i++) {
			GetInput();
			Calculate();
			Discount();

			String DoContinue;
			Scanner myscanner = new Scanner(System.in);
			System.out.println("Do you want to continue? yes or no");
			DoContinue = myscanner.nextLine();
			if (DoContinue.equalsIgnoreCase("yes") ) {
				//System.out.println ("follow process");
			}
			else if (DoContinue.equalsIgnoreCase("no") ) {
				break;
			}




		}
	}
}	