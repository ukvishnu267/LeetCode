package june3rdweekLeetcode;

public class KInversePairsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static Integer[][] dp = new Integer[1001][1001];

	public int kInversePairs(int n, int k) {

		if (n == 0)
			return 0;
		if (k == 0)
			return 1;
		
		if(dp[n][k] != null ) return dp[n][k];
		
		int cnt = 0;
		for(int i =0 ;i<=Math.min(k, n-1);i++) {
			cnt = (cnt + kInversePairs(n-1,k-i))% 1000000007;
		}
		
		dp[n][k] = cnt;
		
		return dp[n][k];
	}
}
