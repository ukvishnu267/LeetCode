package biweeklyContest52;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3 obj = new Test3();
		char[][] s = {{'#','#','*','.','*','.'},
	              {'#','#','#','*','.','.'},
	              {'#','#','#','.','#','.'}};

		char[][] ans = obj.rotateTheBox(s);

		for (char[] c : ans) {
			for (char d : c) {
				System.out.print(d + " ");
			}
			System.out.println();
		}
		// System.out.println(ans);

	}

	public char[][] rotateTheBox(char[][] box) {

		// int k = 0;
		
		for (int i = 0; i < box.length; i++) {
			boolean pr = false;
			for (int j = box[i].length - 1; j >= 0; j--) {
				//System.out.println(i + "," + j + " ->" + pr);
				if (box[i][j] == '#' && pr) {
					// System.out.println(pr + ' ' + box[i][j]);
					box[i][j] = '.';
					pr = true;
					for (int l = j; l < box[i].length - 1; l++) {
						if (box[i][l + 1] == '#' || box[i][l + 1] == '*') {
							box[i][l] = '#';
							break;

						} else if (l + 1 == box[i].length - 1) {
							box[i][l + 1] = '#';
							break;

						}
					}

				} else if (box[i][j] == '*') {
					pr = false;
					// System.out.println(pr);
				} else if (box[i][j] == '.') {
					pr = true;
					// System.out.println(pr);
				} else {
					pr = false;
				}

			}
		}

		char[][] newBox = new char[box[0].length][box.length];
		// System.out.println(box[0].length+' '+ box.length);
		for (int i = 0; i < box[0].length; i++) {
			for (int j = 0; j < box.length; j++) {

				// System.out.println(i+ ' - '+j);
				newBox[i][j] = box[box.length - 1 - j][i];
			}
		}

		return newBox;
	}

}
