package june3rdweekLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		
		PascalsTriangle obj = new PascalsTriangle();
		List<List<Integer>> ans = obj.generate(n);
		
		for(List<Integer> i:ans) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println();	
		}
	}

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> ans = new ArrayList<>();
		ans.add(Arrays.asList(1)) ;
		
		for(int i=1;i<numRows;i++) {
			List<Integer> temp = new ArrayList<>();
			temp.add(1);
			for(int j=1;j<i;j++) {
				int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j) ;
				temp.add(val);
			}
			temp.add(1);
			//temp.clear();
			ans.add(temp);
		}
		
		return ans;
	}

}
