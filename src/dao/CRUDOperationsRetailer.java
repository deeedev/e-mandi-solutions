package dao;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import model.Retailer;

public class CRUDOperationsRetailer {

	static Map<String, Retailer> mapRetailer = new TreeMap<String, Retailer>();

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

	public void remove(String ln) {
		// TODO Auto-generated method stub
		if (mapRetailer.containsKey(ln)) {
			mapRetailer.remove(ln);
			System.out.println("Whole Seller removed by license No: " + ln + "\n");
		} else
			System.out.println("License Number is Not Registered!!\n");
	}
}
