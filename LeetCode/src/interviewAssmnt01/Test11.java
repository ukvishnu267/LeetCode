package interviewAssmnt01;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test11 obj = new Test11();
		String x= "abcdefg";
		int k = 2;
		String ans =obj.reverseStr(x,k);
		System.out.println(ans);

	}

	public String reverseStr(String s, int k) {
        char[] ca = s.toCharArray();
        for (int left = 0; left < ca.length; left += 2 * k) {
            for (int i = left, j = Math.min(left + k - 1, ca.length - 1); i < j; i++, j--) {
                char tmp = ca[i];
                ca[i] = ca[j];
                ca[j] = tmp;
            }
        }
        return new String(ca);}
	



}
