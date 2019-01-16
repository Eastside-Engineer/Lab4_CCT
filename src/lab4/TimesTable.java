package lab4;

import java.util.Scanner;

public class TimesTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String choice = ("y");// allows users to pick Y to continue
		
		while (choice.equalsIgnoreCase("y")) {//This allows input to take any case of y
		
		Scanner scnr = new Scanner(System.in);
	
		}do {// do - loop to make user pick between 1-100.
				System.out.println("Give me a number: ");
				userinput = scnr.nextInt();
			
			}
			System.out.println("Continue: Press Y or any key to exit");//Allows user to exit program
			choice = scnr.next();
	}
		scnr.close();
	
	}
}
