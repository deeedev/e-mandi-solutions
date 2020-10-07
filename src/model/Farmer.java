package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import dao.CRUDOperationCrops;
import dao.CRUDOperationsFarmer;
import utility.FeedBack;
import utility.License;

public class Farmer extends FeedBack {

	String name;
	String phoneNumber;
	String address;
	String licenseNumber;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	Crops crop = new Crops();
	CRUDOperationsFarmer fam = new CRUDOperationsFarmer();

	public Farmer() {

	}

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

	public void farmerLogin() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int ch;

		do {

			System.out.println("<--------------------------------------------------->");
			System.out.println("<         Welcome to the Farmer Portal               ");
			System.out.println("<--------------------------------------------------->");

			System.out.println("1. Sell Corps");
			System.out.println("2. Know Minimum Support Price");
			System.out.println("3. Apply for License Renewal/Status");
			System.out.println("4. FeedBack/Complaint");
			System.out.println("5. Exit");

			int choice = Integer.parseInt(br.readLine());
			ch = choice;

			switch (choice) {
			case 1:

				System.out.println("1. Buy Order Posted by WholeSeller");
				System.out.println("2. Post your sell order");
				System.out.println("3. Exit");
				System.out.println("Enter your choice: ");

				int ch1 = Integer.parseInt(br.readLine());

				switch (ch1) {
				case 1:

					fam.Buy();

					break;

				case 2:

					fam.Sell();

				case 3:
					break;

				default:
					System.out.println("Invalid Input");
					break;
				}

				break;

			case 2:

				int j = 1;

				String arr[] = crop.getCropsList();

				for (int i = 0; i < crop.getCropsList().length; i++) {
					System.out.println(j + ". " + arr[i]);
					j++;
				}

				System.out.println("\nPlease Enter your choice to know the Minimum Support Price: ");

				int c1 = sc.nextInt();

				System.out.println("\nCrop Name: " + arr[c1 - 1] + "Crops MSP: "
						+ CRUDOperationCrops.getMapCropsMSP().get(arr[c1 - 1]).getMsp());
				break;

			case 3:

				System.out.println("1. Apply for License Renew");
				System.out.println("2. Check Status");
				System.out.println("Enter your choice: ");

				int ch2 = Integer.parseInt(br.readLine());

				switch (ch2) {
				case 1:
					fam.licenseRenewal();
					System.out.println("*** Request has been sent ***\n");
					break;

				case 2:
					System.out.println("Enter your License Number: ");
					String ln = br.readLine();

					if (CRUDOperationsFarmer.getMapFarmer().containsKey(ln))
						System.out.println("License Renewal Status: " + License.licenseRenewalstatus.get(ln));
					else
						System.out.println("License number is not registered!!");
				default:
					break;
				}
				break;

			case 4:

				System.out.println("1.Feedback");
				System.out.println("2.Complaint");
				System.out.println("Enter your choice: ");

				int ch3 = sc.nextInt();

				switch (ch3) {
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
				break;

			case 5:
				break;

			}
		} while (ch != 6);
	}
}
