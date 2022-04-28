package shop;

public class Coffe extends Product {

	protected String milk;

	@Producer(startYaer = 2019, founderFullName = "KKK")
	protected Coffe(double price, int quantity, String name, String vegetarian, String milk) {
		super(price, quantity, name, "напиток");
		this.milk = milk;
	}

	public Coffe(double d, int i, String string, String string2) {
		
	}

	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	protected void cof() {
		System.out.println("Мы заменили в вашем коффе обычное молоко на : " + milk);
	}

	@Override
	protected double getDiscount() {

		return 0;
	}

}