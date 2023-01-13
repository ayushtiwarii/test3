package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayList {

	
	ArrayList<Integer> sortArrayList(ArrayList<Integer> numList) {
		Collections.sort(numList);
		return numList;
	}
	
	ArrayList<Integer> sortArrayListDesc(ArrayList<Integer> numList) {
		Collections.sort(numList, Collections.reverseOrder());;
		return numList;
	}
	
	
	public static void main(String[] args) {
		SortAnArrayList obj = new SortAnArrayList();
		
		ArrayList<Integer> numLst = new ArrayList<Integer>();
		numLst.add(9);
		numLst.add(0);
		numLst.add(1);
		numLst.add(2);
		numLst.add(6);
		numLst.add(8);
		System.out.println("Before Sorting");
		for(int var: numLst)
		{
			System.out.println(var);
		}
		
		System.out.println("After Sorting");
//		System.out.println(obj.sortArrayList(numLst));
		
		System.out.println(obj.sortArrayListDesc(numLst));
		
		numLst.clear();
		System.out.println(numLst);
		
	}

}
