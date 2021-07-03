package may5thweekLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueensII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		NQueensII obj = new NQueensII();
		int ans = obj.totalNQueens(n);
		System.out.println(ans);
	}
	public int totalNQueens(int n) {
        char[][] board = new char[n][n];
		
		for(int i=0;i<n;i++)
			Arrays.fill(board[i], '.');
		
		List<List<String>> result = new ArrayList<>();
		
		backtrack(n,board,0,result);
		
		return result.size();
    }
    private void backtrack(int n, char[][] board, int row, List<List<String>> result) {
		// TODO Auto-generated method stub
		
		if(row == n) {
			System.out.println(row);
			result.add(constBoard(board));
			return;
		}
		
		for(int col=0;col<n;col++) {
			if(canPlaceQ(board,row,col)) {
				board[row][col]= 'Q';
				backtrack(n,board,row+1,result);
				board[row][col]= '.';
			}
		}
			
		
	}

	private boolean canPlaceQ(char[][] board, int row, int col) {
		// TODO Auto-generated method stub
		
		for(int i =row-1 ; i>=0;i--) {
			if(board[i][col]== 'Q')
				return false;
		}
		
		for(int i = row-1,  j=col-1; i>=0 && j>=0;i--,j--) {
			if(board[i][j]== 'Q')
				return false;
			
		}
		
		for(int i = row-1,  j=col+1; i>=0 && j<board.length;i--,j++) {
			if(board[i][j]== 'Q')
				return false;
			
		}
		return true;
	}

	private List<String> constBoard(char[][] board) {
		// TODO Auto-generated method stub
		
		List<String> res = new ArrayList<>();
		
		for(int i=0;i<board.length;i++)
			res.add(new String(board[i]));
		return res;
	}

}
