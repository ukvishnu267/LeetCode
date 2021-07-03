package june2ndweekLeetcode;

import java.util.Arrays;

public class MaximumUnitsonaTruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] b = {{5,10},{2,5},{4,7},{3,9}};
		int t = 10;
		
		MaximumUnitsonaTruck obj = new MaximumUnitsonaTruck();
		int ans = obj.maximumUnits(b, t);
		System.out.println(ans);
		
	}

	public int maximumUnits(int[][] boxTypes, int truckSize) {

		int ans = 0;
		Arrays.sort(boxTypes,(a,b) -> (b[1]-a[1]));
		
		for(int i =0;i<boxTypes.length;i++) {
			if(truckSize > 0) {
				System.out.println(boxTypes[i][0]);
				ans += Math.min(truckSize, boxTypes[i][0]) * boxTypes[i][1];
				truckSize -=boxTypes[i][0];
			}else {
				break;
			}
			
		}
		
		
		
		return ans;
		
	}

}
