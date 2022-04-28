package lesson_11;

public class Average<T extends Number> {
	private T[] array;

	public Average(T[] array) {
		this.array = array;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public double average() {
		double sum = 0.0;
		for (T value : array) {
			sum += value.doubleValue();
		}

		return sum / array.length;
	}

	public double min() {
		double min = Double.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i].doubleValue() < min)
				min = array[i].doubleValue();
		}
		return min;
	}

	public double max() {
		double max = Double.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i].doubleValue() < max)
				max = array[i].doubleValue();
		}
		return max;
	}
}
