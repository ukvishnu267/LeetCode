package interviewAssmnt03;

import java.util.LinkedList;
import java.util.Queue;

import leetCodePrac.Node;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node connect(Node root) {

		
		Node level_start=root;
		
		Node ans = level_start;
        while(level_start!=null){
        	Node cur=level_start;
            while(cur!=null){
                if(cur.left!=null) cur.left.next=cur.right;
                if(cur.right!=null && cur.next!=null) cur.right.next=cur.next.left;
                
                cur=cur.next;
            }
            level_start=level_start.left;
        }
		
        return ans;
	}

}
