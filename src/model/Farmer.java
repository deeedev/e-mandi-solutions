package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import utility.Stock;
import utility.Trade;

public class Farmer extends Trade {

	String name;
	String phoneNumber;
	String address;
	String licenseNumber;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Map<String, Farmer> mapFarmer = new LinkedHashMap<String, Farmer>();
	Stock stock = new Stock();

	public Farmer() {

		System.out.println("\n1. Add Farmer");
		System.out.println("2. View Farmer List / By Liscense Number");
		System.out.println("3. Remove Farmer By Liscense Number");
		System.out.println("4. Exit\n");
		System.out.println("Enter your choices: ");
	}

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

	public void add(Farmer fam1) {
		// TODO Auto-generated method stub
		mapFarmer.put(fam1.getLicenseNumber(), fam1);
		System.out.println("*** Details Updated***\n");

	}

	public void viewList() {
		// TODO Auto-generated method stub
		Set<String> keys = mapFarmer.keySet();
		for (String key : keys)
			System.out.println("\nLicense Number: " + mapFarmer.get(key).getLicenseNumber() + "\nName: "
					+ mapFarmer.get(key).getName() + "\nPhone Number: " + mapFarmer.get(key).getPhoneNumber()
					+ "\nAddress: " + mapFarmer.get(key).getAddress() + "\n");
	}

	public void searchByLicenseNumber(String ln) {
		// TODO Auto-generated method stub
		if (mapFarmer.containsKey(ln)) {
			Farmer fam = mapFarmer.get(ln);
			System.out.print("Name: " + fam.getName() + "\nPhone Number: " + fam.getPhoneNumber() + "\nAddress: "
					+ fam.getAddress() + "\n");
		} else
			System.out.println("License Number is Not Registered!!\n");
	}

	public void remove(String ln) {
		// TODO Auto-generated method stub
		if (mapFarmer.containsKey(ln)) {
			mapFarmer.remove(ln);
			System.out.println("Whole Seller removed by license No: " + ln + "\n");
		} else
			System.out.println("License Number is Not Registered!!\n");
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
			int j = 1;

			for (int i = 0; i < stock.getCropsList().length; i++) {

				String cropsList[] = stock.getCropsList();
				System.out.println(+j + ": " + cropsList[i]);
				j++;
			}

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
