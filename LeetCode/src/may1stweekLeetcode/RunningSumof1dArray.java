package may1stweekLeetcode;

public class RunningSumof1dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunningSumof1dArray obj = new RunningSumof1dArray();
		int nums[] = {1,2,3,4};
		int ans[] = obj.runningSum(nums);
		for(int i:nums)
			System.out.println(i);
	}
	
	public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            nums[i] = sum+nums[i];
            sum = nums[i];
        }
        return nums;
        
    }

}
