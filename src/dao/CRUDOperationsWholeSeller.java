package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import model.Crops;
import model.WholeSeller;
import utility.License;
import utility.Trade;

public class CRUDOperationsWholeSeller implements Trade, License {

	static Map<String, WholeSeller> mapWholeSeller = new TreeMap<String, WholeSeller>();

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	Crops crop = new Crops();
	CRUDOperationCrops crops = new CRUDOperationCrops();

	public static Map<String, WholeSeller> getMapWholeSeller() {
		return mapWholeSeller;
	}

	public static void setMapWholeSeller(Map<String, WholeSeller> mapWholeSeller) {
		CRUDOperationsWholeSeller.mapWholeSeller = mapWholeSeller;
	}

	// ***** Add WholeSeller Method called by admin ******//
	public void add(WholeSeller wS2) throws IOException {

		mapWholeSeller.put(wS2.getLicenseNumber(), wS2);

		System.out.println("*** Details Updated***\n");
	}

	// ***** ViewList Method called by admin ******//

	public void viewList() {
		// TODO Auto-generated method stub

		Set<String> keys = mapWholeSeller.keySet();
		for (String key : keys)
			System.out.println("\nLicense Number: " + mapWholeSeller.get(key).getLicenseNumber() + "\nName: "
					+ mapWholeSeller.get(key).getName() + "\nPhone Number: " + mapWholeSeller.get(key).getPhoneNumber()
					+ "\nAddress: " + mapWholeSeller.get(key).getAddress() + "\n");
	}

	// ***** searchByLicenseNumber Method called by admin ******//
	public void searchByLicenseNumber(String ln) {
		// TODO Auto-generated method stub
		if (mapWholeSeller.containsKey(ln)) {
			WholeSeller ws = mapWholeSeller.get(ln);
			System.out.print("Name: " + ws.getName() + "\nPhone Number: " + ws.getPhoneNumber() + "\nAddress: "
					+ ws.getAddress() + "\n");
		} else
			System.out.println("License Number is Not Registered!!\n");

	}

	// ***** remove Method called by admin ******//
	public void remove(String ln) {
		// TODO Auto-generated method stub
		if (mapWholeSeller.containsKey(ln)) {
			mapWholeSeller.remove(ln);
			System.out.println("Whole Seller removed by license No: " + ln + "\n");
		} else
			System.out.println("License Number is Not Registered!!\n");

	}

	@Override
	public void Buy() {
		// TODO Auto-generated method stub

		System.out.println("1. Place Buy Order");
		System.out.println("2. Check Buy Order");
		System.out.println("\nEnter your choice: ");

		int ch1 = sc.nextInt();

		switch (ch1) {

		case 1:

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
			System.out.println("Enter Buy Price(RS/KG)");
			double bp = sc.nextDouble();
			System.out.println("Enter Quantity(KG): ");
			double quantity = sc.nextDouble();

			System.out.println("\nCrop Name: " + arr[c1 - 1] + "\nBuy Price: " + bp + " /KG" + "\nQuantity: " + quantity
					+ " KG\n");

			System.out.println("\n***** Buy Order Sent To Dashboard Successfully *****\n");
			Crops crp = new Crops();

			crp.setName(arr[c1 - 1]);
			crp.setPrice(bp);
			crp.setQuantity(quantity);

			buyOrder.put(crp.getName(), crp);

			break;

		case 2:
			if (sellOrderFarmer.size() != 0) {
				int i = 1;
				for (String key : sellOrderFarmer.keySet())

					System.out.println(
							+i + "Crop Name: " + key + " : " + "\nPrice: " + sellOrderFarmer.get(key).getPrice()
									+ "\nQuantity: " + sellOrderFarmer.get(key).getQuantity());
				i++;
				System.out.println();
			} else

				System.out.println("\nNo Sell Orders are placed by farmers\n");
			break;
		default:
			break;
		}

	}

	@Override
	public void Sell() {
		// TODO Auto-generated method stub

		String arr1[] = crop.getCropsList();
		int j = 1;
		for (String c : arr1) {

			System.out.println(j + ". " + c);
			j++;
		}

		System.out.println("\nEnter your choice: ");
		int choice = sc.nextInt();

		Crops c2 = new Crops();
		System.out.println("Crop Name: " + arr1[choice - 1]);
		System.out.println(
				"Minimum Support Price: " + CRUDOperationCrops.getMapCropsMSP().get(arr1[choice - 1]).getMsp());
		System.out.println("Price : " + CRUDOperationCrops.getMapCropsPrice().get(arr1[choice - 1]));

		c2.setName(arr1[choice - 1]);
		c2.setPrice(CRUDOperationCrops.getMapCropsPrice().get(arr1[choice - 1]));

		System.out.println("Enter Quantity: ");
		double quan = sc.nextDouble();
		c2.setQuantity(quan);

		sellOrderWholeSeller.put(c2.getName(), c2);

		System.out.println("\n***** Sell Order Sent To Dashboard Successfully *****\n");

	}

	@Override
	public void licenseRenewal() {

		// TODO Auto-generated method stub
		System.out.println("Enter your Name: ");
		String name = sc.next();

		System.out.println("Enter your phone number: ");
		String phone = sc.next();

		System.out.println("Enter your License Number: ");
		String ln = sc.next();

		if (mapWholeSeller.containsKey(ln)) {
			WholeSeller ws = new WholeSeller();
			ws.setName(name);
			ws.setPhoneNumber(phone);
			ws.setLicenseNumber(ln);

			licenseRenewalWholeSeller.put(ln, ws);
		} else
			System.out.println("The License Number is not Valid");

	}

}
