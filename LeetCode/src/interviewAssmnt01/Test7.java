package interviewAssmnt01;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test7 obj = new Test7();

		String s = "aA";
		String str = obj.reverseVowels(s);
		System.out.println(str);

	}

	public String reverseVowels(String s) {

		StringBuilder vow = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u'||s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
					|| s.charAt(i) == 'U') {
				vow.append(s.charAt(i));

			}

		}
		
		//System.out.println(vow.length());
		StringBuilder ans = new StringBuilder();
		int j=0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u'||s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
					|| s.charAt(i) == 'U') {
				ans.append(vow.charAt(vow.length()-1 - j));
				j++;

			}else {
				ans.append(s.charAt(i));
			}

		}
		return ans.toString();

	}

}
