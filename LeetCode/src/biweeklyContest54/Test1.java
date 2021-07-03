package biweeklyContest54;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isCovered(int[][] ranges, int left, int right) {

		boolean su = true;
		while(left<=right && su) {
			su = false;
			for(int i=0;i< ranges.length;i++) {
				if( ranges[i][0] <= left && ranges[i][1] >= left) {
					su = true;
					break;
				}
				
			}
			left++;
		}
		
		if(su) return true;
		else 			
			return false;
		
	}

}
