package june4thweekLeetcode;

import java.util.Arrays;

public class RedundantConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//RedundantConnection obj = new RedundantConnection();
		int[][] ed = {{1,2},{2,3},{3,4},{1,4},{1,5}};
		new RedundantConnection().findRedundantConnection(ed);
				
	}

	public int[] findRedundantConnection(int[][] edges) {

		int[] parent = new int[2001];
		
		for(int i=0;i<parent.length;i++) 
			parent[i]=i;
		
		//Arrays.stream(parent).forEach(System.out::println);
		for(int[] ed: edges) {
			int f=ed[0], t=ed[1];
			System.out.println(f+" "+t);
			if(find(parent,f) == find(parent,t)) return ed;
			else {
				System.out.println("**"+find(parent,f));
				System.out.println("**"+find(parent,t));
				parent[find(parent,f)] = find(parent,t);
			}
		}
			
		return new int[2];
	}

	private int find(int[] parent, int f) {
		// TODO Auto-generated method stub
		if(f!=parent[f]) {
			System.out.println(f+"  === "+parent[f]);
			parent[f] = find(parent,parent[f]);
		}
		return parent[f];
	}

}
