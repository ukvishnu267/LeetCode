package june2ndweekLeetcode;

import java.util.TreeMap;

public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	TreeMap<Integer,Integer> cal;

	public MyCalendar() {
        
		cal = new TreeMap<>();
    }

	public boolean book(int start, int end) {
		Integer ceilv = cal.ceilingKey(start);
		Integer floorv = cal.floorKey(start);
		
		if((ceilv == null || end<= ceilv) && (floorv == null || start>= cal.get(floorv))) {
			cal.put(start, end);
			return true;
		}
		return false;

	}

}
