package weeklyContest240;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 obj = new Test1();
		int[][] logs = {{1982,1998},{2022,2024}};
		int ans = obj.maximumPopulation(logs);

		System.out.println(ans);
	}

	public int maximumPopulation(int[][] logs) {

		int ans = Integer.MIN_VALUE;
		int arr[] = new int[120];
		for(int i =0;i<logs.length;i++) {
			for(int j=logs[i][0];j<logs[i][1];j++) {
				arr[j-1950]++;
			}
		}
		int ind = 0;
		for(int i=0;i<120;i++) {
			//System.out.print(arr[i]+" ");
			if(arr[i]>ans) {
				ans = arr[i];
				ind = i;
			}
				
			
		}
		return ind+1950;
	}

}
