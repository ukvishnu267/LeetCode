package weeklyContest240;

import java.util.HashMap;

public class FindSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 1, 2, 2, 2, 3 };
		int[] nums2 = { 1, 4, 5, 2, 5, 4 };
		FindSumPairs obj = new FindSumPairs(nums1, nums2);
		int index = 3, val = 2;
		obj.add(index, val);
		int tot = 8;
		int param_2 = obj.count(tot);
	}

	int[] nums1, nums2;
	HashMap<Integer, Integer> freq = new HashMap<>();

	public FindSumPairs(int[] nums1, int[] nums2) {
		this.nums1 = nums1;
		this.nums2 = nums2;
		for (int x : nums2)
			increaseFreq(x, 1);
		
		for (HashMap.Entry<Integer,Integer> entry : freq.entrySet())
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
	}

	private void increaseFreq(int key, int inc) {
		freq.put(key, freq.getOrDefault(key, 0) + inc);
	}

	public void add(int index, int val) {
		increaseFreq(nums2[index], -1); // Remove old one
		nums2[index] += val;
		increaseFreq(nums2[index], 1); // Count new one
	}

	public int count(int tot) {
		int ans = 0;
		for (int a : nums1)
			ans += freq.getOrDefault(tot - a, 0); // a + b = tot -> b = tot - a
		return ans;
	}

}
