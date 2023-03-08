package n1Exercice2;

import java.io.File;
import n1Exercice1.Directories;

public class Main {

	public static void main(String[] args) {
		String path = "." + File.separator;
		String output = "";
		Directories directories = new Directories();
		

		if(args.length > 1) {
			path = args[0];
			if (args[1].equalsIgnoreCase("-all")) {
				//n1Exercici2
				output = directories.listTreeDirectoriy(path);				
			} else {
				// n1Exercici1
				directories.listDirectory(path);
			}
		} else if (args.length == 1) {
			path = args[0];
			// n1Exercici1
			directories.listDirectory(path);
		} else {
			// n1Exercici1
			directories.listDirectory(path);
		}
		
		System.out.println(output);
		

	}

}
