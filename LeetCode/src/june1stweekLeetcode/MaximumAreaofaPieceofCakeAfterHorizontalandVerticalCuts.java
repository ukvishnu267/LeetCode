package june1stweekLeetcode;

import java.util.Arrays;

public class MaximumAreaofaPieceofCakeAfterHorizontalandVerticalCuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int h = 5, w = 4;
		int[] ho = {3,1};
		int[] ve = {1};
		MaximumAreaofaPieceofCakeAfterHorizontalandVerticalCuts obj = new MaximumAreaofaPieceofCakeAfterHorizontalandVerticalCuts();

		int ans = obj.maxArea(h, w, ho, ve);
		System.out.println(ans);
	}

	public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

		Arrays.sort(horizontalCuts);
		Arrays.sort(verticalCuts);
		int mod = 1_000_000_007;
		int l1 = horizontalCuts.length;
		int l2 = verticalCuts.length;
		int l1max = Math.max(h- horizontalCuts[l1-1],horizontalCuts[0]);
		int l2max = Math.max(w- verticalCuts[l2-1],verticalCuts[0]);
		for (int i = 1; i < l1; i++) {
			l1max = Math.max(horizontalCuts[i]- horizontalCuts[i-1],l1max);
			
		}
		for (int i = 1; i < l2; i++) {
			l2max = Math.max(verticalCuts[i]- verticalCuts[i-1],l2max);
			
		}
		return (int)(l1max*1L*l2max%mod);
		
	}

}
