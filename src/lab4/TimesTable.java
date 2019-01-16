package lab4;

import java.util.Scanner;

public class TimesTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		String input = "y";
		
		
		
		while (input.equalsIgnoreCase("y")){ 
		
		
		System.out.println("Enter an integer: ");
		int num = scnr.nextInt();
		
		System.out.printf("%-22s%-22s%-22s\n","Number ","Squared ","Cubed ");
		System.out.printf("%-22s%-22s%-22s\n","~~~~~~ ","~~~~~~","~~~~~~");
		
		for (int i = 1; i <= num; i++) {
			System.out.printf("%-22d%-22d%-22d\n",i, i*i, i*i*i);
			System.out.println();
		}
		
		System.out.println("Continue?: (y/n)");//Allows user to exit program
		input = scnr.next();
		}
		
		System.out.println("Multiplication table?: (y/n)");
		String mood = scnr.next();
		
		while (mood.equalsIgnoreCase("y")){ 

		System.out.println("PICK A NUMBER!: ");
		int num2 = scnr.nextInt();
		
		for (int j=1; j <= num2; j++){
		    for (int k=1; k <= num2; k++){ 
		    	System.out.print(j*k + "\t");
		    }
		    System.out.println();
		    System.out.println();
		}
		System.out.println("Continue? (y/n)");
		mood = scnr.next();
		}    
		
		System.out.println("GET AWAY FROM ME!");
		scnr.close();

	
	}
	}

