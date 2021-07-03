package interviewAssmnt04;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minTimeToVisitAllPoints(int[][] points) {

		int tot = 0;
		for(int i=1;i<points.length;i++) {
			
			int x = points[i][0]- points[i-1][0];
			if(x<0) x *=-1;
			int y = points[i][1]- points[i-1][1];
			if(y<0) y *=-1;
			
			tot += (Math.max(x, y));
			
		}
		return tot;
	}

}
