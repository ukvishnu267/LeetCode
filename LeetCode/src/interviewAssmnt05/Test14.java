package interviewAssmnt05;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n1 = "1896", n2= "98";
		Test14 obj = new Test14();
		String ans = obj.addStrings(n1, n2);
	}

	public String addStrings(String num1, String num2) {

		int carry = 0;
		StringBuilder sb = new StringBuilder();
		
		for (int i = num1.length(), j = num2.length(); i >= 0 && j >= 0; i--, j--) {
			int x = num1.charAt(i) - '0';
			int y = num2.charAt(j) - '0';

			int z = x + y + carry;
			carry = z / 10;
			sb.append((char)z);

		}
		
		return sb.reverse().toString();
		
	}

}
