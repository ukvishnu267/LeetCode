package interviewAssmnt01;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test10 obj = new Test10();
		String in = "dir\\n\\tsubdir1\\n\\t\\tfile1.ext\\n\\t\\tsubsubdir1\\n\\tsubdir2\\n\\t\\tsubsubdir2\\n\\t\\t\\tfile2.ext";
		int ans= obj.lengthLongestPath(in);
		
		System.out.println(ans);

	}
	public int lengthLongestPath(String input) {
	    String[] paths = input.split("\n");
	    int[] stack = new int[paths.length+1];
	    int maxLen = 0;
	    for(String sr:paths)
	    	System.out.println(sr);
	    for(String s:paths){
	        int lev = s.lastIndexOf("\t")+1, curLen = stack[lev+1] = stack[lev]+s.length()-lev+1;
	        if(s.contains(".")) maxLen = Math.max(maxLen, curLen-1);
	    }
	    return maxLen;
	}

}
