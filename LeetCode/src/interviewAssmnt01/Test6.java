package interviewAssmnt01;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test6 obj = new Test6();
		int[] seats = {1,0,0,0} ;
		int ans = obj.maxDistToClosest(seats);
		System.out.println(ans);
	}

	public int maxDistToClosest(int[] seats) {
		
		int c=0,newc=0;
		int f1=0,l1=0;
		int newf1=0,newl1=0;
		for(int i=0;i<seats.length;i++) {
			
			if(seats[i]==0) {
				c++;
			}else {
				newl1 = seats.length - 1 - i;
				//System.out.println(newl1);
				if(c>newc) {
					newc=c;
				}
				c=0;
			}
			
			if(seats[i]==1 && f1==0) {
				f1=1;
				newf1 = i;
			}
				
			
		}
		//System.out.println("c is"+c);
		if(newc%2 == 0)
			newc /=2;
		else
			newc = newc/2 +1;
		
		if(newf1>newl1) {
			if(newc>newf1) 
				return newc;
			else
				return newf1;
			
		}else {
			if(newc>newl1) 
				return newc;
			else
				return newl1;
		}
			

		
	}
}
