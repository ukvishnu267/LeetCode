package interviewAssmnt05;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode cur =head;
		ListNode prev = head;
		int x=0,y=0;
		while(cur.next!=null) {
			if((x-y) == n) {
				prev = prev.next;
				cur  = cur.next;
				x++;y++;
			}else {
				cur = cur.next;
				x++;
			}
		}
		
		prev.next = prev.next.next;
		
		return head;
	}

}
