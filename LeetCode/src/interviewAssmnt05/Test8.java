package interviewAssmnt05;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] wo = {"hi","hi","the", "hi","day", "is","hi","hi", "sunny", "the", "the", "the", "sunny", "is", "is"};
		int k=4;
		Test8 obj = new Test8();
		
		List<String> ans = obj.topKFrequent(wo, k);
	}

	public List<String> topKFrequent(String[] words, int k) {  
		
		System.out.println("in method");
        List<String> result = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++)
        {
            map.put(words[i], map.getOrDefault(words[i], 0)+1);
        }
        
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                 (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
        );
        
        
        
        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            pq.offer(entry);
           if(pq.size()>k)
                pq.poll();
        }

        while(!pq.isEmpty())
            result.add(0, pq.poll().getKey());
        
        return result;}

}
