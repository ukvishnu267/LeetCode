package interviewAssmnt01;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test5 obj = new Test5();
		int N = 857;
		int ans = obj.rotatedDigits(N);
		
		System.out.println(ans);
	}

	public int rotatedDigits(int N) {

		int ans = 0;
		 for( int i=1;i<=N;i++) {
			 int dig=0;
			 int c=0;
			 int d=0;
			 int val = i;
			 while (val != 0 ) {
				 dig = val %10;
				 //System.out.println(i+ " && dig "+ dig);
				 val /=10;
				 if(dig == 1 || dig == 0 || dig == 8) {
					 d=1;
					 continue;
				 }
					 
				 else if (dig != 2 && dig != 5 && dig != 6 && dig != 9 ) {
					 c=1;
					 //System.out.println(i+ " && c"+ c);
					 break;
				 }	else {
					 c = 2;
				 }
				 
			 }
			 
			 if(c == 2 || c==2 && d == 1) {
				 
				 //System.out.print(i+ " ");
				 ans++;
			 }
				 
		 }
		//System.out.println();
		return ans;
	}

}
