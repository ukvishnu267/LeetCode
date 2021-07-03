package april1stweekLeetcode;

public class FibonacciNumber {
	
	public int fib(int n) {
		int ans = 0;
		if (n ==0)
			return 0;
		
		int a=0;
		int b=1;
		ans = a+b;
		for (int i=2;i<=n;i++) {
			ans = a+b;
			a = b;
			b = ans;
			
		}
		
		return ans;
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciNumber fibonacciNumber = new FibonacciNumber();
		int n = 30;
		System.out.println(fibonacciNumber.fib(6));

	}

}
