package june1stweekLeetcode;

public class MinCostClimbingStairs {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] cst = {10,15,20};
		MinCostClimbingStairs obj = new MinCostClimbingStairs();
		
		int ans = obj.minCostClimbingStairs(cst);
		System.out.println(ans);
	}
	int[] dp;
	public int minCostClimbingStairs(int[] cost) {

		int n = cost.length;
		dp =new int[n];
		return Math.min(findMin(cost, n-1), findMin(cost, n-2));
		
	}

	private int findMin(int[] cost, int n) {
		// TODO Auto-generated method stub
		if(n<0) return 0;
		if(n == 0 || n == 1)
			return cost[n];
		
		if(dp[n] !=0) return dp[n];
		dp[n] = cost[n]+ Math.min(findMin(cost, n-1), findMin(cost, n-2));
		return dp[n];
	}

}
