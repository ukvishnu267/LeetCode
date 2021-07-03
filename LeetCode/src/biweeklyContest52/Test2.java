package biweeklyContest52;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 obj= new Test2();
		
		int m1 = 0, m2= 0;
		int[] ans = obj.memLeak(m1, m2);
		for(int i :ans)
			System.out.print(i+ " ");
	}

	public int[] memLeak(int m1, int m2) {
		int[] ans = new int[3];
		int i=1;
		
		if(m1 ==0 && m2 ==0 ) {
			ans[0]= 1;
			ans[1]=0;
			ans[2]=0;
		}
		else {
		while(true) {
			
			if(m1>=m2) {
				if(m1-i>=0)
					m1 -=i;
			}
				
			else {
				if(m2-i>=0)
					m2 -=i;
			}
				
			i++;
			if(m1-i <0 && m2-i<0)
				break;
			
			
		}
		
		ans[0]= i;
		ans[1]=m1;
		ans[2]=m2;
		}
		
		return ans;
		
		
		
	}

}
