package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import businesslogic.ValidateUser;

public class Emandi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Admin admin = new Admin();
		ValidateUser validate = new ValidateUser();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Very initial content on the console

		System.out.println("<-------------------------------------------------->");
		System.out.println("             Welcome to the e-mandi                 ");
		System.out.println("\n Enter your choices");
		System.out.println("1. Admin Login");
		System.out.println("2. Farmer Login");
		System.out.println("3. Individual Login");
		System.out.println("4. Retailer Login");
		System.out.println("5. WholeSeller Login");
		System.out.println("6. Exit");

		// Logic to get the user input as per the above option and loop through it

		int n = Integer.parseInt(br.readLine());

		while (n != 6)
			switch (n) {
			case 1:

				System.out.println("\nEnter User Name: ");
				String user = br.readLine();
				System.out.println("Enter Password: ");
				String pass = br.readLine();

				// Calling ValidateUser class to check login

				boolean check = validate.checkUser(user, pass);

				if (check) {
					System.out.println("***Login Successful***");
					admin.adminLogin();

				} else
					System.out.println("Invalid Username or Password");
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}

	}

}
