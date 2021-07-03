package interviewAssmnt04;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Test5().numWaterBottles(9, 3));
	}

	public int numWaterBottles(int numBottles, int numExchange) {

		int tot = numBottles;
		int rem = 0;
		while (numBottles / numExchange != 0) {

			rem = numBottles % numExchange;
			tot += numBottles / numExchange;
			numBottles = numBottles / numExchange + rem;

			//System.out.println(numBottles);
		}
		//System.out.println(tot);
		return tot;
	}

}
