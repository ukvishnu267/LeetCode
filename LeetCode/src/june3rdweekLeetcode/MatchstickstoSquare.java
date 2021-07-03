package june3rdweekLeetcode;

import java.util.Arrays;

public class MatchstickstoSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m = {1,1,2,2,2};
		MatchstickstoSquare obj = new MatchstickstoSquare();
		boolean ans = obj.makesquare(m);
		System.out.println(ans);
	}

	public boolean makesquare(int[] matchsticks) {

		long sum =0l ;
		for(int i:matchsticks) sum =sum +i;

		
		if(sum%4 != 0 || matchsticks.length<4) return false;
		
		long tar = sum/4;
		Arrays.sort(matchsticks);
		
		long s1=0,s2=0,s3=0,s4=0;
		return helper (matchsticks , matchsticks.length -1, s1,s2,s3,s4,tar);
		
	}

	private boolean helper(int[] matchsticks, int i, long s1, long s2, long s3, long s4, long tar) {
		// TODO Auto-generated method stub
		
		
		if(s1 > tar || s2 > tar || s3 > tar || s3 > tar ) return false;
		
		if(i == -1) {
			if( s1 == tar && s2 == tar && s3 == tar && s4 == tar )
				return true;
			else
				return false;
		}
		return helper(matchsticks , i-1 , s1+matchsticks[i],s2,s3,s4,tar) ||
				helper(matchsticks , i-1 , s1,s2+matchsticks[i],s3,s4,tar) ||
				helper(matchsticks , i-1 , s1,s2,s3+matchsticks[i],s4,tar) ||
				helper(matchsticks , i-1 , s1,s2,s3,s4+matchsticks[i],tar);
	}
	

}
