package biweeklyContest54;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] c = {3,4,1,2};
		int k = 2;
		Test2 obj = new Test2();
		int ans = obj.chalkReplacer(c, k);
		System.out.println(ans);
	}

	public int chalkReplacer(int[] chalk, int k) {

	
		int ans = 0;
		int le = chalk.length;
		long sum =0;
		for(int i:chalk) {
			sum +=i;
		}
		
		k = (int) (k %sum);
		for(int i=0;i<le;i++) {
			
			if(k>=chalk[i]) {
				k -=chalk[i];
				//System.out.println(i + " "+ k);
			}else {
				ans = i;
				break;
			}
					
		}
		return ans;
	}

}
