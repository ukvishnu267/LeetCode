package weeklyContest243;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "76";
		int x =3;
		Test2 obj = new Test2();
		String ans = obj.maxValue(s, x);
		System.out.println(ans);
			
			
	}

	public String maxValue(String n, int x) {

		String ans = "";
		if(n.charAt(0) == '-') {
			
			int i;
			for( i=1;i<n.length();i++) {
				int a = n.charAt(i) - '0';
				//System.out.println(a);
				if(a > x) {
					System.out.println(i);
					ans = n.substring(0,i) +String.valueOf(x) + n.substring(i);
					break;
				}
				
			}
			if(i == n.length()) {
				ans = n + String.valueOf(x) ;
			}
		}else {
			int i;
			for( i=0;i<n.length();i++) {
				int a = n.charAt(i) - '0';
				//System.out.println(a);
				if(a < x) {
					ans = n.substring(0,i) +String.valueOf(x) + n.substring(i);
					break;
				}
				
			}
			if(i == n.length()) {
				ans = n + String.valueOf(x) ;
			}
		}
		return ans;
	}

}
