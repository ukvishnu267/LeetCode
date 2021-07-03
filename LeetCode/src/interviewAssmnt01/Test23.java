package interviewAssmnt01;

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test23 obj = new Test23();
		int[] prices = {3,2,6,5,0,3};
		int ans = obj.maxProfit(prices);
		System.out.println(ans);
	}

	public int maxProfit(int[] prices) {
		
		int ans = 0;
		int sm=prices[0];
		for(int i=0;i<prices.length-1;i++) {
			
			if(prices[i+1]<prices[i]) {
				sm = Math.min(prices[i+1],sm);
			}
			else {
				ans = Math.max(prices[i+1] - sm,ans);
			}
			
		}
		
		
		return ans;
		

	}

}
