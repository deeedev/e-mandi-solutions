package model;

public class Retailer {
	String name;
	String phoneNumber;
	String address;
	String licenseNumber;

	public Retailer() {

		System.out.println("\n1. Add Retailer");
		System.out.println("2. View Retailer List / By Liscense Number");
		System.out.println("3. Remove Retailer By Liscense Number");
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

}
