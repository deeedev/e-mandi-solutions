package model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Retailer {
	String name;
	String phoneNumber;
	String address;
	String licenseNumber;

	static Map<String, Retailer> mapRetailer = new LinkedHashMap<String, Retailer>();

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

	public void add(Retailer retail1) {
		// TODO Auto-generated method stub
		mapRetailer.put(retail1.getLicenseNumber(), retail1);
		System.out.println("*** Details Updated***\n");
	}

	public void viewList() {
		// TODO Auto-generated method stub
		Set<String> keys = mapRetailer.keySet();
		for (String key : keys)
			System.out.println("\nLicense Number: " + mapRetailer.get(key).getLicenseNumber() + "\nName: "
					+ mapRetailer.get(key).getName() + "\nPhone Number: " + mapRetailer.get(key).getPhoneNumber()
					+ "\nAddress: " + mapRetailer.get(key).getAddress() + "\n");

	}

	public void searchByLicenseNumber(String ln) {
		// TODO Auto-generated method stub
		if (mapRetailer.containsKey(ln)) {
			Retailer retail = mapRetailer.get(ln);
			System.out.print("Name: " + retail.getName() + "\nPhone Number: " + retail.getPhoneNumber() + "\nAddress: "
					+ retail.getAddress() + "\n");
		} else
			System.out.println("License Number is Not Registered!!\n");
	}

	public Retailer() {

		System.out.println("\n1. Add Retailer");
		System.out.println("2. View Retailer List / By Liscense Number");
		System.out.println("3. Remove Retailer By Liscense Number");
		System.out.println("4. Exit\n");
		System.out.println("Enter your choices: ");
	}

	public void remove(String ln) {
		// TODO Auto-generated method stub
		if (mapRetailer.containsKey(ln)) {
			mapRetailer.remove(ln);
			System.out.println("Whole Seller removed by license No: " + ln + "\n");
		} else
			System.out.println("License Number is Not Registered!!\n");
	}

}
