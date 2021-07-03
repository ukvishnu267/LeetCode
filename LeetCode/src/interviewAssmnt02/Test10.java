package interviewAssmnt02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = {2,3,1,3,2,4,6,7,9,2,19};
		int a2[] = {2,1,4,3,9,6};
		Test10 obj = new Test10();
		int ans[] = obj.relativeSortArray(a1, a2);
		for (int x : ans)
			System.out.print(x + " ");
	}

	public int[] relativeSortArray(int[] arr1, int[] arr2) {

		List<Integer> rest = new ArrayList<>();
		Set<Integer> a2 = new HashSet<>();
		int[] ans = new int[arr1.length];

		int c = 0;
		for (int i : arr2)
			a2.add(i);

		for (int y : arr1) {
			if (!a2.contains(y))
				rest.add(y);
		}
		Collections.sort(rest);
		for (int i : arr2) {
			for (int j : arr1) {
				//System.out.println(i+" "+j);
				if (i == j) {
					ans[c] = j;
					c++;
				}
			}
		}

		for (int i : rest) {
			ans[c] = i;
			c++;
		}
		return ans;
	}
}
