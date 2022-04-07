package ClassWork;

public class Product {

	String name;
	double cost;
	int amount;

	public Product() {
		System.out.println("Конструирование обьекта product");
		name = "IceCream";
		cost = 5;
		amount = 2;
	}

	Product(int amount, double cost, String name) {
		this.amount = amount;
		this.cost = cost;
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [name=");
		builder.append(name);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", amount=");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}
}
