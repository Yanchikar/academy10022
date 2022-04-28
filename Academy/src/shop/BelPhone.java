package shop;

public class BelPhone implements Validator {
	@Override
	public boolean validate(String valid) {
		if (Regex.checkBelarus(valid) == true) {
			return true;
		} else {
			return false;
		}
	}
}