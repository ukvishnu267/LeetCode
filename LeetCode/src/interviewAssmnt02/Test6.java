package interviewAssmnt02;

import java.util.Arrays;
import java.util.HashSet;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test6 obj = new Test6();
		int[] c = {0,1,0,1,1,0,0,1};
		int n = 1000;
		int[] ans = obj.prisonAfternDays(c, n);
		for(int i:ans)
			System.out.print(i+" ");

	}

	public int[] prisonAfternDays(int[] cells, int n) {

		if(cells==null || cells.length==0 || n<=0) return cells;
        boolean hasCycle = false;
        int cycle = 0;
        HashSet<String> set = new HashSet<>(); 
        for(int i=0;i<n;i++){
            int[] next = nextDay(cells);
            String key = Arrays.toString(next);
            System.out.println(key);
            if(!set.contains(key)){ //store cell state
                set.add(key);
                cycle++;
            }
            else{ //hit a cycle
                hasCycle = true;
                break;
            }
            cells = next;
        }
        if(hasCycle){
            n%=cycle;
            for(int i=0;i<n;i++){
                cells = nextDay(cells);
            }   
        }
        return cells;
    }
    
    private int[] nextDay(int[] cells){
        int[] tmp = new int[cells.length];
        for(int i=1;i<cells.length-1;i++){
            tmp[i]=cells[i-1]==cells[i+1]?1:0;
        }
   
        return tmp;
    }
	

}
