package may2ndweekLeetcode;

public class MaximumPointsYouCanObtainfromCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaximumPointsYouCanObtainfromCards obj = new MaximumPointsYouCanObtainfromCards();

		int[] cardPoints = { 4, 2, 3, 4, 5, 6, 3 };
		int k = 3;
		int ans = obj.maxScore(cardPoints, k);
		System.out.println(ans);

	}

	public int maxScore(int[] cardPoints, int k) {

		int tsum = 0;
		int ksum = 0;
		for (int i : cardPoints) {
			tsum += i;

		}
		//System.out.println();
		for (int i = 0; i < cardPoints.length - k; i++) {
			ksum += cardPoints[i];

		}
		//System.out.println(tsum+ " -- "+ ksum);
		int ans = tsum - ksum;
		//System.out.println(ans);
		int j = 0;
		for (int i = cardPoints.length - k; i < cardPoints.length; i++) {
			ksum += cardPoints[i] - cardPoints[j];
			j++;
			if (ans < (tsum - ksum))
				ans = tsum - ksum;
		}

		return ans;
	}

}
