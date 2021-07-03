package may2ndweekLeetcode;

public class NumMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
		NumMatrix obj = new NumMatrix(matrix);
		int r1=2,c1=1,r2=4,c2=3;
		int param_1 = obj.sumRegion(r1, c1, r2, c2);
		
		System.out.println(param_1);
	}

	int dp[][];

	public NumMatrix(int[][] matrix) {

		dp = new int[matrix.length+1][matrix[0].length+1];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				dp[i][j+1] = dp[i][j] +  matrix[i][j];
			}
		}
		
	
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {

		int ans = 0;
		for(int i = row1;i<=row2;i++) {
			ans +=  dp[i][col2+1] - dp[i][col1] ;
		}
		
		return ans;
	}

}
