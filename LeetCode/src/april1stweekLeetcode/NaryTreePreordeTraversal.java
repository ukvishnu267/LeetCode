package april1stweekLeetcode;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreordeTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Definition for a Node.
class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
};

class Solution {
	List<Integer> res = new ArrayList<Integer>();

	public List<Integer> preorder(Node root) {

		if (root == null) {
			return res;
		}
		preOrderhelper(root);
		return res;

	}

	private void preOrderhelper(Node root) {
		// TODO Auto-generated method stub

		if (root.children == null) {
			return;
		}
		res.add(root.val);
		for (Node child : root.children) {
			preOrderhelper(child);
		}

	}
}