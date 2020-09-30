package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dao.CRUDOperationsWholeSeller;
import model.Farmer;
import model.Retailer;
import model.WholeSeller;

public class Admin {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	CRUDOperationsWholeSeller WS = new CRUDOperationsWholeSeller();
	Farmer fam = new Farmer();
	Retailer retail = new Retailer();

	public void adminLogin() throws IOException {

		// TODO Auto-generated method stub
		System.out.println("1. Add/Remove WholeSellers");
		System.out.println("2. Add/Remove Farmers");
		System.out.println("3. Add/Remove Retailers");
		System.out.println("4. Set Minimum Support Price");
		System.out.println("5. Exit");

		System.out.println("\nEnter your choices: ");
		int ch = Integer.parseInt(br.readLine());

		switch (ch) {

		case 1:

			do {

				new WholeSeller();
				int c = Integer.parseInt(br.readLine());
				switch (c) {

				case 1:

					WholeSeller WS1 = new WholeSeller();

					System.out.println("Enter Whole Seller Name: ");
					WS1.setName(br.readLine());
					System.out.println("Enter Wholer Seller Phone Number: ");
					WS1.setPhoneNumber(br.readLine());
					System.out.println("Enter Whole Seller Address: ");
					WS1.setAddress(br.readLine());
					System.out.println("Enter Whole Seller License number: ");
					WS1.setLicenseNumber(br.readLine());

					WS.add(WS1);

					break;

				case 2:

					System.out.println("1. View Whole Seller List");
					System.out.println("2. Search By License Number\n");

					int n = Integer.parseInt(br.readLine());

					switch (n) {

					case 1:

						WS.viewList();
						break;

					case 2:

						System.out.println("Enter the License Number: ");
						WS.searchByLicenseNumber(br.readLine());
						break;

					default:
						break;
					}
					break;

				case 3:

					System.out.println("Enter the License Number: ");
					WS.remove(br.readLine());
					break;

				case 4:
					adminLogin();
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}
			} while (ch == 1);
			break;

		case 2:

			new Farmer();
			int d = Integer.parseInt(br.readLine());

			switch (d) {

			case 1:
				Farmer fam1 = new Farmer();

				System.out.println("Enter Farmer Name: ");
				fam1.setName(br.readLine());
				System.out.println("Enter Farmer Phone Number: ");
				fam1.setPhoneNumber(br.readLine());
				System.out.println("Enter Farmer Address: ");
				fam1.setAddress(br.readLine());
				System.out.println("Enter Farmer License number: ");
				fam1.setLicenseNumber(br.readLine());

				fam.add(fam1);
				break;

			case 2:

				System.out.println("1. View Farmer List");
				System.out.println("2. Search By License Number\n");

				int d1 = Integer.parseInt(br.readLine());

				switch (d1) {

				case 1:

					fam.viewList();
					break;

				case 2:

					System.out.println("Enter License Number: ");
					fam.searchByLicenseNumber(br.readLine());
					break;

				default:
					break;

				}
				break;

			case 3:

				System.out.println("Enter License Number: ");
				fam.remove(br.readLine());
				break;

			default:
				break;
			}

			break;

		case 3:

			new Retailer();
			int e = Integer.parseInt(br.readLine());

			switch (e) {

			case 1:

				Retailer retail1 = new Retailer();

				System.out.println("Enter Whole Seller Name: ");
				retail1.setName(br.readLine());
				System.out.println("Enter Wholer Seller Phone Number: ");
				retail1.setPhoneNumber(br.readLine());
				System.out.println("Enter Whole Seller Address: ");
				retail1.setAddress(br.readLine());
				System.out.println("Enter Whole Seller License number: ");
				retail1.setLicenseNumber(br.readLine());

				retail.add(retail1);

				break;

			case 2:

				System.out.println("1. View Whole Seller List");
				System.out.println("2. Search By License Number\n");

				int n = Integer.parseInt(br.readLine());
				switch (n) {

				case 1:

					retail.viewList();
					break;

				case 2:

					System.out.println("Enter the License Number: ");
					retail.searchByLicenseNumber(br.readLine());
					break;

				default:
					break;
				}
				break;
			case 3:

				System.out.println("Enter the License Number: ");
				retail.remove(br.readLine());
				break;
			case 4:
				break;

			default:
				break;
			}
			break;

		default:
			break;
		}

	}
}