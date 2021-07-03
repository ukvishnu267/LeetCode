package weeklyContest243;

import java.util.PriorityQueue;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] s= {5,1,4,3,2};
		int[] t= {2,1,2,4,5,2,1};
		
		Test3 obj = new Test3();
		int[] ans = obj.assignTasks(s, t);
		for(int x:ans)
			System.out.print(x+" ");
	}

	public int[] assignTasks(int[] servers, int[] tasks) {
		// since if there are multiple tasks that need to be assigned, we need to assign
		// in the order of index
		// so we can go through tasks from left to right
		// and ask what could be the server for this task
		// For which server it can be assigned, it is determined by which servers are
		// avaiable
		// we just need to choose from the servers that are available with smallest
		// weight
		// Like in priorityQueue
		// So if we have a group of servers with their own next available time
		// if next avaibable time <= the execution time of the task, we need to choose
		// the server with smallest weight
		// can we have 2 PQ, one is sorted by weight and index, this is currently
		// avaiable pq
		// one is sorted by available time, this is currently used server pq
		// [weight, index, avaialbe_time]
		PriorityQueue<int[]> freeServers = new PriorityQueue<>(
				(a, b) -> (a[0] != b[0]) ? (a[0] - b[0]) : (a[1] - b[1]));
		PriorityQueue<int[]> usedQueue = new PriorityQueue<>(
				(a, b) -> (a[2] != b[2]) ? (a[2] - b[2]) : ((a[0] != b[0]) ? (a[0] - b[0]) : (a[1] - b[1])));
		
		
		int n = servers.length;
		int m = tasks.length;
		// O(nLogn)
		for (int i = 0; i < n; i++) {
			freeServers.add(new int[] { servers[i], i, 0 });
		}
		for(int[] x:freeServers) {
			for(int y:x)
				System.out.print(y+" ");
			System.out.println();
		}
			
		int[] res = new int[m];
		// O(m * Logn)
		for (int i = 0; i < m; i++) {
			System.out.println("****************************");
			int t = tasks[i];
			System.out.println(t);
			while (!usedQueue.isEmpty() && usedQueue.peek()[2] <= i) {
				System.out.println("i is " +i);
				freeServers.add(usedQueue.poll());
			}
			// If there is no free servers now, we can find the used server with smallest
			// available time
			if (freeServers.isEmpty()) {
				System.out.println("freeServers.isEmpty");
				int[] cur = usedQueue.poll();
				res[i] = cur[1];
				cur[2] += t;
				usedQueue.add(cur);
			} else {
				System.out.println("freeServers is not Empty");
				int[] cur = freeServers.poll();
				res[i] = cur[1];
				cur[2] = i + t;
				usedQueue.add(cur);
			}
			System.out.println("used queue");
			for(int[] x:usedQueue) {
				for(int y:x)
					System.out.print(y+" ");
				System.out.println();
			}
			System.out.println("free server");
			for(int[] x:freeServers) {
				for(int y:x)
					System.out.print(y+" ");
				System.out.println();
			}
		}
		return res;
	}
}
