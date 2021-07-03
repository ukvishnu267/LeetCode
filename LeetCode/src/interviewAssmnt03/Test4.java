package interviewAssmnt03;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	List<Integer> list = new ArrayList<>();
	
	public int kthSmallest(TreeNode root, int k) {
		printInorder(root);
		System.out.println();
		return(list.get(k+1);
		
		
	}
	void printInorder(TreeNode node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        list.add(val);
 
        /* now recur on right child */
        printInorder(node.right);
    }

}
