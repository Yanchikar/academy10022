package lesson_11;

import java.io.Serializable;

public class Ponyavka<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {

	private T poniT;
	private V poniV;
	private K poniK;

	public static void main(String[] args) {
		Ponyavka<String, Animal, Double> Poni = new Ponyavka<>("mg", new Pon(), 1.1);

		Poni.printPonyav();
	}

	public Ponyavka(T poniT, V poniV, K poniK) {
		this.poniT = poniT;
		this.poniV = poniV;
		this.poniK = poniK;
	}

	public T getPoniT() {
		return poniT;
	}

	public void setPoniT(T poniT) {
		this.poniT = poniT;
	}

	public V getPoniV() {
		return poniV;
	}

	public void setPoniV(V poniV) {
		this.poniV = poniV;
	}

	public K getPoniK() {
		return poniK;
	}

	public void setPoniK(K poniK) {
		this.poniK = poniK;
	}

	public void printPonyav() {
		System.out.println(poniT.getClass());
		System.out.println(poniV.getClass());
		System.out.println(poniK.getClass());
	}
}
// дженерики и т д
// два конструктора, getter, setter
// мин число (циклы, строка в массив, что-то с ним делать)