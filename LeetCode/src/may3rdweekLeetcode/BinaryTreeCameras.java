package may3rdweekLeetcode;

import java.util.HashSet;
import java.util.Set;

public class BinaryTreeCameras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int cam;
	Set<TreeNode> cov;

	public int minCameraCover(TreeNode root) {

		if (root == null) {
			return 0;
		}
		cam = 0;
		cov = new HashSet<TreeNode>();
		cov.add(null);
		dfs(root, null);
		return cam;

	}

	public void dfs(TreeNode node, TreeNode parent) {

		if (node != null) {
			dfs(node.left, node);
			dfs(node.right, node);

			if (parent == null && !cov.contains(node) || !cov.contains(node.left) || !cov.contains(node.right)) {

				cam++;
				cov.add(node);
				cov.add(parent);
				cov.add(node.left);
				cov.add(node.right);
			}
		}
	}

}
