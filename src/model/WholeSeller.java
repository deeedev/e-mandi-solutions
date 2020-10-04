package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import dao.CRUDOperationCrops;
import dao.CRUDOperationsWholeSeller;
import utility.FeedBack;
import utility.License;

public class WholeSeller extends FeedBack {

	String name;
	String phoneNumber;
	String address;
	String licenseNumber;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	CRUDOperationsWholeSeller ws = new CRUDOperationsWholeSeller();
	CRUDOperationCrops crops = new CRUDOperationCrops();

	Crops crop = new Crops();

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String getLicenseNumber() {
		return licenseNumber;
	}

	@Override
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public void WholeSellerLogin() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int c;

		do {
			System.out.println("1. Set Price");
			System.out.println("2. Buy");
			System.out.println("3. Sell");
			System.out.println("4. Apply for License Renewal/Status");
			System.out.println("5. FeedBack/Complaint");
			System.out.println("6. Exit");

			System.out.println("Enter your choice");
			int ch = Integer.parseInt(br.readLine());
			c = ch;

			switch (ch) {

			case 1:
				for (String key : crop.getCropsList()) {

					System.out.printf("Enter Price for %s%n", key);
					double price = sc.nextDouble();
					CRUDOperationCrops.getMapCropsPrice().put(key, price);
				}

				System.out.println("***** Price Successfully updated *****\n");
				break;
			case 2:
				ws.Buy();
				break;

			case 3:
				ws.Sell();
				break;

			case 4:

				System.out.println("1. Apply for License Renew");
				System.out.println("2. Check Status");
				System.out.println("Enter your choice: ");

				int choi = Integer.parseInt(br.readLine());

				switch (choi) {
				case 1:
					ws.licenseRenewal();
					System.out.println("*** Request has been sent ***\n");
					break;

				case 2:
					System.out.println("Enter your License Number: ");
					String ln = br.readLine();

					if (CRUDOperationsWholeSeller.getMapWholeSeller().containsKey(ln))
						System.out.println("License Renewal Status: " + License.licenseRenewalstatus.get(ln));
					else
						System.out.println("License number is not registered!!");

				default:
					break;
				}

				break;

			case 5:
				System.out.println("1.Feedback");
				System.out.println("2.Complaint");
				System.out.println("Enter your choice: ");

				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					fillFeedback();
					System.out.println("**** Thanks for your valuable feedback ****\n");
					break;

				case 2:
					fillComplaint();
					System.out.println("**** I am sorry for any inconvenience caused to you ****\n");
					break;

				default:
					// System.out.println("Invalid Input");
					break;
				}

			default:
				// System.out.println("Invalid Input");
				break;
			}

		} while (c != 6);
	}

}
