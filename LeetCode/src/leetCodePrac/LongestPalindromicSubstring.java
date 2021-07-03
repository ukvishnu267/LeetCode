package leetCodePrac;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
		String s = "aaaabbaa";
		String ans =obj.longestPalindrome(s);
		System.out.println(ans);
	}

	public String longestPalindrome(String s) {

		  int n = s.length();
		  String res = null;
		    
		  boolean[][] dp = new boolean[n][n];
		    
		  for (int i = n - 1; i >= 0; i--) {
		    for (int j = i; j < n; j++) {
		    	//System.out.println(i+" "+j);
		      dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
		      //System.out.print (dp[i][j] +" ");
		            
		      if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
		        res = s.substring(i, j + 1);
		        //System.out.println(res);
		      }
		    }
		    //System.out.println();
		  }
		    
		  return res;
	}

}
