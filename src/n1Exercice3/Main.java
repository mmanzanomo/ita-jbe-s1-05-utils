package n1Exercice3;

import java.io.File;

import n1Exercice1.Directories;


public class Main {
	public static void main(String[] args) {
		String path = "." + File.separator;
		String content;
		String output_path = "files" + File.separator + "sortida.txt";
		Directories directories = new Directories();
		
		if (args.length > 1) {
			// The first argument is taken as the path
			path = args[0];
			// Write file to a specific path
			output_path = args[1];
		} else if (args.length > 0) {
			// The first argument is taken as the path
			path = args[0];
		} 
		
		content = directories.listTreeDirectoriy(path);
		directories.printFile(content, output_path);
		System.out.println("L'arxiu s'ha guardat correctament");	
	}
	
}
