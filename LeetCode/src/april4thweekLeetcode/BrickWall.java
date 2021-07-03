package april4thweekLeetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BrickWall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> wall = new ArrayList<List<Integer>>();
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter wallsize");
		int wallsize = sc.nextInt();
		System.out.println("enter totalsum");
		int totalsum=sc.nextInt();
		
		int i=0;
		while(i<wallsize) {
			int csum = 0;
			List<Integer> list1 = new ArrayList<Integer>();
			while(csum!=totalsum) {
				int inp = sc.nextInt();
				csum +=inp;
				list1.add(inp);
			}
			System.out.println(list1);
			wall.add(list1);
			
			i++;
		}
		  
		/*
		 * list1.add(1); list1.add(1); //list1.add(2); //list1.add(1); wall.add(list1);
		 * 
		 * List<Integer> list2 = new ArrayList<Integer>();
		 * 
		 * list2.add(2); //list2.add(1); //list2.add(2); wall.add(list2);
		 * 
		 * List<Integer> list3 = new ArrayList<Integer>();
		 * 
		 * list3.add(1); list3.add(1); //list3.add(2); wall.add(list3);
		 */
       
        

		
        BrickWall obj = new BrickWall();
        int ans = obj.leastBricks(wall);
        System.out.println(ans);

	}
	public int leastBricks(List<List<Integer>> wall) {
        
		Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		List<Integer> firstrow = wall.get(0);
		//int sum = firstrow.stream().mapToInt(i -> i).sum();
		int total = wall.size();
		//System.out.println(total);
		
		
		for(int i=0;i<wall.size();i++) {
			int keyIs = 0;
			
			for(int j =0;j< wall.get(i).size()-1; j++) {
				int val = 1;
				keyIs = keyIs + wall.get(i).get(j);
				if(hmap.containsKey(keyIs))
					val = hmap.get(keyIs) + 1;
				//System.out.println(keyIs+"-> "+val);
				hmap.put(keyIs, val);
			}
			
		}
		int ans = 0;
		for(Map.Entry m:hmap.entrySet()){  
			int val = (int) m.getValue();
				if(val > ans) {
					ans = val;
				}
			   //System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		return total - ans;
		
    }

}
