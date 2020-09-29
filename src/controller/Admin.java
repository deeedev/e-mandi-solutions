package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.WholeSeller;

/* once the User will select Admin Login it will be redirected here */

public class Admin {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	WholeSeller WS = new WholeSeller();

	// Admin login method, invoke after User Select Admin Login

	public void adminLogin() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("1. Add/Remove WholeSellers");
		System.out.println("2. Add/Remove Farmers");
		System.out.println("3. Add/Remove Retailers");
		System.out.println("4. Set Minimum Support Price");
		System.out.println("5. Exit");

		System.out.println("\nEnter your choices: ");

		int ch = Integer.parseInt(br.readLine());
		while (ch != 5)
			// Switch Statement for the getting input for Main Admin Login List
			switch (ch) {
			case 1:
				// WholeSeller constructor invoked.

				new WholeSeller();
				System.out.println("Enter your choices: ");
				int c = Integer.parseInt(br.readLine());

				// Switch Statement for the getting input for Sub List(i.e, Add WholeSeller)
				switch (c) {

				case 1:
					// WholeSeller Add method invoked after Choice 1
					WS.add(WS);

					break;

				case 2:

					System.out.println("1. View Whole Seller List");
					System.out.println("2. Search By License Number\n");

					int n = Integer.parseInt(br.readLine());

					// Switch to get input for sub options in choice 2

					switch (n) {

					// View WholeSeller List
					case 1:

						// WholeSeller View List method Invoked after choice 2 --> 1
						WS.viewList();
						break;

					// Search by License Number
					case 2:
						System.out.println("Enter the License Number: ");

						// WholeSeller searchByLicenseNumber method invoked after Choice 2 --> 2
						WS.searchByLicenseNumber(br.readLine());
						break;

					// Default for sub choice 2
					default:
						break;
					}

				case 3:
					System.out.println("Enter the License Number to remove WholeSeller: ");

					// WholeSeller remove method invoked after choice 3
					WS.remove(br.readLine());

					break;

				case 4:
					break;

				default:
					break;
				}

			case 2:

				break;

			default:
				break;

			}

	}

}
