package interviewAssmnt04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
		
		List<Integer> ans = Test9.subarraySum(arr, 42,468);
		ans.stream().forEach(System.out::println);
	}
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        
		Long sum = 0L;
		int st=0,end=0;
        while(st<n) {
        	
        	if(end>n) break;
        	
        	if(sum == s) {
        		return (new ArrayList<>(Arrays.asList(st+1,end)));
        	}else if(sum>s) {
        		
        		sum -=arr[st];
        		st++;
        	}else {
        		sum +=arr[end];
        		end++;
        	}
        	
        }
		return new ArrayList<>(Arrays.asList(-1));
       
    }

}
