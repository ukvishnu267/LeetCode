package may3rdweekLeetcode;

public class ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ValidNumber obj = new ValidNumber();
		String s = "-123.456e789";
		boolean ans = obj.isNumber(s);
	}

	public boolean isNumber(String s) {
        
        
		s =s.trim();
		
		boolean pntprs = false, eprs = false, nprs = false, numAftrE= false;
		
		for(int i=0 ;i<s.length();i++) {
			if('0' <= s.charAt(i) && s.charAt(i)<='9') {
				nprs = true;
				numAftrE = true;
			}
			else if(s.charAt(i) == '.') {
				if(eprs || pntprs) {
					return false;
				}
				pntprs = true;
			
			}
			else if(s.charAt(i) == 'e' || s.charAt(i) == 'E'){
				if(eprs || !nprs) {
					return false;
				}
 				numAftrE = false;
				eprs = true;
				
			}
			else if(s.charAt(i) == '+' || s.charAt(i) == '-') {
				if(i != 0 &&  s.charAt(i-1)!= 'e' &&  s.charAt(i-1)!= 'E')
					return false;
			}
			else {
				return false;
			}
			
		}
		
		
		return nprs && numAftrE;}



}
