package weeklyContest238;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfDigitsinBaseK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumOfDigitsinBaseK obj = new SumOfDigitsinBaseK();
		int n= 10;
		int k = 2;
		int ans = obj.sumBase(n, k);
		System.out.println(ans);
	}
	public int sumBase(int n, int k) {

		int digi;
		List<Integer> ans = new ArrayList<Integer>();
		int i = 0;
		while(n!= 0 ) {
			digi = n%k ;
			
			n = n/k;
			ans.add(digi);

		}

		int answr = 0;
		Collections.reverse(ans);
		//System.out.println(ans.size());
		for(int j=0;j<ans.size();j++)
			answr+= ans.get(j);
		//System.out.println(answr);

		return answr;
		
	        
	    }
}
