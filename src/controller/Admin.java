package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import model.WholeSeller;

public class Admin {
	
	BufferedReader sc =new BufferedReader(new InputStreamReader(System.in));
	WholeSeller WS = new WholeSeller();
	
	public void adminLogin() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("1. Add/Remove WholeSellers");
		System.out.println("2. Add/Remove Farmers");
		System.out.println("3. Add/Remove Retailers");
		System.out.println("4. Set Minimum Support Price");
		System.out.println("5. Exit");
		
		System.out.println("\nEnter your choices: ");
		
		int ch = Integer.parseInt(sc.readLine());
		while(ch != 4) {
		
			switch (ch) {
			case 1:
				System.out.println("1. Add WholeSeller");
				System.out.println("2. View WholeSeller List / By Liscense Number");
				System.out.println("3. Remove WholeSeller By Liscense Number");
				System.out.println("4. Exit\n");
				System.out.println("Enter your choices: ");
				int c = Integer.parseInt(sc.readLine());
				
					switch (c) {
					case 1:
						System.out.println("Enter Whole Seller Name: ");
						WS.setName(sc.readLine());
						System.out.println("Enter Wholer Seller Phone Number: ");
						WS.setPhoneNumber(sc.readLine());
						System.out.println("Enter Whole Seller Address: ");
						WS.setAddress(sc.readLine());
						System.out.println("Enter Whole Seller License number: \n");
						WS.setLicenseNumber(sc.readLine());
						
						WS.add(WS);
						
						break;
					case 2:
						
						System.out.println("1. View Whole Seller List");
						System.out.println("2. Search By License Number\n");
						
						int n = Integer.parseInt(sc.readLine());
						switch (n) {
						case 1:
							WS.viewList();
							break;
						case 2:
							System.out.println("Enter the License Number: ");
							WS.searchByLicenseNumber(sc.readLine());	
						default:
							break;
						}
						
						break;
					case 3:
						System.out.println("Enter the License Number: ");
						WS.remove(sc.readLine());
						
					default:
						break;
					}
				
				break;

			default:
				break;
			}
		}
		
	
	
	
	}

	

}
