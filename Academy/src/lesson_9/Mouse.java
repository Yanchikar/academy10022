package lesson_9;


public interface Mouse {
	 

	void clickRight();
	
	void clickLeft();
	
	void scrollUp();

	void scrollDown();
	
	default void eatCheese() {
		System.out.println("im eating cheese");
	}
}
