package may1stweekLeetcode;

import java.util.HashMap;

public class PrefixAndSuffixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrefixAndSuffixSearch obj  = new PrefixAndSuffixSearch();
		String[] words = {"WordFilter","f","f","f","f","f","f","f","f","f","f"};
		
		obj.WordFilter(words);

	}
	HashMap<String,Integer> map = new HashMap();
	public void WordFilter(String[] words) {
        
		for(int w=0;w<words.length;w++) {
				  
			for(int i=0;i<= 10  && i< words[w].length();i++) {
				for(int j=0; j<=10 && j< words[w].length();j++) {
					
					map.put(words[w].substring(0,i)+'#'+words[w].substring(words[w].length()-j), w);
				}
			}
		}
		System.out.println(map);
		
    }

	public int f(String prefix, String suffix) {
		
		return(map.containsKey(prefix+"#"+suffix)?map.get(prefix+"#"+suffix):-1);

	}

}
