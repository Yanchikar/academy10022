package shop;

public class AmPhone implements Validator {

	@Override
	public boolean validate(String valid) {
		if (Regex.checkAmerican(valid) == true) {
			return true;
		} else {
			return false;
		}
	}
}
