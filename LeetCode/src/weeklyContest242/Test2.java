package weeklyContest242;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 obj = new Test2();
		int[] d = {1,3,2};
		double hr = 2.7;
		
		
		int ans = obj.minSpeedOnTime(d, hr);
		System.out.println(ans);
	}

	public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        int min = 1, max = 100000000;
        int ans = -1;
        while(min <= max){
            int mid = (max + min)/2;
            System.out.print (mid+" ");
            double sum = 0;
            for(int i = 0; i<n-1; ++i){
                sum += Math.ceil( ( (double) dist[i]) /mid);
            }
            sum = sum + ( ( (double) dist[n-1]) /mid);
            System.out.println(sum);
            if(sum > hour){
                min = mid+1;
            }else{
                ans = mid;	
                max = mid-1;
            }
        }
        return ans;
    }
}
