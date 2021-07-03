package interviewAssmnt05;

import java.util.ArrayList;
import java.util.List;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	List<Integer> ar ;
	public void MinStack() {
        ar = new ArrayList<>();
    }

	public void push(int val) {

		ar.add(0,val);
	}

	public void pop() {

		ar.remove(0);
	}

	public int top() {

		return ar.get(0);
	}

	public int getMin() {

		int min = Integer.MAX_VALUE;
		for(int i:ar) {
			if(i<min) min = i;
		}
		
		return min;
	}

}
