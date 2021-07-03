package may4thweekLeetcode;

public class MaximumProductofWordLengths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaximumProductofWordLengths obj = new MaximumProductofWordLengths();
		String[] wo = {"abcw","baz","foo","bar","xtfn","abcdef"};
		int ans = obj.maxProduct(wo);
		System.out.println(ans);
	}

	public int maxProduct(String[] words) {

		int[] check = new int[words.length];
		int max =0;
		
		for(int i=0;i<words.length;i++) {
			int num =0 ;
			
			for(int j=0;j<words[i].length();j++) {
				
				int x = words[i].charAt(j) - 'a';
				
				num |= 1<<x;
				//System.out.println(num);
			}
			
			check[i]= num;
		}
		
		/*
		 * for(int i:check) System.out.println(i);
		 */
		
		for(int i=0;i<words.length;i++) {
			
			for(int j=i+1;j<words.length;j++) {
				
				
				if((check[i] & check[j]) == 0) {
					max = Math.max(max	, words[i].length()*words[j].length());
				}
			}
		}
		
		
		return max;
		
	}
}
