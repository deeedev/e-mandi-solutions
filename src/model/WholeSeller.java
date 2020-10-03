package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import dao.CRUDOperationCrops;
import dao.CRUDOperationsWholeSeller;

public class WholeSeller {

	String name;
	String phoneNumber;
	String address;
	String licenseNumber;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	CRUDOperationsWholeSeller ws = new CRUDOperationsWholeSeller();
	CRUDOperationCrops crops = new CRUDOperationCrops();

	Crops crop = new Crops();

	public String getName() {
		return name;
	}

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

	public String getLicenseNumber() {
		return licenseNumber;
	}

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
			System.out.println("4. Apply for License Renewal");
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

				System.out.println("***** Price Successfully updated *****");
				break;
			case 2:
				ws.Buy();
				break;

			case 3:
				ws.Sell();
				break;

			case 4:
				ws.licenseRenewal();
				break;
			default:
				break;
			}

		} while (c != 6);
	}

}
