package april1stweekLeetcode;

import java.util.Scanner;

import april1stweekLeetcode.PalindromLinkedList.Node;

public class PalindromeLinkedList {
	
	ListNode head = null; // head of list
	ListNode slow, fast, second_half;


 //Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val;this.next = null; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

	
	
    boolean isPalindrome(ListNode head) {
    	slow = head;
    	fast = head;
    	System.out.println(slow.val+" "+fast.val);
    	ListNode midNode = null;
    	ListNode PreMidNode = head;
    	boolean resu = true;
    	
    	if (head != null && head.next != null) {
    		
    	
    	while(fast != null && fast.next != null) {
    		
    		
    		fast = fast.next.next;
    		PreMidNode = slow;
    		slow = slow.next;
    	}
    	
    	if(fast != null) {
    		midNode = slow;
    		slow = slow.next;
    	}
    	
    	second_half = slow;
    	//System.out.println("second_half is "+second_half.val );
    	PreMidNode.next=null;
    	
    	
    	reverse();
    	
    	resu = compare(head, second_half);
    	
    	reverse(); // Reverse the second half again

		if (midNode != null) {
			// If there was a mid node (odd size case) which
			// was not part of either first half or second half.
			PreMidNode.next = midNode;
			midNode.next = second_half;
		}
		else
			PreMidNode.next = second_half;
    	
    	}
    	
		return resu;
        
    }

	private boolean compare(ListNode head, ListNode second_half2) {
		// TODO Auto-generated method stub
		
		PalindromeLinkedList llist1 = new PalindromeLinkedList();
		
		ListNode temp1 = head;
		ListNode temp2 = second_half2;
		llist1.printList(temp1);
		llist1.printList(temp2);
		int i=0;
		while (temp1 != null && temp2 != null) {
			System.out.println(i++ + " "+temp1.val+ " "+ temp2.val);
			if (temp1.val == temp2.val) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			else
				return false;
		}

		/* Both are empty reurn 1*/
		if (temp1 == null && temp2 == null)
			return true;
		
		return false;
	}

	private void reverse() {
		// TODO Auto-generated method stub
		
		ListNode current = second_half;
		ListNode prev = null;
		ListNode next;
		
		while(current != null) {
			
			next = current.next;
			current.next  = prev;
			prev = current;
			current = next;
			
		}
		
		second_half = prev;
		
	}
	
	public static void main(String[] args) {

		/* Start with the empty list */
		PalindromeLinkedList llist = new PalindromeLinkedList();

		int[] arr = { 1 };
		
		for (int i = 0; i < arr.length; i++) {
			llist.push(arr[i]);
			llist.printList(llist.head);
			
		}
		//System.out.println(llist.head.data);
		System.out.println(llist.isPalindrome(llist.head));
	}
	
	public void push(int new_data)
	{
		/* Allocate the Node &
		Put in the data */
		ListNode new_node = new ListNode(new_data);

		/* link the old list off the new one */
		new_node.next = head;

		/* Move the head to point to new Node */
		head = new_node;
	}
	
	void printList(ListNode ptr)
	{
		while (ptr != null) {
			System.out.print(ptr.val + "->");
			ptr = ptr.next;
		}
		System.out.println("NULL");
	}

}