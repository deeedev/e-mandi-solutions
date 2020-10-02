package businesslogic;

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

		if (farmerUser.equals("farmer") && farmerUser.equals("farmer"))
			return true;
		else
			return false;
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
