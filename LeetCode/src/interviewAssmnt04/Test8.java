package interviewAssmnt04;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8.hammingWeight(3);
	}
	public static int hammingWeight(int n) {
		int ones = 0;
		while(n!=0) {
			ones = ones + (n & 1);
			System.out.println(ones);
			n = n>>>1;
			System.out.println(n);
		}
		
		System.out.println(ones);
		return ones;
	}
	

}
