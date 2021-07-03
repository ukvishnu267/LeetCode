package april1stweekLeetcode;
	
import java.util.Stack;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Pair;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class RemoveAllAdjacentDuplicatesinStringII extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//launch(args);
		
		String s = "pbbcggttciiippooaais";
		int k = 2;
		
		
		Stack <Pair<Character,Integer>> st = new Stack <Pair<Character,Integer>>();
		
		for(int i=0 ; i< s.length();i++) {
			if(!st.empty() && st.peek().getKey() == s.charAt(i) ) {
				int upVal = st.peek().getValue() +1;
				st.pop();
				st.push(new Pair <Character,Integer> (s.charAt(i), upVal)) ;
				if(st.peek().getValue() == k) {
					st.pop();
				}
				
				
			}else {

				st.push(new Pair <Character,Integer> (s.charAt(i),1));
			}
		}
		//System.out.println(st);
		
		StringBuilder ans1 =new StringBuilder();
		
		while(!st.empty()) {
			for(int j=1; j<= st.peek().getValue();j++) {
				ans1.append(st.peek().getKey());
				
			}
			st.pop();
		}
		String ans = ans1.reverse().toString();
		
		System.out.println(ans1.reverse());
		//return ans;
		
	}
}
