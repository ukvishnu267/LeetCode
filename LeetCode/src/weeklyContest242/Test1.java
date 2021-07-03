package weeklyContest242;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 obj = new Test1();
		String s = "1";
		boolean ans = obj.checkZeroOnes(s);
		System.out.println(ans);
	}

	public boolean checkZeroOnes(String s) {

		int max1 = 0, max0 =0;
		int one = 0, zero = 0;
		if(s.equalsIgnoreCase("1")) return true;
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				
				if(s.charAt(i) == '1') {
					one++;
				}
				else {
					zero++;
				}
					
				
				
				
			}else {
				one = 0;
				zero = 0;
			}
			max1 = Math.max(one, max1);
			max0 = Math.max(zero, max0);
			//System.out.println(max1+" "+ max0);
		}
		//System.out.println(max1+" "+ max0);
		if(max1>max0)
			return true;
		else
			return false;
		
	}

}
