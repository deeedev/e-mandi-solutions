package businesslogic;

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
}
