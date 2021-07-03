package april1stweekLeetcode;

public class RemoveNthNodeFromEndofList {
	ListNode head = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveNthNodeFromEndofList obj = new RemoveNthNodeFromEndofList();
		obj.push(9);
		obj.push(2);


		
		obj.showList();
		

	}
	
	public void push(int val) {
		ListNode node = new ListNode(val);
		node.next = head;
		head = node;
		
	}
	public void showList() {
		
		
		System.out.println(head.val);
		Solution sln= new Solution();
		head = sln.removeNthFromEnd(head, 1);
		
		while(head !=null ) {
			System.out.print(head.val  + "->");
			head = head.next;
		}
		System.out.println("null");
	}

}


  //Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode removalNode = head;
    	ListNode beforeRemovalNode = head;
    	ListNode removalNodePlusN = head;
    	int i= 1;
    	while(removalNodePlusN != null) {
    		
    		//System.out.println(i);
    		if(n == i) {
    			while(removalNodePlusN.next != null) {
    				//System.out.println("yes");
    				beforeRemovalNode = removalNode;
    				removalNode = removalNode.next;
    				removalNodePlusN = removalNodePlusN.next;
    			}
    			if(beforeRemovalNode == removalNode) {
    				//System.out.println("yesss");
    				head = head.next;
    			}
    				
    			else
    				beforeRemovalNode.next= removalNode.next;
    		}
    		else {
    			removalNodePlusN = removalNodePlusN.next;
    		}
    		i += 1;

    		
    	}
    	
    	return head;
        
    }
}
