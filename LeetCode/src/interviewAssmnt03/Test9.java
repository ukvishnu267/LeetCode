package interviewAssmnt03;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode invertTree(TreeNode root) {
		TreeNode head = root;
		helper(head);
		
		return head;
		
	}
	
	public void helper(TreeNode root) {
		if(root ==null) return;
		TreeNode tmp = root.right;
		root.right = tmp.left;
		root.left = tmp;
		helper(root.left);
		helper(root.right);
	}

}
