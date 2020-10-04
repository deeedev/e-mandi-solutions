package dao;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import model.Crops;
import model.Farmer;
import utility.FeedBack;
import utility.License;
import utility.Trade;

public class CRUDOperationsFarmer extends FeedBack implements License, Trade {

	Crops crop = new Crops();

	static Map<String, Farmer> mapFarmer = new TreeMap<String, Farmer>();
	Scanner sc = new Scanner(System.in);

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

	@Override
	public void licenseRenewal() {
		// TODO Auto-generated method stub

		System.out.println("Enter your Name: ");
		String name = sc.nextLine();

		System.out.println("Enter your phone number: ");
		String phone = sc.nextLine();

		System.out.println("Enter your License Number: ");
		String ln = sc.nextLine();

		if (mapFarmer.containsKey(ln)) {

			Farmer fam = new Farmer();
			fam.setName(name);
			fam.setPhoneNumber(phone);
			fam.setLicenseNumber(ln);

			licenseRenewalFarmer.put(ln, fam);
		} else
			System.out.println("The License Number is not Valid");

	}

	@Override
	public void Buy() {
		// TODO Auto-generated method stub

		if (Trade.buyOrder.size() != 0)
			for (String key : Trade.buyOrder.keySet())
				System.out.println("Crop Name: " + key + "\nPrice: " + Trade.buyOrder.get(key).getPrice()
						+ "\nQuantity: " + Trade.buyOrder.get(key).getQuantity());
		else
			System.out.println("*** No Buy Order from WholeSeller ***");

	}

	@Override
	public void Sell() {
		// TODO Auto-generated method stub

		int j = 1;

		String arr[] = crop.getCropsList();

		for (int i = 0; i < crop.getCropsList().length; i++) {
			System.out.println(j + ". " + arr[i]);
			j++;
		}

		System.out.println("\nEnter your choice: ");

		int c1 = sc.nextInt();

		System.out.println("Crops MSP: " + CRUDOperationCrops.getMapCropsMSP().get(arr[c1 - 1]).getMsp()
				+ "\nCrop Name: " + arr[c1 - 1]);
		System.out.println();

		System.out.println("Enter Buy Price");
		double bp = sc.nextDouble();
		System.out.println("Enter Quantity: ");
		double quantity = sc.nextDouble();

		System.out.println("***** Buy Order Sent To Dashboard Successfully *****");

		System.out.println("\nCrop Name: " + arr[c1 - 1] + "\nBuy Price: " + bp + "\nQuantity: " + quantity + "\n");

		Crops crp = new Crops();

		crp.setName(arr[c1 - 1]);
		crp.setPrice(bp);
		crp.setQuantity(quantity);

		Trade.sellOrderFarmer.put(crp.getName(), crp);

	}

}
