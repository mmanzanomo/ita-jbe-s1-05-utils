package n2Exercice1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import n1Exercice1.Directories;

public class Main {

	public static void main(String[] args) {
		Properties properties = new Properties();
		Directories directoris = new Directories();
		String inputPath;
		String outputPath;
		String filename;
		String content;
		
		try {
			// Load config.properties file
			properties.load(new FileInputStream(new File("config" + File.separator + "config.properties")));
			inputPath = properties.getProperty("INPUT_PATH");
			outputPath = properties.getProperty("OUTPUT_PATH");
			filename = properties.getProperty("FILENAME");
			
			content = directoris.listTreeDirectoriy(inputPath);
			directoris.printFile(content, outputPath.concat(filename));			
		} catch(FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO Exception: " + e.getMessage());
		}
		
		
		

	}

}
