package interviewAssmnt01;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test14 obj = new Test14();
		int num = 101;
		int ans = obj.addDigits(num);

		System.out.println(ans);
	}

	public int addDigits(int num) {

		int ans = 0;
		
		while(num > 0) {
			ans +=  num%10;
			//System.out.println("ans is " +ans);
			num /=10;
			//System.out.println("num is " +num);
			if(num == 0 && ans>9) {
				num = ans;
				ans = 0;
				//System.out.println("num is " +num);
			}
		}
		
		return ans;
	}

}
