package interviewAssmnt02;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3 obj = new Test3();
		String s = "III";
		int ans = obj.romanToInt(s);
		System.out.println(ans);

	}

	public int romanToInt(String s) {
		int num = 0;
		int l = s.length();
		int last = 1000;
		for (int i = 0; i < l; i++) {
			int v = getValue(s.charAt(i));
			System.out.println(v);
			if (v > last)
				num = num - last * 2;
			num = num + v;
			System.out.println("num is "+num);
			last = v;
		}
		return num;
	}

	private int getValue(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
}
