package june1stweekLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class OpentheLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OpentheLock obj = new OpentheLock();
		String[] ds = {"0201","0101","0102","1212","2002"};
		String t = "0202";
		int ans = obj.openLock(ds, t);
		
		System.out.println(ans);

	}

	public int openLock(String[] deadends, String target) {

		Set<String> ds = new HashSet<>(Arrays.asList(deadends));
		if(ds.contains("0000"))return -1;
		
		Queue<String> qu = new LinkedList<>();
		qu.add("0000");
		
		int st = 0;
		while(!qu.isEmpty()) {
			int s= qu.size();
			for(int i=0;i<s;i++) {
				String cu =  qu.poll();
				if(cu.equals(target)) return st;
				for(String n : nei(cu)) {
					if(ds.contains(n)) 	continue;
					ds.add(n);
					qu.offer(n); 
					
				}
			}
			++st;
		}
		
		return -1;
		
	}
	
	List<String> nei (String code){
		List<String> res=  new ArrayList<>();
		for(int i=0;i<4;i++) {
			int x = code.charAt(i)-'0';
			for(int dif = -1;dif<=1;dif+=2) {
				int y = (x + dif +10)%10;
				res.add(code.substring(0,i) +(""+y)+code.substring(i+1));
			}
		}
		
		
		
		
		return res;
	}

}
