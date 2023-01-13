package stringConcepts;

import java.lang.String;

public class String1 {
	
	public static void main(String[] args) {
		String str= "test"; // creating a string object using string literal or constant
		
		String str2 = new String("TGS"); // creating a string object using new keyword
		
		System.out.println(str);
		System.out.println(str2);
		
		
		char[] ch = {'a','j','i','t'};
		String str3 = new String(ch);
		System.out.println(str3);
		
		
		
		
	}

}
