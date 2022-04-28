package Exam;

public class Exam<T extends Number> {

	protected T[] array;
	protected static int number;

	public Exam() {
//	this.array = array.clone();
	}

	public Exam(T[] array) {
		this.array = array;
	}

	
	public void addMark(T mark) {
		int index = 0;
		if (index > array.length) {
			T[] array2 = T[] new Exam [array.length * 2 + 1];
			System.arraycopy(array, 0, array2, 0, array.length);
			array = array2;
		}
		array[index++] = mark;
	}

	public double average() {
		double sum = 0.0;

		for (T value : array) {
			sum += value.doubleValue();
		}

		return sum / array.length;

//	boolean sameAvg(Exam<?> ob) {
//		return average() == ob.average();
	}
}