package shop;

public class Shopp {

	public static void main(String[] args) {
		User buyer = new User(27, "Vlad", 3000);
		User seller = new User(23, "Gena", 3000);
		Product[] basket = new Product[3];
		Coffe coffe = new Coffe(15.5, 3, "Только натуральное", "Соевое");
		Bun bun = new Bun(20, 2, "С корицей", 15);
		Icecream iсecream = new Icecream(15, 1, "Магнат", "Клубничка");

		basket[0] = coffe;
		basket[1] = bun;
		basket[2] = iсecream;

		Deal_ deal_ = new Deal_("Минск", buyer, seller);
		System.out.println(deal_);

		deal_.addProduct(coffe);
		deal_.addProduct(bun);
		deal_.addProduct(iсecream);

		System.out.println(deal_);

		deal_.removeProduct(1);
		System.out.println(deal_);

	}

}
