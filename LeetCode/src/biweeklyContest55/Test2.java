package biweeklyContest55;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj = new Test2();
		String s="axxxxyyyyb", p = "xy";
		String ans = obj.removeOccurrences(s, p);
		System.out.println(ans);
	}

	public String removeOccurrences(String s, String part) {

		String news = s;
		while(news.contains(part)) {
			news = news.replace(part, "");
		}
		System.out.println(news);
		return news;
	}
}
