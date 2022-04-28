package shop;

public class Icecream extends Product {
	protected String fruit;

	@Producer (startYaer= 2022, country = "Spain", founderFullName = "VVV")
	protected Icecream(double price, int quantity, String name, String vegetarian, String fruit) {
		super(price, quantity, name, "молочный продукт");
		this.fruit = fruit;
	}

	public Icecream(int i, int j, String string, String string2) {
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	protected void fru() {
		System.out.println("Мы добавили вам : " + fruit);
	}

	@Override
	protected double getDiscount() {
		return 0;
	}

}
