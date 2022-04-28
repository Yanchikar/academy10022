package lesson_10;

public enum ColorJuice {
	ORANGE, APPLE, PINEAPPLE("yellow");

	private String col;

	ColorJuice(String col) {
		this.col = col;
	}

	ColorJuice() {
		this.col = "orange";
	}

	public String getCol() {
		return col;
	}
}
