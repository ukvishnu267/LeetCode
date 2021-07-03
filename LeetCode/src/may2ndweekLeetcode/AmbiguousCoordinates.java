package may2ndweekLeetcode;

import java.util.ArrayList;
import java.util.List;

public class AmbiguousCoordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmbiguousCoordinates obj = new AmbiguousCoordinates();
		
		String s = "(00011)";
		List<String> ans = obj.ambiguousCoordinates(s);
		
		System.out.println(ans);
		
	}

	List<String> result = new ArrayList<String>();
	public List<String> ambiguousCoordinates(String s) {
		
		
		s = s.substring(1,s.length()-1);
		for(int i=1;i<s.length();i++) {
			
			//System.out.println(s.substring(0,i)+" "+s.substring(i));
			helper(s.substring(0,i),s.substring(i));
		}

		return result;
	}
	private void helper(String x, String y) {
		// TODO Auto-generated method stub
		List<String> dotx = putdot(x);
		List<String> doty = putdot(y);
		
		for(String dx:dotx) {
			if(isValid(dx)) {
				for(String dy:doty) {
					if(isValid(dy)) {
						result.add("("+dx+", "+dy+")");
					}
				}
			}
		}
	}
	private boolean isValid(String d) {
		// TODO Auto-generated method stub
		
		if(d.contains(".")) {
			
			String[] part = d.split("\\.");
			
			if(!part[0].equals("0") && part[0].startsWith("0")) return false;
			else return !part[1].endsWith("0");
		}else {
			
			 if(d.equals("0")) return true;
			 else return !d.startsWith("0");
		}

	}
	private List<String> putdot(String x) {
		// TODO Auto-generated method stub
		
		List<String> res = new ArrayList<>();
		res.add(x);
		for(int i=1;i<x.length();i++) {
			res.add(x.substring(0,i)+"."+x.substring(i));
		}
		
		return res;
	}
	
	

}
