package businesslogic;

public class ValidateUser {

	public boolean checkUser(String email, String password) {
		
		
		if(email.equals("admin") && password.equals("admin"))
			return true;
		else 
			return false;
	}
}
