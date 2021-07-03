package may1stweekLeetcode;

public class ConvertSortedListtoBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedListToBST(ListNode head) {
		
		if(head == null) {
			return null;
		}
		return constructTree(head,null); 

	}
	
	public TreeNode constructTree(ListNode head, ListNode tail) {
		
		ListNode slow = head;
		ListNode fast = head;
		if(head == tail) return null;
		
		while(fast != tail && fast.next != tail) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		TreeNode root = new TreeNode(slow.val);
		root.left = constructTree(head,slow);
		root.right = constructTree(slow.next,tail);
		
		return root;
	}

}
