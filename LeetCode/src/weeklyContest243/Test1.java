package weeklyContest243;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String f = "aba", s = "ab", t = "aab";
		Test1 obj = new Test1();
		boolean ans = obj.isSumEqual(f, s, t);
		System.out.println(ans);
	}

	public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

		int f = 0;
		for (char x : firstWord.toCharArray()) {
			//System.out.println(x - 'a');
			f = f*10 + (x - 'a');
		}
		//System.out.println(f);
		
		int s = 0;
		for (char y : secondWord.toCharArray()) {
			s = s*10 + (y - 'a');
		}
		//System.out.println(s);
		
		int t = 0;
		for (char z : targetWord.toCharArray()) {
			t = t*10 + (z - 'a');
		}
		//System.out.println(t);
		
		
		int tot = f+s;
		if(tot == t)
			return true;
		else
			return false;
	}
	
	
	

}
