package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		
		/**
		 * Date Structure: Hashtable
		 * can insert null value
		 * 
		 */
		Set<Integer> intData = new HashSet<Integer>();
		intData.add(null);
		intData.add(11);
		intData.add(10);
		intData.add(13);
		intData.add(10);
		intData.add(14);
		intData.add(17);
		intData.add(16);
		intData.add(19);
		intData.add(1);
		
		System.out.println(intData);
		
		intData.remove(11);
		
		/**
		 * Date Structure: Hashtable and Linkedlist
		 * can insert null value
		 * 
		 */
		
		Set<Integer> intData2 = new LinkedHashSet<Integer>();
		
		intData2.add(null);
		intData2.add(10);
		intData2.add(null);
		intData2.add(10);
		intData2.add(14);
		intData2.add(17);
		intData2.add(16);
		intData2.add(19);
		intData2.add(1);
		System.out.println(intData2);
		
		Iterator<Integer> it = intData2.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
			
		}
		
		
		/**
		 * Date Structure: Binary Tree
		 * null value not allowed
		 * 
		 */
		
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(11);
		treeSet.add(10);
		treeSet.add(13);
		treeSet.add(10);
		treeSet.add(14);
		treeSet.add(17);
		treeSet.add(16);
		treeSet.add(19);
		treeSet.add(1);
		System.out.println(treeSet);
		
		
	}

}
