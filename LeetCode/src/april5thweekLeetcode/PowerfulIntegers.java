package april5thweekLeetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PowerfulIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PowerfulIntegers obj = new PowerfulIntegers();
		int x = 2, y = 3, bound = 10;
		List<Integer> ans = obj.powerfulIntegers(x, y, bound);
		System.out.println(ans);

	}

	public List<Integer> powerfulIntegers(int x, int y, int bound) {
		int powx = 1;
		int powy = 1;
		List<Integer> xka = new ArrayList();
		List<Integer> yka = new ArrayList();

		xka.add(1);
		yka.add(1);

		while (x !=1 && powx <= bound) {

			xka.add(powx * x);
			powx = powx * x;
		}
		while (y != 1 && powy <= bound) {

			yka.add(powy * y);
			powy = powy * y;
		}
		//System.out.println(xka);
		//System.out.println(yka);
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i:xka) {
			for(int j:yka) {
				if(i+j<=bound)
					set.add(i+j);
				
			}
		}
		
		return set.stream().collect(Collectors.toList());

	}

}
