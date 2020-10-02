package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

import businesslogic.ValidateUser;
import model.Farmer;
import model.WholeSeller;

public class Emandi {

	private static void main() {
		// TODO Auto-generated method stub
		System.out.println("<------------------------------------------------------------------->");
		System.out.println("               Welcome to the e-mandi service portal                 ");
		System.out.println("<------------------------------------------------------------------->");

		System.out.println("1. Admin Login");
		System.out.println("2. WholeSeller Login");
		System.out.println("3. Farmer Login");
		System.out.println("4. Retailer Login");
		System.out.println("5. Exit");
		System.out.println("\n Enter your choices");

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Admin admin = new Admin();
		Farmer farmer = new Farmer();
		WholeSeller WS = new WholeSeller();

		ValidateUser validate = new ValidateUser();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Very initial content on the console
		int n1;

		do {

			System.out.println("<------------------------------------------------------------------->");
			System.out.println("               Welcome to the e-mandi service portal                 ");
			System.out.println("<------------------------------------------------------------------->");

			System.out.println("1. Admin Login");
			System.out.println("2. WholeSeller Login");
			System.out.println("3. Farmer Login");
			System.out.println("4. Retailer Login");
			System.out.println("5. Exit");
			System.out.println("\n Enter your choices");

			int n = Integer.parseInt(br.readLine());
			n1 = n;

			switch (n) {

			case 1:
				System.out.println("Enter User Name: ");
				String user = br.readLine();
				System.out.println("Enter Password: ");

				String pass = br.readLine();

				// Calling ValidateUser class to check login

				boolean check = validate.checkUser(user, pass);

				if (check) {
					System.out.println("***Login Successful***\n");
					admin.adminLogin();

				} else
					System.out.println("Invalid Username or Password");
				break;

			case 2:

				System.out.println("Enter User Name: ");
				String wsUser = br.readLine();
				System.out.println("Enter Password: ");

				String wsPass = br.readLine();

				boolean checkWholeSellerUser = validate.checkWholeSellerUser(wsUser, wsPass);

				if (checkWholeSellerUser) {
					System.out.println("***Login Successful***\n");
					WS.WholeSellerLogin();
				} else
					System.out.println("Invalid Username or Password");
				break;

			case 3:
				System.out.println("Enter User Name: ");
				String farmerUser = br.readLine();
				System.out.println("Enter Password: ");

				String farmerPassword = br.readLine();

				boolean checkFarmerUser = validate.checkFarmerUser(farmerUser, farmerPassword);

				if (checkFarmerUser) {
					System.out.println("***Login Successful***\n");
					farmer.farmerLogin();
				} else
					System.out.println("Invalid Username or Password");

				break;
			case 5:
				LocalDateTime date = LocalDateTime.now();
				System.out.println(
						date.getMonth() + " " + date.getYear() + " - " + date.getHour() + ":" + date.getMinute());
				System.out.println(
						"****** Thank you for using E-mandi Service Portal ******\n******         You have a Great Day ahead!!       ******");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		} while (n1 != 5);
	}
}
