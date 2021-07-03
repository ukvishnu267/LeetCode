package leetCodePrac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class testClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//System.out.println(IntStream.range(0, 10).sum());
		try {
			System.out.println("helloooooooo");
		}
		finally{
			
		}
		int arr[] = { 1, 3, 5}; 
		int n= 3;
		  
        // Using Arrays.stream() to convert 
        // array into Stream 
        IntStream stream = Arrays.stream(arr); 
  
        // Displaying elements in Stream 
        System.out.println(((n * (n+1)) / 2) - (Arrays.stream(arr).sum()));
		
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        
        IntStream.range(1,5).forEach(x->System.out.println(x));
        
        String str="12qeq";
        
		


	}
	
	public String hello(String str) {
		
		return "hello";
	}
	public int hello() {
		return 1;
	}

}
 
  class testClass2{
	  
  }

