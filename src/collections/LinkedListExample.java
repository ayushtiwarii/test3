package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		List<String> employeeCategory = new LinkedList<>();
		
		employeeCategory.add(null);
		employeeCategory.add("Analyst");
		employeeCategory.add("Support");
		employeeCategory.add("BA");
		employeeCategory.add("Manager");
		employeeCategory.add("Lead");
		employeeCategory.add("Lead");
		employeeCategory.add(null);
		employeeCategory.add(null);
		employeeCategory.add("");
		employeeCategory.add(" ");
		
		
		System.out.println(employeeCategory);
		
		Iterator<String> itr = employeeCategory.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		for (String string : employeeCategory) {
			System.out.println(string);
		}
		
		employeeCategory.remove(0);
		System.out.println(employeeCategory);
		
		
		System.out.println(employeeCategory.get(3));
		
		for(int i=0;i<employeeCategory.size();i++) {
			System.out.println(employeeCategory.get(i));			
		}
		
		employeeCategory.set(3, "Replace");
		System.out.println(employeeCategory);
		
	}

}
