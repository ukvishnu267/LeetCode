package weeklyContest237;

import java.util.ArrayList;
import java.util.List;

public class CheckIfTheSentenceIsPangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIfTheSentenceIsPangram obj = new CheckIfTheSentenceIsPangram();
		boolean ans = obj.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
		System.out.println(ans);

	}
	public boolean checkIfPangram(String sentence) {
		
		int[] myIntArray = new int[26];
		for(int i=0;i<sentence.length();i++) {
			//System.out.println(myIntArray[i]);
			//System.out.println((int)sentence.charAt(i));
			myIntArray[ (int)sentence.charAt(i) - 97 ] = 1;
		}

		for(int i=0;i<26;i++) {
			if(myIntArray[i] == 0) {
				return false;
			}		
		}
		return true;
        
    }

}
