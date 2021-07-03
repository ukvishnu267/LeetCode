package biweeklyContest54;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] g = {{7,1,4,5,6},{2,5,1,6,4},{1,5,4,3,2},{1,2,7,3,4}};
		
		Test3 obj = new Test3();
		int ans = obj.largestMagicSquare(g);
		
		System.out.println(ans);
	}

	public int largestMagicSquare(int[][] grid) {int n = grid.length;
	int m = grid[0].length;
	int a[][] = new int[n+2][m+2];
	long rowSum[][] = new long[n+2][m+2];

	for (int i=0 ; i<n ; i++) {
		for (int j=0 ; j<m ; j++) {
			a[ i + 1 ][ j + 1 ] = grid[ i ][ j ];
			rowSum[i+1][j+1] = rowSum[i+1][j] + grid[i][j];
		}
	}

	long colSum[][] = new long[n+2][m+2];
	for (int i=0 ; i<m ; i++) {
		for (int j=0 ; j<n ; j++) {
			colSum[j+1][i+1] = colSum[j][i+1] + grid[j][i];
		}
	}

	long diag1[][] = new long[n+2][m+2];
	long diag2[][] = new long[n+2][m+2];

	for (int i=1 ; i<=n ; i++) {
		for (int j=1 ; j<=m ; j++) {
			diag1[i][j] = diag1[i-1][j-1] + a[i][j];
		}
	}

	for (int i=1 ; i<=n ; i++) {
		for (int j=1 ; j<=m ; j++) {
			diag2[i][j] = diag2[i-1][j+1] + a[i][j];
		}
	}

	for (int size = Math.min(n , m)  ; size >= 1 ; size-- ) {


		for (int i=1 ; i<=n; i++) {
			for (int j=1 ; j<=m ; j++) {

				if ( i+size-1 > n || j+size-1 > m )
					continue;

				int rowX = i+size-1;
				int colY = j+size-1;

				long p = -1;
				boolean flag = true;
				for (int row = i ; row <= rowX ; row++) {
					long sum = rowSum[row][colY] - rowSum[row][j-1];
					if (p == -1)
						p = sum;
					else if (sum != p) {
						flag = false;
						break;
					}
				}


				for (int col = j ; col <= colY ; col++) {
					long sum = colSum[rowX][col] - colSum[i-1][col];
					if (sum != p) {
						flag = false;
						break;
					}
				}

				if (!flag)
					continue;

				long firstDiagonal = diag1[rowX][colY] - diag1[i-1][j-1];
				long secondDiagonal = diag2[rowX][j] - diag2[i-1][colY+1];

				if (firstDiagonal == p && secondDiagonal == p) {
					return size;
				}
			}
		}

	}
	throw new IllegalStateException();}

}
