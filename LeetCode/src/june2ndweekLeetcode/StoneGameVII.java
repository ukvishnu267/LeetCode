package june2ndweekLeetcode;

public class StoneGameVII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nu = {7,90,5,1,100,10,10,2};
		
		StoneGameVII obj = new StoneGameVII();
		int ans = obj.stoneGameVII(nu);
		System.out.println(ans);
	}

	public int stoneGameVII(int[] stones) {

		int n = stones.length;
		int[] dp = new int[n];

		for (int i = n - 1; i >= 0; i--) {

			int tmp = 0;

			int sum = stones[i];

			for (int j = i; j < n; j++) {

				if (i != j) {
					sum +=stones[j];
					int a = sum - stones[j];
					int b = sum - stones[i];

					System.out.println(j+" ->"+a+" "+b);
					dp[j] = Math.max(a - tmp, b - dp[j]);
				}
				tmp = dp[j];

			}

		}
		return dp[n - 1];
	}

}
