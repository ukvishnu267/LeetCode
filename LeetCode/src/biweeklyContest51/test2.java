package biweeklyContest51;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class test2 {
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test2 obj = new test2();
		int  n= 5;
		obj.SeatManager(n);
		obj.reserve();
		obj.reserve();
		obj.unreserve(1);
		obj.reserve();
		obj.reserve();
		obj.reserve();
		obj.reserve();
		obj.unreserve(5);
		
	}

	public void SeatManager(int n) {
		System.out.println("null");
		for(int i =1; i<=n;i++) {
			pq.add(i);
			//System.out.println(seats[i]);
		}
	        
	    }

	public int reserve() {
		int sno= pq.peek() ;
		pq.remove();
		System.out.println(sno);
		return sno;
		

	}

	public void unreserve(int seatNumber) {

		pq.add(seatNumber);
		System.out.println("null");
	}
}
