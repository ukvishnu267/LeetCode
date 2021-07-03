package leetCodePrac;

import leetCodePrac.Node;

public class AddTwoNumbers {
	Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNumbers obj = new AddTwoNumbers();
		Node l1 = new Node();
		Node l2 = new Node();
		l1.push(3);
		l1.push(4);
		l1.push(2);
		
		l2.push(4);
		l2.push(6);
		l2.push(5);
		l1.show();
		l2.show();
		
		obj.addTwoNumbers(l1, l2);
		
	}
	

	
	public Node addTwoNumbers(Node l1, Node l2) {
		
		Node c1 = l1;
		Node c2 = l2;
		Node sumnode = new Node(0);
		Node d = sumnode;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new Node(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new Node(1);
        return sumnode.next;
               

	}
}

