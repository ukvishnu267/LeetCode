package interviewAssmnt02;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test9 obj = new Test9();
		String nm = "alex", t = "aaleexeex";
		boolean ans = obj.isLongPressedName(nm, t);
		System.out.println(ans);
	}

	public boolean isLongPressedName(String name, String typed) {

		int i = 0, m = name.length(), n = typed.length();
		for (int j = 0; j < n; ++j)
			if (i < m && name.charAt(i) == typed.charAt(j))
				++i;
			else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1))
				return false;
		return i == m;
	}
}
