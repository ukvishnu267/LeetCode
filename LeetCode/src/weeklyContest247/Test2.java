package weeklyContest247;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grid = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Test2 obj = new Test2();
		int[][] ans = obj.rotateGrid(grid, 2);
		
	}

	public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int rowStart = 0, rowEnd = m - 1;
        int colStart = 0, colEnd = n - 1;

        while (rowStart < rowEnd && colStart < colEnd) {
            // the pattern will start repeating after number of rotations equal to the count of numbers in that layer.
            int count = 2 * ((colEnd - colStart + 1) + (rowEnd - rowStart - 1));
            int rotations = k % count;
            
            // start the rotations from top row 
            // then move left
            // move bottom
            // move right
            for (int i = 0; i < rotations; i++) {
                rotateTopRow(grid, rowStart, rowEnd, colStart, colEnd);
            }

            // contract the layer
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        // in place rotation
        return grid;
    }

    private void rotateTopRow(int[][] grid, int rowStart, int rowEnd, int colStart, int colEnd) {
        int temp1 = grid[rowStart][colEnd], temp2 = grid[rowStart][colEnd];

        for (int j = colEnd - 1; j >= colStart; j--) {
            temp1 = grid[rowStart][j];
            grid[rowStart][j] = temp2;
            temp2 = temp1;
        }

        rotateLeftCol(grid, rowStart, rowEnd, colStart, colEnd, temp1);
    }

    private void rotateLeftCol(int[][] grid, int rowStart, int rowEnd, int colStart, int colEnd, int temp) {
        for (int r = rowStart + 1; r <= rowEnd; r++) {
            int temp2 = grid[r][colStart];
            grid[r][colStart] = temp;
            temp = temp2;
        }
        rotateBottomRow(grid, rowStart, rowEnd, colStart, colEnd, temp);
    }

    private void rotateBottomRow(int[][] grid, int rowStart, int rowEnd, int colStart, int colEnd, int temp) {
        for (int c = colStart + 1; c <= colEnd; c++) {
            int temp2 = grid[rowEnd][c];
            grid[rowEnd][c] = temp;
            temp = temp2;
        }
        rotateRightColumn(grid, rowStart, rowEnd, colStart, colEnd, temp);
    }

    private void rotateRightColumn(int[][] grid, int rowStart, int rowEnd, int colStart, int colEnd, int temp) {
        for (int r = rowEnd - 1; r >= rowStart; r--) {
            int temp2 = grid[r][colEnd];
            grid[r][colEnd] = temp;
            temp = temp2;
        }
    }

}
