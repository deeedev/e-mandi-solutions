package dao;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import model.Farmer;

public class CRUDOperationsFarmer {

	static Map<String, Farmer> mapFarmer = new TreeMap<String, Farmer>();

	public void add(Farmer fam1) {
		// TODO Auto-generated method stub
		mapFarmer.put(fam1.getLicenseNumber(), fam1);
		System.out.println("*** Details Updated***\n");

	}

	public static Map<String, Farmer> getMapFarmer() {
		return mapFarmer;
	}

	public static void setMapFarmer(Map<String, Farmer> mapFarmer) {
		CRUDOperationsFarmer.mapFarmer = mapFarmer;
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
}
