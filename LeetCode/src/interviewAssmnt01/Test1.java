package interviewAssmnt01;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 obj = new Test1();
		int x= -120;
		int ans = obj.reverse(x);
		System.out.println( 2147483646 + 10 > Integer.MAX_VALUE);
		System.out.println(ans);

	}

	public int reverse(int x) {
		int ans = 0;
		int newx = x;
		
		while(newx !=0) {
			ans = ans*10 + newx%10;
			//System.out.println(ans);
			newx /= 10;
			
		}
		int answ = ans;
		//System.out.println(answ);
		newx= answ;
		ans = 0;
		
		while(newx !=0) {
			ans = ans*10 + newx%10;
			//System.out.println(ans);
			newx /= 10;
			
		}
		while(x%10 == 0)
			x /=10;
		if(ans != x) {
			return 0;
		}
		
	
		
	return answ;
	

	}

}
