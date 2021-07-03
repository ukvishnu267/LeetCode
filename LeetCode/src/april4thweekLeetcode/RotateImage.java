package april4thweekLeetcode;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RotateImage obj = new RotateImage();
		int matrix[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		obj.rotate(matrix);
		
	}
	
	public void rotate(int[][] matrix) {
		
		int n=matrix.length;
		for (int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i]= tmp;
			}
		}
		
		for (int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[i][n-j-1];
				matrix[i][n-j-1]= tmp;
			}
		}
		
		/*
		 * for (int i=0;i<n;i++) { for(int j=0;j<n;j++) {
		 * 
		 * System.out.print(matrix[i][j]+" "); } System.out.println(); }
		 */
        
    }

}
