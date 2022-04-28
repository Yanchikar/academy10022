package shop;

public class Bun extends Product {
	protected String flavor;

	protected Bun(double price, int quantity, String name, String vegetarian, String flavor) {
		super(price, quantity, name, "молочные продукты");
		this.flavor = flavor;
	}

	public Bun(int price, int quantity, String name, int i) {
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	protected void fla() {
		System.out.println("Ваша булочка: " + flavor);
	}

	@Override
	protected double getDiscount() {

		return 0;
	}

}
