package april1stweekLeetcode;

public class OnesAndZeroes {

	int[][] dp;
	public int findMaxForm(String[] str, int m ,int n) {
		
		dp = new int[m+1][n+1];
		System.out.println(dp[m][n]);
		for(String s:str) {
			
			int[] count = count(s);
			for(int zero = m; zero>=count[0];zero--) {
				for(int one = n; one>=count[1];one--) {
					dp[zero][one] = Math.max(dp[zero - count[0]][one-count[1]]+1 , dp[zero][one] );
					System.out.println("for s "+s+"- "+zero+ ","+ one+ " - > "+dp[zero][one]);
				}
			}
		}
		return dp[m][n] ;
	}
	
	int[] count(String s) {
		
		int[] count = new int[2];
		for (char c:s.toCharArray()) {
			count[c - '0']++;
			
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"10","0001","111001","1","0"};
		int m = 5;
		int n = 4;
		OnesAndZeroes onesAndZeroes = new OnesAndZeroes();
		int ans = onesAndZeroes.findMaxForm(str,m,n);
		System.out.println(ans);
	}

}
