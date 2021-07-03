package weeklyContest245;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 obj = new Test1();
		String num = "3542786";
		String ans = obj.largestOddNumber(num);
		System.out.println(ans);
	}

	public String largestOddNumber(String num) {

		String sub="";
		int len = num.length();
		for(int i=0;i<num.length();i++) {
			int ch = num.charAt(len - 1 -i) - '0';
			//System.out.println(ch);
			if(ch%2 != 0) {
				sub = num.substring(0,len-i);
				break;
			}
				
		}
		return sub;
	}

}
