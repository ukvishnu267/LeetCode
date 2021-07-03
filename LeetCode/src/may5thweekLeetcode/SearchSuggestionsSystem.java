package may5thweekLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchSuggestionsSystem obj = new SearchSuggestionsSystem();
		String[] p = {"bags","baggage","banner","box","cloths"};
		String w = "bags";
		List<List<String>> ans = obj.suggestedProducts(p, w);
		for(List<String> i:ans) {
			for(String j:i)
				System.out.print(j+" ");
			System.out.println();
		}
	}

	public List<List<String>> suggestedProducts(String[] products, String searchWord) {

		Arrays.sort(products);

		List<List<String>> ans = new ArrayList<>();
		
		for(int i=0;i<searchWord.length();i++) {
			int k=0;
			List<String> st = new ArrayList<>();
			String s = searchWord.substring(0,i+1);
			//System.out.println(s);
			for(int j=0;j<products.length;j++) {
				if(products[j].startsWith(s)) {
					k++;
					st.add(products[j]);
				}
				if(k == 3 )
					break;
			}
			ans.add(st);
		}
		
		return ans;
	}
}
