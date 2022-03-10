
public class Person {

	public boolean checkUser(String user) {

		if (user.length() < 8 && user.contains("This#string%contains^special*characters&.")) {

			return false;
		}
		return true;
	}

	public boolean checkPassword(String password) {

		if (password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")) {

			return true;
		}

		return false;

	}

}