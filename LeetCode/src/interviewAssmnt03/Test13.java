package interviewAssmnt03;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] n = {{1,1,0},{1,1,0},{0,0,1}};
		Test13 obj = new Test13();
		
		int ans = obj.findCircleNum(n);
		System.out.println(ans);
		
	}

	public int findCircleNum(int[][] isConnected) {
		int N = isConnected.length;
		boolean[] visited = new boolean[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			System.out.println("i is "+i);
			if (!visited[i]) {
				count++;
				dfs(isConnected, i, visited);
			}
		}
		return count;
	}

	private void dfs(int[][] M, int i, boolean[] visited) {
		for (int j = 0; j < M[i].length; j++) {
			if (!visited[j] && M[i][j] != 0) {
				visited[j] = true;
				System.out.println("i & j is "+i+ " "+j);
				dfs(M, j, visited);
			}
		}
	}

}
