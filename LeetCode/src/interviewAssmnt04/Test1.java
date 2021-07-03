package interviewAssmnt04;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="codeleet";
		int[] ind = {4,5,6,7,0,2,1,3};
		Test1 obj = new Test1();
		String ans  = obj.restoreString(s, ind);
		System.out.println(ans);
	}

	public String restoreString(String s, int[] indices) {
		
		int si = indices.length;
		StringBuilder ans = new StringBuilder();
		for(int i=0;i<si;i++) {
			for(int j=0;j<si;j++) {
				if(indices[j]==i) {
					ans.append(s.charAt(j));
				}
			}
		}

		return ans.toString();
	}

}
