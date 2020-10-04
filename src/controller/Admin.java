package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import dao.CRUDOperationCrops;
import dao.CRUDOperationsFarmer;
import dao.CRUDOperationsWholeSeller;
import model.Farmer;
import model.WholeSeller;
import utility.FeedBack;
import utility.License;

public class Admin extends FeedBack implements License {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	CRUDOperationsWholeSeller WS = new CRUDOperationsWholeSeller();
	CRUDOperationsFarmer fam = new CRUDOperationsFarmer();

	CRUDOperationCrops crops = new CRUDOperationCrops();

	public void adminLogin() throws IOException {

		// TODO Auto-generated method stub
		int c1;

		do {

			System.out.println("1. Add/Remove WholeSellers");
			System.out.println("2. Add/Remove Farmers");
			System.out.println("3. Set Minimum Support Price");
			System.out.println("4. Approve License Renewals");
			System.out.println("5. View FeedBack or Complaint");
			System.out.println("6. Exit");
			System.out.println("\nEnter your choices: ");

			int ch = Integer.parseInt(br.readLine());
			c1 = ch;
			switch (ch) {

			case 1:
				int c2;

				do {
					System.out.println("\n1. Add WholeSeller");
					System.out.println("2. View WholeSeller List / By Liscense Number");
					System.out.println("3. Remove WholeSeller By Liscense Number");
					System.out.println("4. Exit\n");
					System.out.println("Enter your choices: ");

					int c = Integer.parseInt(br.readLine());
					c2 = c;

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
							System.out.println("Invalid Input");
							break;
						}
						break;

					case 3:

						System.out.println("Enter the License Number: ");
						WS.remove(br.readLine());
						break;

					case 4:
						break;

					default:
						System.out.println("Invalid Input");
						break;
					}

				} while (c2 != 4);
				break;

			// ADminLogin case 2 Started********
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
						System.out.println("Invalid Input");
						break;

					}
					break;

				case 3:

					System.out.println("Enter License Number: ");
					fam.remove(br.readLine());
					break;

				case 4:
					break;

				default:
					System.out.println("Invalid Input");
					break;
				}

				break;

			// Admin choice 3 starts here *******8

			case 3:
				crops.setMinimumSupportPrice();
				break;

			case 4:

				System.out.println("1. Check For WholeSeller License");
				System.out.println("2. Check For Farmer License");
				System.out.println("Enter your choice: \n");

				int choice = Integer.parseInt(br.readLine());

				switch (choice) {

				case 1:
					if (licenseRenewalWholeSeller.size() != 0) {
						int j = 1;
						for (String key : licenseRenewalWholeSeller.keySet()) {
							WholeSeller ws = licenseRenewalWholeSeller.get(key);
							System.out.println(j + ". " + "Name: " + ws.getName() + "\n   " + "Phone: "
									+ ws.getPhoneNumber() + "\n   " + "License Number: " + ws.getLicenseNumber());
							j++;

							System.out.println("Do you want to Approve or Reject the application?");
							System.out.println("Please Enter YES/NO");

							String aprv = br.readLine();

							if (aprv == "YES")
								licenseRenewalstatus.put(key, "Approved");
							else
								licenseRenewalstatus.put(key, "Not Approved");
						}

					} else
						System.out.println("***** No License Renewal Request *****\n");
					break;

				case 2:
					if (licenseRenewalFarmer.size() != 0) {
						int j = 1;
						for (String key : licenseRenewalFarmer.keySet()) {
							Farmer ws = licenseRenewalFarmer.get(key);
							System.out.println(j + ". " + "Name: " + ws.getName() + "\n " + "Phone: "
									+ ws.getPhoneNumber() + "\n " + "License Number: " + ws.getLicenseNumber());
							j++;

							System.out.println("Do you want to Approve or Reject the application?");
							System.out.println("Please Enter YES/NO");

							String aprv = br.readLine();

							if (aprv == "YES")
								licenseRenewalstatus.put(key, "Approved");
							else
								licenseRenewalstatus.put(key, "Not Approved");
						}
					} else
						System.out.println("***** No License Renewal Request *****\n");
					break;

				case 3:
					break;

				default:
					System.out.println("Invalid Input");
					break;
				}

				break;

			case 5:
				System.out.println("1. View Feedback");
				System.out.println("2. View Complaint");
				System.out.println("Enter your choice: ");

				int c = Integer.parseInt(br.readLine());
				switch (c) {
				case 1:

					if (feedback.size() != 0)
						for (String key : feedback.keySet()) {

							ArrayList<String> fb = feedback.get(key);

							System.out.println("Type: " + fb.get(0));
							System.out.println("Name: " + fb.get(1));
							System.out.println("Phone: " + fb.get(2));
							System.out.println("License Number: " + fb.get(3));
							System.out.println("Message: " + fb.get(4));

						}
					else
						System.out.println("\n***** No FeedBack Received *****\n");

					break;

				case 2:

					if (complaint.size() != 0)
						for (String key : complaint.keySet()) {

							ArrayList<String> cp = complaint.get(key);

							System.out.println("Type: " + cp.get(0));
							System.out.println("Name: " + cp.get(1));
							System.out.println("Phone: " + cp.get(2));
							System.out.println("License Number: " + cp.get(3));
							System.out.println("Message: " + cp.get(4));

						}
					else
						System.out.println("\n***** No Complaint Received *****\n");
					break;

				default:
					System.out.println("Invalid Input");
					break;
				}
				break;

			case 6:
				System.out.println("\n**** You have a great day ****\n");
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}
		} while (c1 != 6);
	}

	@Override
	public void licenseRenewal() {
		// TODO Auto-generated method stub

	}
}