package n1Exercice1;

import java.io.File;


public class Main {

	public static void main(String[] args) {
		Directories directories = new Directories();		
		// default path
		String path = "." + File.separator;
		
		
		if(args.length > 0) {
			path = args[0];
		}
		
		// n1Exercice1
		directories.listDirectory(path);

	}
	
	
}
