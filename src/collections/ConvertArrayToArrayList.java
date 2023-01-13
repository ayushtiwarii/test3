package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {
	
	
	List<Object> convertArrToArrayList(Object employeeCategory){
		return Arrays.asList(employeeCategory);
	}
	
	List<ArrayList<String>> convertArrToArrayList2(ArrayList<String> employeeCategory){
		return Arrays.asList(employeeCategory);
	}
	
	public static void main(String[] args) {
	
		ConvertArrayToArrayList obj = new ConvertArrayToArrayList();
		ArrayList<String> employeeCategory = new ArrayList<>();
		employeeCategory.add("Analyst");
		employeeCategory.add("Support");
		employeeCategory.add("BA");
		employeeCategory.add("Manager");
		employeeCategory.add("Lead");
		employeeCategory.add("Lead");		
		
		List<Object> list = obj.convertArrToArrayList(employeeCategory);
		
		for(Object obj1:list) {
			System.out.println(obj1.toString());	
		}
		
		ArrayList<Integer> employeeCode = new ArrayList<>();
		int i = 0001;
		employeeCode.add(i);
		employeeCode.add(0002);
		employeeCode.add(0003);
		employeeCode.add(0004);
		employeeCode.add(0005);
		
		List<Object> list2 = obj.convertArrToArrayList(employeeCode);
		for(Object obj1:list2) {
			System.out.println(obj1.toString());	
		}
		
	}
}
