package businesslogic;

import model.Farmer;

public class ValidateUser {

	Farmer farmer = new Farmer();

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
}
