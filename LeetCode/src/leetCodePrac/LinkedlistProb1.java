package leetCodePrac;

import leetCodePrac.LinkedListCode.Node;

public class LinkedlistProb1 {
	
	Node head; // head of list

	/* Linked list Node*/
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public static void main(String args[])
	{
		LinkedlistProb1 llist = new LinkedlistProb1();

		/* Use push() to construct below list
		1->2->1->3->1 */
		llist.push(1);
		llist.push(2);
		llist.push(1);
		llist.push(3);
		llist.push(1);
		int x =3;
		/*Checking count function*/
		llist.show();
		llist.findNewlist(3);
		//System.out.println("Count of 1 is " + llist.count(1));
	}
	private void findNewlist(int x) {
		// TODO Auto-generated method stub
		
		Node new1 = head;
		Node new2 = head;
		while(new1!=null) {
			if(new1.data <= x) {
				
			}
		}
		
	}
	public void show() {
		
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}
	

}
