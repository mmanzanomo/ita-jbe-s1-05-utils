package n1Exercice4;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import n1Exercice1.Directories;

public class Main {
	public static void main(String[] args) {
		Directories directories = new Directories();
		String path = "." + File.separator;
		
		/* n1Exercice4
		 * Reads .txt file and shows it by console
		 * */
		if (args.length > 0) {
			directories.readFile(args[0]);			
		} else if (Files.exists(Paths.get(path))) {
			directories.readFile("files" + File.separator + "sortida.txt");				
		}
	}
	
}
