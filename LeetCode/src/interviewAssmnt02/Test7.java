package interviewAssmnt02;

import java.util.LinkedList;
import java.util.Queue;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int sumOfLeftLeaves(TreeNode root) {
        TreeNode ele =null;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int sum=0;
        if(root!= null)
        	q.add(root);
        else
        	return 0;
        while(!q.isEmpty()) {
     
        		ele = q.poll();
        		if(ele.left != null) {
            		System.out.println(ele.val);
            		q.add(ele.left);
            		sum += ele.left.val;
            	}
            	if(ele.right != null) {
            		q.add(ele.right);
            	}
        	
        	
        		
        }
        System.out.println(sum);
        return sum;
    }

}
