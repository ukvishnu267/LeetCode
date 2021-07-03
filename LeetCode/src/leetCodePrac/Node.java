package leetCodePrac;


public class Node {

	Node head;
	int val;
	Node next;

	Node() {
	}

	Node(int val) {
		this.val = val;
	}

	Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}

	public void push(int new_data) {

		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	public void show() {

		Node current = head;
		while (current != null) {
			System.out.print(current.val+" -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}
