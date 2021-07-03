package april1stweekLeetcode;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> one = new ArrayList();
		one.add(2);
		
		List<Integer> two = new ArrayList();
		two.add(3);
		two.add(4);
		
		List<Integer> three = new ArrayList();
		three.add(6);
		three.add(5);
		three.add(7);
		
		List<Integer> four = new ArrayList();
		four.add(4);
		four.add(1);
		four.add(8);
		four.add(3);
		
		List<List<Integer>> triangle = new ArrayList();
		triangle.add(one);
		triangle.add(two);
		triangle.add(three);
		triangle.add(four);
		
		Triangle obj = new Triangle();
		int ans = obj.minimumTotal(triangle);
		System.out.println(ans);

	}
	
	public int minimumTotal(List<List<Integer>> triangle) {
		//System.out.println(triangle.size());
		for(int i = 1;i<triangle.size();i++) {
			
			for (int j=0;j<triangle.get(i).size();j++) {
				int val;
				if(j == 0 ) {
					val = triangle.get(i).get(j)+triangle.get(i-1).get(j);
					//System.out.println(j+" "+val);
				}
				else if( j == triangle.get(i).size()-1) {
					val = triangle.get(i).get(j)+triangle.get(i-1).get(j-1);
					//System.out.println(j+" "+val);
				}
				else {
					int minVal = Math.min(triangle.get(i-1).get(j), triangle.get(i-1).get(j-1));
					val = triangle.get(i).get(j) + minVal;
					//System.out.println(j+" "+val);
				}
				triangle.get(i).set(j, val);
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int k= 0 ;k< triangle.get(triangle.size()-1).size();k++) {
			
			if(triangle.get(triangle.size()-1).get(k) < ans) {
				ans= triangle.get(triangle.size()-1).get(k);
			}
		}
		return ans;
        
    }

}
