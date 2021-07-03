package weeklyContest241;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 obj = new Test1();

		int[] nums = { 3, 4, 5, 6, 7, 8 };
		int ans = obj.subsetXORSum(nums);

		System.out.println(ans);
	}

	public int subsetXORSum(int[] set) {
		//int ans = 0;

		int n = set.length;

		int sum = 0;

		for (int i = 0; i < (1 << n); i++) {
			// System.out.print("{ ");
			int xor = 0;
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0) {
					xor = xor ^ set[j];
					//System.out.print(set[j] + " ");
				}

			}
			sum += xor;

			//System.out.println();

		}
		return sum;

	}
}
