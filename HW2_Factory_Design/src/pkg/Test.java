package pkg;

import java.util.Scanner;

import org.w3c.dom.events.EventException;

public class Test {

	public static void main(String[] args) {

		interior_package_factory fac_pkg = new interior_package_factory();

		interior_package pkg = null;

		Scanner userInput = new Scanner(System.in);

		boolean exit = false;

		while (!exit) {
			System.out.println("Choose a Trim Package (Press the Corresponding Number)");
			System.out.println("____________________________________________________");
			System.out.println("1) Trim Package 1");
			System.out.println("2) Trim Package 2");
			System.out.println("3) Trim Package 3");
			System.out.println("4) Trim Package 4");
			System.out.println("e) Exit");

			String sInput = userInput.nextLine();


			if (sInput.equals("e")) {
				exit = true;
				System.out.println("Program Terminated");
			}


			if (!exit ) {
				try {		
					int iInput = Integer.valueOf(sInput);
					//System.out.println(iInput);
					if ((iInput<=4) && (iInput >=1 )) {						
						pkg = fac_pkg.createInterior(iInput);
						System.out.println("\n--------Package Information--------");
						System.out.println(pkg.getTrim());
						System.out.println("This Trim Level Contains: " + pkg.getContentsList());
						System.out.println("Package Price:$" +pkg.getPrice());
						System.out.println("\n\n\n");
					}
					else
						System.out.println("That Package Doesn't exist, please Select another Package.");

				}
				catch (NumberFormatException ex) {
					System.out.println("Input was not a number please try again.\n\n\n");

				}
			}

		}
	}

}
