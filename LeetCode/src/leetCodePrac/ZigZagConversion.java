package leetCodePrac;

public class ZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigZagConversion obj = new ZigZagConversion();
		String s = "PAYPALISHIRING";
		int n = 4;
		String ans = obj.convert(s, n);

		System.out.println(ans);

	}

	public String convert(String s, int numRows) {
		char[] c = s.toCharArray();
		int len = c.length;
		StringBuffer[] sb = new StringBuffer[numRows];
		for (int i = 0; i < sb.length; i++)
			sb[i] = new StringBuffer();

		int i = 0;
		while (i < len) {
			for (int idx = 0; idx < numRows && i < len; idx++) {
				// vertically down
				//System.out.println(idx +" "+i);
				sb[idx].append(c[i++]);
			}
				
			for (int idx = numRows - 2; idx >= 1 && i < len; idx--) // obliquely up
			{
				//System.out.println("--  "+idx+" "+i);
				sb[idx].append(c[i++]);
			}
				
		}
		for (int idx = 1; idx < sb.length; idx++)
			sb[0].append(sb[idx]);
		return sb[0].toString();
	}
}
