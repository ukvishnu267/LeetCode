package may1stweekLeetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class CourseScheduleIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseScheduleIII obj = new CourseScheduleIII();
		
		int[][] courses = {{300,200},{200,400},{1000,1250},{2000,3200}};
		int ans = obj.scheduleCourse(courses);
		System.out.println(ans);
		
	}

	public int scheduleCourse(int[][] courses) {
		//System.out.println(courses);
		Arrays.sort(courses, (a,b)-> a[1]==b[1] ? a[0]-b[0]:a[1]-b[1]);
		/*
		 * for(int i=0;i<courses.length;i++) { for(int j=0;j<courses[i].length;j++) {
		 * System.out.print(courses[i][j]+" "); } System.out.println(); }
		 */
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->b-a);
		int tm = 0;
		for(int[] course : courses) {
			if(course[0]<=course[1]) {
				
				if(course[0]+tm <= course[1]) {
					
					pq.offer(course[0]);
					tm+=course[0];
				}else {
					
					if(pq.peek() > course[0]) {
						tm -= pq.poll();
						tm +=course[0];
						pq.offer(course[0]);
					}
				}
			}
		}
		
		
		
		return pq.size();

	}

}
