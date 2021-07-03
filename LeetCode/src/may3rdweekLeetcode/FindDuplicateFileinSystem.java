package may3rdweekLeetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileinSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] paths = {"root/a 1.txt(abcd) 2.txt(efsfgh)","root/c 3.txt(abdfcd)","root/c/d 4.txt(efggdfh)"};
		FindDuplicateFileinSystem obj = new FindDuplicateFileinSystem();
		List<List<String>> ans = obj.findDuplicate(paths);
		
		for(List str:ans)
			System.out.println(str);

	}

	public List<List<String>> findDuplicate(String[] paths) {
		List<List<String>> ans = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();

		for (String ch : paths) {

			String[] full = ch.split(" ");
			String root = full[0];

			for (int i = 1; i < full.length; i++) {
				String word = full[i];
				int b = word.indexOf('(');
				int e = word.indexOf(')');
				String file = word.substring(0, b);
				String content = word.substring(b + 1, e);

				if (map.containsKey(content)) {
					List<String> str = map.get(content);
					str.add(root + "/" + file);
				} else {
					List<String> str = new ArrayList<>();
					str.add(root + "/" + file);
					map.put(content, str);
				}

			}

		}

		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			//System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			if(entry.getValue().size() >1)
				ans.add(entry.getValue());
		}
			

		
		return ans;

	}

}
