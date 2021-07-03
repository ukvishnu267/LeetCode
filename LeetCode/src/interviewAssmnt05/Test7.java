package interviewAssmnt05;

import java.util.List;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	List<Integer> pre = new ArrayList<>();
	public boolean isValidBST(TreeNode root) {
		
		
		
		preorder(root);
		for(int i=1;i<pre.size();i++) {
			if(pre.get(i)<= pre.get(i-1))
				return false;
		}
		
		return true;
	}
	
	public void preorder(TreeNode root) {
		
		preorder(root.left);
		pre.add(root.val);
		preorder(root.right);
		
		
	}
	
}
