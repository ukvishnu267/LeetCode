package weeklyContest244;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat = {{0,0,0},{0,1,1},{1,1,1}};
		int[][] tar = {{1,1,1},{0,1,0},{0,0,0}};
		Test1 obj = new Test1();
		boolean ans = obj.findRotation(mat, tar);
		System.out.println(ans);

	}

	public boolean findRotation(int[][] mat, int[][] target) {

		int val=0;
		int len = mat.length;
		int[][] tmp = new int[len][len];
		boolean suc= false;
		
		
		while(val<4 && !suc) {
			suc = true;
			if(val>0) {
				for(int i=0;i<len;i++) {
					for(int j=0;j<len;j++)
						mat[i][j] = tmp[i][j];
					
				}
			}
			
			
			for(int i=0;i<len;i++) {
				for(int j=0;j<len;j++) {
					tmp[j][len-i-1] = mat[i][j];
				}
			}
		
			for(int i=0;i<len;i++) {
				for(int j=0;j<len;j++) {
					if(tmp[i][j] != target[i][j]) {
						suc= false;
						break;
						
					}
						
					
				}
			}
			val++;
			
		}
		
		return suc;
	}

}
