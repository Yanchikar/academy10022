package An;

public class Carrot extends Veg {
	public static void main(String[] args) {
		Validator val = new Validator() {
			public boolean isValid(String str) {
				System.out.println("rrrrrr");
				return true;
			}
		};
	}
}

//	public abstract class Carrot implements Validator{
//написать реализацию