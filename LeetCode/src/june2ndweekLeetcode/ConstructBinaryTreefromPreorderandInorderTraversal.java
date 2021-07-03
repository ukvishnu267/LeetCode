package june2ndweekLeetcode;

public class ConstructBinaryTreefromPreorderandInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {

		return helper(0,0,inorder.length-1,inorder,preorder);
		
		
	}

	private TreeNode helper(int preSt, int inSt, int inEnd, int[] inorder, int[] preorder) {
		// TODO Auto-generated method stub
		if( preSt > preorder.length-1 || inSt> inEnd) {
			return null;
		}
		TreeNode root = new TreeNode(preorder[preSt]);
		int c = 0;
		
		for(int i=inSt ; i<=inEnd;i++) {
			if(inorder[i] == root.val) {
				c = i;
			}
		}
		
		root.left = helper(preSt+1 , inSt , c-1 , inorder,preorder);
		root.right = helper(preSt+c- inSt+1 ,  c+1 ,inEnd, inorder,preorder);
		return root;
	}

}
