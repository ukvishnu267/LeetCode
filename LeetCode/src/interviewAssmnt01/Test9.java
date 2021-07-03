package interviewAssmnt01;

import java.util.Stack;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test9 obj = new Test9();
		String s = "2-5g-3-J";
		int k = 2;

		String str = obj.licenseKeyFormatting(s, k);
		System.out.println(str);

	}

	public String licenseKeyFormatting(String s, int k) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--)
			if (s.charAt(i) != '-')
				sb.append(sb.length() % (k + 1) == k ? '-' : "").append(s.charAt(i));
		return sb.reverse().toString().toUpperCase();
	}
}
