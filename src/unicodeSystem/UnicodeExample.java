package unicodeSystem;

public class UnicodeExample {
	char ch = 'A';
	
	private static String toUnicode(char ch) {
	    return String.format("\\u%04x", (int) ch);
	}
	
	public static void main(String[] args) {
		System.out.println(toUnicode('!'));		
	}
}
