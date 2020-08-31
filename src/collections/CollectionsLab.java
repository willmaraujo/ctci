package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsLab {
	
	public static void main(String[] args) {
		listLab();
	}
	
	public static void listLab() {
		
//		// ArrayList
//		List<String> mList = new ArrayList<String>();
//		
//		mList.add("a");
//		mList.add("b");
//		mList.add("c");
//		
//		Iterator<String> mIterator = mList.iterator();
//		
//		while(mIterator.hasNext()) {
//			System.out.println(mIterator.next());
//		}
//		
//		// HashSet
//		Set<Integer> mSet = new HashSet<Integer>();
//		
//		mSet.add(1);
//		mSet.add(2);
//		mSet.add(3);
//		
//		for (Integer element : mSet) {
//			System.out.println(element);
//		}
//		
//		// Linked HashSet
//		Set<Integer> mLinkedHashSet = new LinkedHashSet<Integer>();
//		mLinkedHashSet.add(1);
//		mLinkedHashSet.add(2);
//		mLinkedHashSet.add(3);
//		
//		System.out.println("Tree Set ========================");
//		
//		
//		// TreeSet
//		SortedSet<String> mSortedSet = new TreeSet<String>();
//		
//		mSortedSet.add("a");
//		mSortedSet.add("b");
//		mSortedSet.add("c");
//		mSortedSet.add("c");
//		
//		for (String string : mSortedSet) {
//			System.out.println(string);
//		}
//		
//		System.out.println("========================");
//		
//		// Vector
//		List<String> mVector = new Vector<String>();
//		
//		mVector.add("a");
//		mVector.add("b");
//		mVector.add("c");
//		
//		// Queue
//		Queue<Integer> mPriorityQueue = new PriorityQueue<Integer>();
//		
//		mPriorityQueue.add(1);
//		mPriorityQueue.add(2);
//		mPriorityQueue.add(3);
//		mPriorityQueue.add(4);
//		
//		// Print the top element of priority queue
//		System.out.println(mPriorityQueue.peek());
//		
//		// Print the top element and removing it from the priority queue
//		System.out.println(mPriorityQueue.poll());
//		
//		// Print the priority element again
//		System.out.println(mPriorityQueue.peek());
//		
//		// HashMap
//		Map<Integer, String> mHashMap = new HashMap<Integer, String>();
//		
//		mHashMap.put(1, "a");
//		mHashMap.put(2, "b");
//		mHashMap.put(3, "c");
//		
//		System.out.println(mHashMap.get(2));
//		
//		mHashMap.remove(3);
//		
//		System.out.println(mHashMap.size());
//		
//		for(Integer i: mHashMap.keySet()) {
//			System.out.println(mHashMap.get(i));
//		}
		
		System.out.println(isPalindrome("123456543213"));
		
	}
	
	private static boolean isPalindrome(String a) {
		
		// aacbbcaa  aaccbebccaa
		
		Stack<Character> mStack = new Stack<Character>();
//		int iMiddle;
//		
//		if (a.length() % 2 == 0) {
//			iMiddle = (a.length() / 2) - 1;
//		} else {
//			iMiddle = (a.length() - 1)/2
//		}
//		int iMiddle
		
		
		for (int i = 0; i < a.length(); i++) {
			if (i <= (a.length()/2) - 1) {
				mStack.push(a.charAt(i));
				System.out.println("Push: "+a.charAt(i));
			} else 
			if (!((a.length() % 2 != 0 ) && i == (a.length()/2))){
				Character mChar = mStack.pop();
				System.out.println("Pop: "+mChar);
				if (!mChar.equals(a.charAt(i))) return false;
			}
			
		}
		
		return true;
		
	}


}
