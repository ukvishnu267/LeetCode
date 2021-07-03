package biweeklyContest51;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 obj = new test1();
		String s = "a1c";
		String ans = obj.replaceDigits(s);
		System.out.println(ans);
	}

	public String replaceDigits(String s) {
		StringBuilder ans= new StringBuilder();
		for(int i =0 ;i<s.length();i++) {
			if(i%2 != 0) {
				
				char prevst  = s.charAt(i-1);
				char st = s.charAt(i);
				int num = Character.getNumericValue(st);
				st = (char) (prevst + num);
				//System.out.println(st);
				ans.append(st);
				
			}else {
				ans.append(s.charAt(i));
			}
			
			
		}
		//System.out.println(ans);
		return ans.toString();
		
	

	}

}
