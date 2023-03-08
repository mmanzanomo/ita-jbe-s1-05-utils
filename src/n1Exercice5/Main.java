package n1Exercice5;

import java.io.File;

import n1Exercice1.Directories;

public class Main {

	public static void main(String[] args) {
		Directories directories = new Directories();
		Person person;
		Object object;
		
		person = new Person("Lucia", "Malta", "74654432U");
		
		//n1Exercice5
		// Serializes the object and saves it to the output path
		directories.serializeObject(person, "files" + File.separator + "object");
		
		System.out.println("Arxiu serialitzat:");
		directories.readFile("files" + File.separator + "object.ser");	
		
		// Deserializes the object and displays it
		object = directories.deserializeObject("files" + File.separator + "object.ser");
		System.out.println("Arxiu deserialitzat:\n" + object);
	}
}
