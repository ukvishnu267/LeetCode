package weeklyContest244;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 obj = new Test2();
		int[] nu = { 5,1,3 };
		int ans = obj.reductionOperations(nu);
		System.out.println(ans);
	}

	public int reductionOperations(int[] nums) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i : nums) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>(hm);

		Iterator itr = tm.keySet().iterator();

		
		int c = 0;
		int ans = c;
		while (itr.hasNext()) {
			int key = (int) itr.next();
			if (c > 0) {
				ans += hm.get(key) * (c);
			}

			c++;
		}

		return ans;
	}
}
