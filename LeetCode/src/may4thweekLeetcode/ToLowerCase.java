package may4thweekLeetcode;

public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ToLowerCase obj = new ToLowerCase();
		
		String s = "Lower";
		String ans = obj.toLowerCase(s);
		System.out.println(ans);
	}

	public String toLowerCase(String s) {
		StringBuilder ans= new StringBuilder();
		for(char x:s.toCharArray()) {
			
			if(x >= 65 && x<=90) {
				 x = (char) ((x - 'A') + 'a');
			}
			
			ans.append(x);
		}
		return ans.toString();

	}

}
