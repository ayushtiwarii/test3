package stringConcepts;

import java.util.Iterator;

public class GetNumFromString {
	
	static String str = "TEK Systems GS - 2022 Batch";
	static String temp = "";
	
	static String getNum(String st) {
		
		for(Character ch : st.toCharArray()) {
			if (Character.isDigit(ch)) {
				temp+=ch;
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
	
		System.out.println(getNum(str));
		
	}

}
