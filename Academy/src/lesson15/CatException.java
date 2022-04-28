package lesson15;

public class CatException extends Exception{
	
	
	private static final long serialVersionUID = 1L;
	private int detail;

	public CatException(int detail, String message) {
		super (message);
		this.detail = details;
	}
	
}
