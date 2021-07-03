package interviewAssmnt03;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Employee {
	public int id;
	public int importance;
	public List<Integer> subordinates;
};

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getImportance(List<Employee> employees, int id) {

		int l = employees.size();
		Queue<Integer> q = new LinkedList<>();
		int sum = 0 ;
		q.add(id);
		while(!q.isEmpty()) {
			id = q.poll();
			for(int i=0;i<l;i++) {
				
				if(employees.get(i).id == id) {
					sum+= employees.get(i).importance;
					int len = employees.get(i).subordinates.size();
					List<Integer> sub = employees.get(i).subordinates;
					for(int j=0;j<len;j++) {
						q.add(sub.get(j));
					}
				}
			}
			
		}
		
		return sum;
		
	}

}
