package interviewAssmnt05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1= {4,9,5};
		int[] nums2= {9,4,9,8,4};
		
		Test4 obj = new Test4();
		int[] ans = obj.intersect(nums1, nums2);
		System.out.println(ans);
	}

	public int[] intersect(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        
        for(int i=0;i<l1;i++){
            hm1.put(nums1[i],hm1.getOrDefault(nums1[i], 0)+1);
        }
        
        for(int j=0;j<l2;j++){
            hm2.put(nums2[j],hm2.getOrDefault(nums2[j], 0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        
        for(Integer ke:hm1.keySet()) {
        	if(hm2.containsKey(ke)) {
        		int mi = Math.min(hm2.get(ke), hm1.get(ke));
        		while(mi-- >0){
        			ans.add(ke);
        		}
        	}
        }
       
        int[] ans1 = new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
        	ans1[i] = ans.get(i);
        }
        
        return ans1;
        
    }

}
