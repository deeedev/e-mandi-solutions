package dao;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import model.WholeSeller;

public class CRUDOperationsWholeSeller {

	static Map<String, WholeSeller> mapWholeSeller = new LinkedHashMap<String, WholeSeller>();

	public void add(WholeSeller wS2) throws IOException {

		mapWholeSeller.put(wS2.getLicenseNumber(), wS2);

		System.out.println("*** Details Updated***\n");
	}

	public void viewList() {
		// TODO Auto-generated method stub

		Set<String> keys = mapWholeSeller.keySet();
		for (String key : keys)
			System.out.println("\nLicense Number: " + mapWholeSeller.get(key).getLicenseNumber() + "\nName: "
					+ mapWholeSeller.get(key).getName() + "\nPhone Number: " + mapWholeSeller.get(key).getPhoneNumber()
					+ "\nAddress: " + mapWholeSeller.get(key).getAddress() + "\n");
	}

	public void searchByLicenseNumber(String ln) {
		// TODO Auto-generated method stub
		if (mapWholeSeller.containsKey(ln)) {
			WholeSeller ws = mapWholeSeller.get(ln);
			System.out.print("Name: " + ws.getName() + "\nPhone Number: " + ws.getPhoneNumber() + "\nAddress: "
					+ ws.getAddress() + "\n");
		} else
			System.out.println("License Number is Not Registered!!\n");

	}

	public void remove(String ln) {
		// TODO Auto-generated method stub
		if (mapWholeSeller.containsKey(ln)) {
			mapWholeSeller.remove(ln);
			System.out.println("Whole Seller removed by license No: " + ln + "\n");
		} else
			System.out.println("License Number is Not Registered!!\n");

	}
}
