package allTopics;

import java.io.File;

public class FileNotFound {
	
	public static void main(String[] args){
		File f = new File("Downloads\\HT22963.pdf");
		f.exists();
	}

}
