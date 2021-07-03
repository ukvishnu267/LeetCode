package interviewAssmnt01;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test21 obj = new Test21();
		String s= "abcde", goal = "cdeab";
		boolean ans = obj.rotateString(s, goal);
		System.out.println(ans);
	}

	public boolean rotateString(String s, String goal) {

        return s.length() == goal.length() && (s + s).contains(goal);

	}

}
