package interviewAssmnt03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> tickets = new ArrayList<>();
		tickets.add(Arrays.asList("JFK","SFO"));
		tickets.add(Arrays.asList("JFK","ATL"));
		tickets.add(Arrays.asList("SFO","ATL"));
		tickets.add(Arrays.asList("ATL","JFK"));
		tickets.add(Arrays.asList("ATL","SFO"));
		Test5 obj = new Test5();
		
		List<String> ans = obj.findItinerary(tickets);
		
	}

	public List<String> findItinerary(List<List<String>> tickets) {

		Map<String, PriorityQueue<String>> targets = new HashMap<>();
		for (List<String> ticket : tickets)
			targets.computeIfAbsent(ticket.get(0), k -> new PriorityQueue()).add(ticket.get(1));
		
		
		for (Map.Entry<String, PriorityQueue<String>> entry : targets.entrySet()) {
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		List<String> route = new LinkedList();
		Stack<String> stack = new Stack<>();
		stack.push("JFK");
		while (!stack.empty()) {
			while (targets.containsKey(stack.peek()) && !targets.get(stack.peek()).isEmpty()) {
				System.out.println(targets.get(stack.peek()).peek());
				stack.push(targets.get(stack.peek()).poll());
				
			}
				
			route.add(0, stack.pop());
		}
		return route;
	}

}
