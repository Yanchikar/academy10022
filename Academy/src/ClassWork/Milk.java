package ClassWork;

public class Milk extends Product {

	String color;

	public Milk() {
		super();
		color = "white";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Milk [color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}

}
