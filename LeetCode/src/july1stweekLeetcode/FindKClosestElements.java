package july1stweekLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindKClosestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindKClosestElements obj = new FindKClosestElements();
		int[] arr = {1,12,13,60,61,62,64,85};
		int k = 3, x = 2;
		obj.findClosestElements(arr, k, x);
		
	}

	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int l=0, h = arr.length-k,m=0;
		
		while(l<h) {
			m = (l +  h-1)/2;
			if( x - arr[m] > arr[m+k] -x ) l = m+1;
			else h = m;
		}
		
rra		int[] ans1 = Arrays.copyOfRange(arr, l, l+k);
		
		List<Integer> list = Arrays.stream(ans1).boxed().collect(Collectors.toList());
		
		list.stream().forEach(System.out::println);
		return list;
		
	}

}
