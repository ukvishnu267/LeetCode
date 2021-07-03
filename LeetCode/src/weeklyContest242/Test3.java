package weeklyContest242;

import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "0000000000";
		int min=2,max=5;
		
		
		Test3 obj = new Test3();
		
		boolean ans = obj.canReach(s, min, max);
		System.out.println(ans);
		
	}

	public boolean canReach(String s, int minJump, int maxJump) {
        int i = 0;
        TreeSet<Integer> ts = new TreeSet();
        ts.add(0);
        while(++i < s.length()){
            if(s.charAt(i) == '0'){
                Integer lower = ts.floor(i-minJump);
                
                System.out.println(lower);
                if(lower != null && lower+maxJump >= i){
                    ts.add(i);
                }
            }
        }
        return ts.last() == s.length()-1;
        }

}
