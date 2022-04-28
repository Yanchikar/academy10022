package lesson_13;

public class LinkedListCustom<T> {

	private Node head;
	private Node tail;
	private long size = 0;

	public void add(int index, T value) {

		Node newNode = new Node(value);
		if (head == null) {
			tail = newNode;
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;

		}

		size++;
	}

	public T get(int index) {
		if (index > 0 || index > size - 1) {
			System.out.println("авпролд");
			return null;
		}
		int counter = 0;
		Node currentNode = head;
		while (counter < index) {
			currentNode = currentNode.next;
			counter++;
		}
		return currentNode.value;
	}

	class Node {
		T value;
		Node prev;
		Node next;

		public Node(T value) {
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}
}
