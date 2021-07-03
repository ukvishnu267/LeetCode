package may3rdweekLeetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> ans = new ArrayList<>();
		
		Queue<TreeNode> lvl = new LinkedList<TreeNode>();
		if (root != null) lvl.add(root);
		else return ans;
		
		int len = root == null ? 0 : 1;
		while(len>0) {
			List<Integer> eachans = new ArrayList<>();
			for(int i=0;i<len;i++) {
				TreeNode node = lvl.poll();
				if(node.left != null)
					lvl.add(node.left);
				
				if(node.right != null)
					lvl.add(node.right);
				
				eachans.add(node.val);	
			
			}
			ans.add(eachans);
			len = lvl.size();
			
			
		}
		
		
		
		return ans;
	}
}
