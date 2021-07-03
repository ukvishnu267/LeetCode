package june4thweekLeetcode;

public class ReverseLinkedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseBetween(ListNode head, int left, int right) {
		if(head == null) return null;
		
		ListNode cur =head, prev=null;
		while(left>1) {
			prev = cur;
			cur = cur.next;
			left--;right--;
		}
		
		ListNode st = prev, tail=cur;
		ListNode tmp =null;
		
		while(right>0) {
			tmp = cur.next;
			cur.next = prev;
			prev = cur;
			cur= tmp;
			right--;
		}
		
		if(st!=null) {
			st.next = prev;
		}else {
			head = prev;
		}
		
		tail.next = cur;
		return head;
	}

}
