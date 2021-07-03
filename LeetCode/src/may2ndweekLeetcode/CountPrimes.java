package may2ndweekLeetcode;

import java.util.Arrays;

public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountPrimes obj = new CountPrimes();
		int n= 10;
		int ans = obj.countPrimes(n);
		System.out.println(ans);
	}

	public int countPrimes(int n) {
		int cnt = 0;
		
		if(n<=2) return 0;
		
		boolean[] pr = new boolean[n];
		Arrays.fill(pr, true);
		
		pr[0]= false;
		pr[1]=false;
		
		for(int i=2;i*i<=n;i++) {
			
			if(pr[i]) {
				for(int j= i+i ;j<n;j+=i) {
					pr[j]=false;
				}
			}
		}
		
		for(boolean k:pr) {
			cnt += k == true?1:0;
		}
		
		return cnt;
		

	}

}
