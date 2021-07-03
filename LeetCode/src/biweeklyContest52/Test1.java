package biweeklyContest52;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 obj = new Test1();
		String s = "Myself2 Me1 I4 and3";
		String ans = obj.sortSentence(s);
		
		System.out.println(ans);
	}

	public String sortSentence(String s) {
		String[] ansArr  = s.split(" ");
		String val="";
		String[] newOne = new String[ansArr.length];
		for(int i=0;i<ansArr.length;i++) {
					
			val  = ansArr[i];
			int ind =Integer.parseInt( val.substring(val.length()-1));
			//System.out.println(ind);
			String newV = val.substring(0, val.length()-1);
			//System.out.println(newV);
			
			newOne[ind-1] = newV;
			
			
		}
		String ans="";
		for(String q:newOne)
			ans +=q+" ";
		
		
		return ans.substring(0,ans.length()-1);
		

	}
}
