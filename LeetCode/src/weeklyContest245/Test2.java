package weeklyContest245;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st="23:59" ,en="00:10";
		Test2 obj = new Test2();
		int ans = obj.numberOfRounds(st, en);
		System.out.println(ans);
	}

	public int numberOfRounds(String startTime, String finishTime) {

		if(startTime.equals(finishTime)) return 0;
		int stH = Integer.parseInt(startTime.split(":")[0] );
		int stM = Integer.parseInt(startTime.split(":")[1]);
		
		int fiH = Integer.parseInt(finishTime.split(":")[0]);
		int fiM = Integer.parseInt(finishTime.split(":")[1]);
	
		if(stM % 15 != 0) {
			int x = stM % 15;
			stM += (15-x);
			if(stM==60) {
				stM = 0;
				stH +=1;
			}
				
		}
		
		if(fiM % 15 != 0) {
			int x = fiM % 15;
			fiM -= (x);
			if(fiM==60) {
				fiM = 0;
				fiH -=1;
			}
				
		}
		//System.out.println(stH+" : "+stM+" - "+fiH+" : "+fiM);
		int tot=0;
		if(stH > fiH) {
			if(stM > fiM) {
				tot = (60- stM + fiM)/15;
				tot += (24 + fiH - stH - 1 ) * 4;
				
			}else {
				tot = (fiM - stM)/15;
				tot += (24 + fiH - stH) * 4;
			}
			
		} else if(stH == fiH && stM > fiM) { 
			if(stM > fiM) {
				tot = (60- stM + fiM)/15;
				tot += (24 + fiH - stH - 1 ) * 4;
				
			}else {
				tot = (fiM - stM)/15;
				tot += (24 + fiH - stH) * 4;
			}
		} else {
			if(stM > fiM) {
				tot = (60- stM + fiM)/15;
				tot += (fiH - stH -1 ) * 4;
				
			}else {
				tot = (fiM - stM)/15;
				tot += (fiH - stH) * 4;
			}
		}
		
		return tot;
	}

}
