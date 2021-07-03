package biweeklyContest53;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 obj = new Test1();
		String s = "ab";
		
		int ans = obj.countGoodSubstrings(s);
		
		System.out.println(ans);
	}

	public int countGoodSubstrings(String s) {
		
		int ans = 0;
		if(s.length()<3)return 0;
		for(int i=0;i<s.length()-2;i++) {
			
			String q = s.substring(i, i+3);
			//System.out.println(q);
			if(q.charAt(0)!= q.charAt(1)) {
				if(q.charAt(1)!= q.charAt(2)) {
					if(q.charAt(2)!= q.charAt(0)) {
						ans++;
					}
				}
			}
		}
		
		return ans;

	}

}
