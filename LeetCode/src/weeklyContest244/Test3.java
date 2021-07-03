package weeklyContest244;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3 obj = new Test3();
		String s = "11100001100110";

		int ans = obj.minFlips(s);
		System.out.println(ans);
	}

	public int minFlips(String s) {

		int ans = 0;
		int l = s.length();
		int cnt1 = 0, cnt0 = 0;
		int odd0 = 0, odd1 = 0;
		if (l % 2 == 0) {

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					cnt1++;
				}
			}

			cnt0 = l - cnt1;
			for (int i = 0; i < s.length(); i += 2) {
				if (s.charAt(i) == '1') {
					odd1++;
				}
			}
			int even1 = cnt1 - odd1;
			if(even1 > odd1) {
				ans = 2* odd1;
			}else {
				ans = 2*even1;
			}

		} else {
			
			
		}
		return ans;

	}

}
