package businesslogic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dao.CRUDOperationsFarmer;
import dao.CRUDOperationsWholeSeller;

public class ValidateUser {

	public boolean checkUser(String user, String pass) {

		if (user.equals("admin") && pass.equals("admin"))
			return true;
		else
			return false;
	}

	public boolean checkFarmerUser(String farmerUser, String farmerPassword) {
		// TODO Auto-generated method stub

		boolean check = false;
		for (String key : CRUDOperationsFarmer.getMapFarmer().keySet()) {
			String name = CRUDOperationsFarmer.getMapFarmer().get(key).getName();

			if (farmerUser.equals(name) && farmerPassword.equals(name))
				check = true;
			else
				check = false;
		}

		return check;
	}

	public boolean checkWholeSellerUser(String wsUser, String wsPass) {
		// TODO Auto-generated method stub
		boolean check = false;
		for (String key : CRUDOperationsWholeSeller.getMapWholeSeller().keySet()) {
			String name = CRUDOperationsWholeSeller.getMapWholeSeller().get(key).getName();

			if (wsUser.equals(name) && wsPass.equals(name))
				check = true;
			else
				check = false;
		}

		return check;

	}

	private boolean validPassword(String password) {

		boolean isValid = false;

		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,20}$";
		Pattern p = Pattern.compile(regex);

		Matcher m1 = p.matcher(password);

		if (m1.matches())
			isValid = true;

		return isValid;
	}

	private boolean validEmail(String email) {
		boolean isValid = false;

		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);

		if (m.matches())
			isValid = true;

		return isValid;

	}
}
