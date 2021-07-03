package april5thweekLeetcode;

public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindFirstandLastPositionofElementinSortedArray obj = new FindFirstandLastPositionofElementinSortedArray();
		int nums[] = { 5, 7, 7, 8, 8, 10 };
		int target = 6;
		//System.out.println(obj.searchRange(nums, target));
		int ans[] = obj.searchRange(nums, target);
		System.out.println(ans[0]+" "+ans[1]);
	}

	public int[] searchRange(int[] nums, int target) {
		int[] res = new int[] { -1, -1 };
		if (nums.length == 0)
			return res;
		int st = 0, end = nums.length - 1;

		while (st < end) {
			int mid = st + (end - st) / 2;

			if (nums[mid] >= target) {
				end = mid;
			} else {
				st = mid + 1;
			}
		}

		if (nums[st] != target)
			return res;

		res[0] = st;
		end = nums.length ;

		while (st < end) {
			int mid = st + (end - st) / 2;

			if (nums[mid] > target) {
				end = mid;
			} else {
				st = mid + 1;
			}

		}
		res[1] = st-1;
		
		return res;

	}

}
