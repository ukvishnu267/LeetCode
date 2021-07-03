package june1stweekLeetcode;

public class MaxAreaofIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxAreaofIsland obj = new MaxAreaofIsland();
		int[][] g = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };

		int ans = obj.maxAreaOfIsland(g);
		System.out.println(ans);
	}

	public int maxAreaOfIsland(int[][] grid) {

		int max = 0;
		int l = grid.length, b = grid[0].length;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < b; j++) {
				max = Math.max(findArea(grid, i, j), max);
				//System.out.print(max+ " ");
			}
			//System.out.println();

		}

		return max;
	}

	private int findArea(int[][] grid, int i, int j) {
		int l = grid.length, b = grid[0].length;
		
		if(i<0 || i>=l || j <0 || j>=b ||grid[i][j] == 0)
			return 0;
		
		grid[i][j]=0;
		
		return (1+ findArea(grid, i-1,j) + findArea(grid, i+1,j) + findArea(grid, i,j-1) + findArea(grid, i,j+1));
		
	}
}
