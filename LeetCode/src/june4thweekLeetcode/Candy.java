package june4thweekLeetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Candy().candy(new int[] {1,2,87,87,87,2,1}));
	}

	public int candy(int[] ratings) {

		int l = ratings.length;

		int[] left = new int[l];
		int[] right = new int[l];

		Arrays.fill(left, 1);
		Arrays.fill(right, 1);

		for (int i = 1; i < l; i++) {

			if (ratings[i] > ratings[i - 1]) {
				left[i] = left[i-1]+1;
			}
		}

		Arrays.stream(left).forEach(System.out::print);
		for (int i = l-2; i >=0; i--) {

			if (ratings[i] > ratings[i + 1]) {
				right[i] = right[i+1]+1;
			}
		}
		System.out.println();
		Arrays.stream(right).forEach(System.out::print);
		int cnt=0;
		for (int i = 0; i < l; i++) {

			cnt += Math.max(left[i], right[i]);
		}
		System.out.println();
		return cnt;

	}

}
