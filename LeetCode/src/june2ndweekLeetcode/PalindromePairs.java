package june2ndweekLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = { "abcd", "dcba", "lls", "s", "sssll" };
		PalindromePairs obj = new PalindromePairs();
		List<List<Integer>> ans = obj.palindromePairs(words);

		System.out.println("Ans is");
		for (List<Integer> lis : ans)
			for (Integer a : lis)
				System.out.print(a + " ");
			System.out.println();

	}

	public List<List<Integer>> palindromePairs(String[] words) {

		if (words == null || words.length < 1)
			return null;

		List<List<Integer>> ans = new ArrayList<>();

		for (int i = 0; i < words.length-1; i++) {

			for (int j = i+1; j < words.length; j++) {

				String each = words[i].concat(words[j]);
				if (isPalindrom(each)) ans.add(new ArrayList(Arrays.asList(i, j)));
				
				each =  words[j].concat(words[i]);
				if (isPalindrom(each)) ans.add(new ArrayList(Arrays.asList(j, i)));

				
			}
		}
		return ans;
	}

	private boolean isPalindrom(String each) {
		// TODO Auto-generated method stub

		int l = each.length();
		for (int i = 0; i < l / 2; i++) {
			if (each.charAt(i) != each.charAt(l - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
