package shop;

public class Cocoa extends Coffe {
	protected String sugar;

	@Producer (startYaer= 2020, founderFullName = "CCC")
	protected Cocoa(double price, int quantity, String name, String vegetarian, String sugar) {
		super(price, quantity, name, "напиток", type);
		this.sugar = sugar;
	}

	public String getSugar() {
		return sugar;
	}

	public void setSugar(String sugar) {
		this.sugar = sugar;
	}
}