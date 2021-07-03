package leetCodePrac;

public class Codetest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,0,4,5,6,7,8,9,1};
		int n=4;
		int size = arr.length;
			for(int i=0; i<size; i+=n) {
				for(int k=0;k< n;k++) 
					System.out.print("+--+");
				System.out.println();
				for(int j=0;j< n;j++) {
					System.out.print("| ");
					if((i+j)<size)
						System.out.print(arr[i+j]+" ");
					else {
						System.out.println();
						break;
					}
					if(j == n-1) {
						System.out.print("|");
						System.out.println("");
					}
				}
			
		}
			//int lrow= size%n;
			int newSiz = (size%n)==0 ?n: (size%n) ;
			for(int k=0;k< newSiz;k++) {
				System.out.print("+--+");
			}

	}

}
