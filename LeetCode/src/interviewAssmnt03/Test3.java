package interviewAssmnt03;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String address= "255.100.50.0";
		StringBuilder ans= new StringBuilder();
		String add= "[.]";
		for(int i=0;i<address.length();i++) {
			if(address.charAt(i) == '.') {
				ans.append(add);
			}else {
				ans.append(address.charAt(i));
			}
		}
		System.out.println(ans.toString());
	}
	

}