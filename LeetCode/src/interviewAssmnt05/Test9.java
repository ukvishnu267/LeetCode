package interviewAssmnt05;

import java.util.ArrayList;
import java.util.List;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	List<Integer> li = new ArrayList<>();
	
	public boolean findTarget(TreeNode root, int k) {

		inorder(root);
		
		for(int i=0;i<li.size();i++) {
			int num = k - li.get(i);
			if(binarySearch(li,num)) return true;
		}
		
		return false;
		
		
	}
	
	private boolean binarySearch(List<Integer> li2, int num) {
		// TODO Auto-generated method stub
		
		int l=0;int h=li2.size()-1;
		int m=0;
		
		while(l<=h) {
			m = (l+h)/2;
			
			if(li2.get(m) == num) return true;
			else if(li2.get(m) > num) h = m-1;
			else l = m+1;
		}
		
		return false;
		
	}

	public void inorder(TreeNode root) {
		
		if(root==null) return;
		inorder(root.left);
		li.add(root.val);
		inorder(root.right);
	}

}
