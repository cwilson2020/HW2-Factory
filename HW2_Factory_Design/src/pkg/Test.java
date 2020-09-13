package pkg;

import java.util.Scanner;

import org.w3c.dom.events.EventException;

public class Test {

	public static void main(String[] args) {

		interior_package_factory fac_pkg = new interior_package_factory();

		interior_package pkg = null;



		boolean exit = false;

		while (!exit) {
			System.out.println("Choose a Trim Package (Press the Corresponding Number)");
			System.out.println("____________________________________________________");
			System.out.println("1) Trim Package 1");
			System.out.println("2) Trim Package 2");
			System.out.println("3) Trim Package 3");
			System.out.println("4) Trim Package 4");
			System.out.println("Press 'e' to exit");
			Scanner userInput = new Scanner(System.in);
			String sInput = userInput.nextLine();
			userInput.close();

			if (sInput.equals("e")) {
				exit = true;
				System.out.println("program Terminated");
			}


			if (!exit ) {
				try {		
					int iInput = Integer.valueOf(sInput);
					System.out.println(iInput);
					if ((iInput<=4) && (iInput >=1 )) {						
						pkg = fac_pkg.createInterior(iInput);
						System.out.println(pkg.getTrim());
						System.out.println(pkg.getContentsList());
						System.out.println(pkg.getPrice());
					}

				}
				catch (NumberFormatException ex) {
					System.out.println("Input was not a number please try again.\n\n\n");

				}
			}

		}
	}

}
