package june3rdweekLeetcode;

public class RangeSumQueryMutable {

	int[] trees;
	int[] nums = { 1, 7, 3, 0, 5, 8, 3, 2, 6 };
	int len;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}



	public void updateArr(int i, int j) {
		// TODO Auto-generated method stub
		i = i + 1;
		System.out.println("i is " + i);
		while (i <= len) {
			trees[i] += j;
			i += i & (-i);
			System.out.println(i);
		}

	}

	public void NumArray(int[] nums) {
		this.len = nums.length;
		this.nums = new int[len];
		this.trees = new int[nums.length + 1];
		
		for (int i = 0; i < nums.length; i++) {
			updateArr(i, nums[i]);
		}
		
    }
	

	public void update(int index, int val) {
		updateArr(index,val-nums[index]);
		nums[index] = val;
		
	}

	public int sumRange(int left, int right) {

		if(left ==  0) return getSum(right);
		
		return getSum(right) - getSum(left);
		
	}
	
	private int getSum(int i) {
		int sum = 0;
		i = i+1;
		while(i>0) {
			sum +=trees[i];
			i -=i&(-i);
		}
		
		return sum;
	}

}
