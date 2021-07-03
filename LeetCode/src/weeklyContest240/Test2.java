package weeklyContest240;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 obj = new Test2();
		
		int[] nums1 = {55,30,5,4,2}, nums2= {100,20,10,10,5};
		int ans = obj.maxDistance(nums1, nums2);
		System.out.println(ans);

	}

	public int maxDistance(int[] nums1, int[] nums2) {
		
		int res=0,i=0,n= nums1.length,m=nums2.length;
		
		for(int j=0;j<m;j++) {
			System.out.println(i+" && "+j);
			while(i<n && nums1[i] >nums2[j]) {
				System.out.println(nums1[i]+" > "+nums2[j]);
				i++;
			}
			System.out.println("i is "+i);
			if(i == n)
				break;
			res = Math.max(res, j-i);
			
		}
		return res;
		
	}

}
