package may4thweekLeetcode;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PartitioningIntoMinimumNumberOfDeciBinaryNumbers obj =  new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
		String s = "13124525";
		int ans = obj.minPartitions(s);
		System.out.println(ans);
		
	}

	public int minPartitions(String n) {
		int max = -1;
		for(char x : n.toCharArray()) {
			//System.out.println(String.valueOf(x));
			//System.out.println(x);
			int num = Character.getNumericValue(x);
			//System.out.println(num);
			if(num>max)
				max = num;
		}
		
        return max;
    }

}
