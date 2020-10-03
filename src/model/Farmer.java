package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Farmer extends Crops {

	String name;
	String phoneNumber;
	String address;
	String licenseNumber;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Farmer() {

		System.out.println("\n1. Add Farmer");
		System.out.println("2. View Farmer List / By Liscense Number");
		System.out.println("3. Remove Farmer By Liscense Number");
		System.out.println("4. Exit\n");
		System.out.println("Enter your choices: ");
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

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public void farmerLogin() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("<--------------------------------------------------->");
		System.out.println("<         Welcome to the Farmer Portal               ");
		System.out.println("<--------------------------------------------------->");

		System.out.println("1. Sell Corps");
		System.out.println("2. Know Minimum Support Price");
		System.out.println("3. Register a compaint");
		System.out.println("4. Know your previous transcations");

		int choice = Integer.parseInt(br.readLine());

		switch (choice) {
		case 1:
			System.out.println("Select Crops from the below list\n");

			System.out.println("\nEnter your choice: ");
			int c = Integer.parseInt(br.readLine());

			switch (c) {
			case 1:
//				System.out.println("Current "+ );
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
