package april4thweekLeetcode;

public class PowerofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PowerofThree obj = new PowerofThree();
		int n =27;
		boolean ans = obj.isPowerOfThree(n);
		System.out.println(ans);

	}

	public boolean isPowerOfThree(int n) {
		
		while(n>=3) {
			if(n%3 != 0) return false;
			
			n /=3;
		}
		if (n==1) 
			return true;
		else
			return false;

	}

}
