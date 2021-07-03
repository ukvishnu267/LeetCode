package interviewAssmnt01;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test4 obj = new Test4();

		int n = 16;
		boolean ans = obj.divisorGame(n);
		System.out.println(ans);

	}

	public boolean divisorGame(int n) {
		
		if(n%2 == 0) {
			return true;
		}else {
			return false;
		}

	}

}
