package april4thweekLeetcode;

public class UniquePathsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UniquePathsII obj = new UniquePathsII();

		int[][] mat = { { 0, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } };
		int ans = obj.uniquePathsWithObstacles(mat);
		System.out.println(ans);
	}

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {

		int ans = 0;
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] new1 = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i - 1 >= 0 && j - 1 >= 0) {
					if (obstacleGrid[i][j] == 1)
						new1[i][j] = 0;
					else if(obstacleGrid[i - 1][j] == 1)
						new1[i][j] =  new1[i][j - 1];
					else if (obstacleGrid[i ][j-1] == 1)
						new1[i][j] = new1[i - 1][j] ;
					else
						new1[i][j] = new1[i - 1][j] + new1[i][j - 1];
				}
					
				else if (i - 1 >= 0) {
					if (obstacleGrid[i][j] == 1)
						new1[i][j] = 0;
					else
						new1[i][j] = new1[i - 1][j];
				}
					
				else if (j - 1 >= 0) {
					if (obstacleGrid[i][j] == 1)
						new1[i][j] = 0;
					else
						new1[i][j] = new1[i][j - 1];
				}
					
				else
				{
					if (obstacleGrid[i][j] == 1)
						new1[i][j] = 0;
					else
						new1[i][j] = 1;
					
				}
					

				//System.out.print (new1[i][j]+ " ");
			}
			//System.out.println();
		}
		//System.out.println(new1[m-1][n-1]);

		return new1[m-1][n-1];

	}

}
