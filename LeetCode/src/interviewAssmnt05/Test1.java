package interviewAssmnt05;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 obj = new Test1();
		int x = -1;
		System.out.println(x);
		int[] arr = {12,15,17,23,34,56,65,67,70,3,7,9};
		int ans = obj.pivotSearch(arr);
		System.out.println(ans);
		
	}
	
	public int pivotSearch(int[] arr) {
		int len = arr.length;
		
		int l=0, h = len-1;
		int mid=0;
		
		while(l<h) {
			 mid = (l+h)/2;
			if(arr[mid] > arr[l] && arr[mid ]>arr[h]) {
				l=mid+1;
				
			}else {
				h = mid-1;
			}
		}
		
		return arr[mid];
	}

}
