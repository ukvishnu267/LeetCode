package weeklyContest241;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 obj = new Test2();
		String s = "1100000111";
		int ans=  obj.minSwaps(s);
		System.out.println(ans);

	}

	public int minSwaps(String s) {

		int ans = 0;
		int cnt1 =0 ;
		int tot = s.length();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)== '1') {
				cnt1++;
			}
		}
		int cnt0 = tot - cnt1;
		int swap = 0;
		if(Math.abs(cnt1-cnt0) >1)
			return  0 ;
		else {
			
			if(cnt1>cnt0) {
				
				for(int i=0;i<tot;i+=2) {
					if(s.charAt(i)!='1') {
						swap++;
					}
				}
			}else if(cnt1<cnt0) {
				for(int i=0;i<tot;i+=2) {
					if(s.charAt(i)!='0') {
						swap++;
					}
				}
			}else {
				int oddCnt0=0;
				int oddCnt1=0;
				for(int i=0;i<tot;i+=2) {
					if(s.charAt(i)=='0') {
						oddCnt0++;
					}else {
						oddCnt1++;
					}
				}
				swap = Math.min(oddCnt1,oddCnt0);
				
			}
		}
		
		
		return swap;
		
	}

}
