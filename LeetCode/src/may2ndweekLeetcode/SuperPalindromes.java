package may2ndweekLeetcode;

public class SuperPalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperPalindromes obj = new SuperPalindromes();
		String left = "4", right = "1000";
		int ans = obj.superpalindromesInRange(left, right);

		System.out.println(ans);

	}

	public int superpalindromesInRange(String left, String right) {

		long l = Long.valueOf(left);
		long r = Long.valueOf(right);
		int ans = 0;
		for (int i = 1; i < 100000; i++) {

			StringBuilder sb = new StringBuilder(Integer.toString(i));
			for (int j = sb.length() - 1; j >= 0; j--) {
				sb.append(sb.charAt(j));
			}

			long n = Long.valueOf(sb.toString());
			n *= n;
			if (n > r)
				break;
			else if (n >= l && ispal(n)) {
				ans++;
			}

		}
		for (int i = 1; i < 100000; i++) {

			StringBuilder sb = new StringBuilder(Integer.toString(i));
			for (int j = sb.length() - 2; j >= 0; j--) {
				sb.append(sb.charAt(j));
			}

			long n = Long.valueOf(sb.toString());
			n *= n;
			if (n > r)
				break;
			else if (n >= l && ispal(n)) {
				ans++;
			}

		}
		return ans;
	}

	public boolean ispal(long n) {

		return n == reverse(n);
	}

	public long reverse(long n) {
		long rev = 0;
		while (n > 0) {

			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}

}
