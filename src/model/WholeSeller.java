package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class WholeSeller {

	String name;
	String phoneNumber;
	String address;
	String licenseNumber;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	WholeSeller WS;

	Map<String, WholeSeller> map = new LinkedHashMap<String, WholeSeller>();
	// ArrayList<WholeSeller> list = new ArrayList<WholeSeller>();

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

	public void add(WholeSeller wS2) throws IOException {

		System.out.println("Enter Whole Seller Name: ");
		setName(br.readLine());
		System.out.println("Enter Wholer Seller Phone Number: ");
		setPhoneNumber(br.readLine());
		System.out.println("Enter Whole Seller Address: ");
		setAddress(br.readLine());
		System.out.println("Enter Whole Seller License number: \n");
		setLicenseNumber(br.readLine());

		// Map to store the wholeSeller details
		map.put(wS2.getLicenseNumber(), wS2);

		System.out.println("*** Details Updated***");

		// for(Map.Entry<String, WholeSeller> entry:map.entrySet())
		// {
		// System.out.println(entry.getKey() + " "+ entry.getValue().getName() +" :
		// "+entry.getValue().getAddress() +" : "+ entry.getValue().getPhoneNumber());
		// }
		// System.out.println("Map Size :"+map.size());
	}

	public void viewList() {
		// TODO Auto-generated method stub

		Set<String> keys = map.keySet();
		for (String key : keys)
			System.out.println("\nLicense Number: " + map.get(key).getLicenseNumber() + "\nName: "
					+ map.get(key).getName() + "\nPhone Number: " + map.get(key).getPhoneNumber() + "\nAddress: "
					+ map.get(key).getAddress());
	}

	public void searchByLicenseNumber(String ln) {
		// TODO Auto-generated method stub
		WholeSeller ws = map.get(ln);
		System.out.print("Name: " + ws.getName() + "\nPhone Number: " + ws.getPhoneNumber() + "\nAddress: "
				+ ws.getAddress() + "\n");

	}

	public void remove(String ln) {
		// TODO Auto-generated method stub
		map.remove(ln);

	}

}
