package may1stweekLeetcode;

public class DeleteOperationforTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteOperationforTwoStrings obj = new DeleteOperationforTwoStrings();

		String word1 = "sea", word2 = "eat";

		int ans = obj.minDistance(word1, word2);
		System.out.println(ans);

	}

	public int minDistance(String word1, String word2) {
		
		int le = lcs(word1,word2);
		//System.out.println(le);
		return word1.length()+word2.length() - 2*le;
		
	}
	
	public int lcs(String t1,String t2) {
		
		int[][] dp = new int[t1.length()+1][t2.length()+1];
		for(int i=0;i<=t1.length();i++) {
			
			for(int j=0;j<=t2.length();j++) {
				if(i == 0 || j ==0) {
					continue;
				}
				if(t1.charAt(i-1) == t2.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
					
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					
				}
			}
		}
		
		return dp[t1.length()][t2.length()];
	}

}
