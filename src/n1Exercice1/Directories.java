package n1Exercice1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;


public class Directories {
	File file;
	
	/* n1Exercice1
	 * Shows content of a file passed by argument
	 */
	public void listDirectory(String path) {
		file = new File(path);
		File[] listFiles = file.listFiles();
		
		if ( listFiles.length > 0 ) {
			for (File f: listFiles) {
				System.out.println(f.getName());
			}
		} else {
			System.out.println("Directori buit");
		}	
	}
	
	/* n1Exercice2
	 * Shows files and subfiles of the path passed by argument
	 */
	public String listTreeDirectoriy(String path) {
		file = new File(path);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		File[] listFiles = file.listFiles();
		StringBuilder sb = new StringBuilder();
		String walkFile;
		
		if ( listFiles.length > 0 ) {
			for (File f: listFiles) {
				if (f.isDirectory()) {
					sb.append(f.getName()).append(" (D) ").append(dateFormat.format(f.lastModified()));
					sb.append("\n");
					walkFile = listTreeDirectoriy(f.getPath());
					sb.append(walkFile);
				} else {
					sb.append(f.getName()).append(" (F) ").append(dateFormat.format(f.lastModified()));
					sb.append("\n");
				}
			}
		}
		return sb.toString();
	}
	
	
	/* n1Exercice3
	 * This method writes the content to a file 
	 */
	 public void printFile(String content, String output_path) {
		 File file = new File("files");
		 if (!file.exists()) {
			 file.mkdir();
		 }
		 
		 try (FileWriter escritura = new FileWriter(output_path, false)) {
			 for (char c: content.toCharArray()) {
				 escritura.write(c);
			 }
		 } catch (IOException e) {
			 e.printStackTrace();
		 } 
	 }
	 
	 
	 /* n1Exercice4
	  * Read and shows a file by console
	  */
	 public void readFile(String path) {
		 String line;
		 try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			 while((line = br.readLine()) != null) {
				 System.out.println(line);
			 }
		 } catch (FileNotFoundException e) {
			System.out.println("Exception: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	 }
	 
	 /* n1Exercice5
	  * This method serialize an object and put it on output file
	  */
	 public void serializeObject(Object object, String output_file) {
		 try (FileOutputStream fileoutputStream = new FileOutputStream(output_file + ".ser");
			  ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileoutputStream);) {
			objectOutputStream.writeObject(object);
			objectOutputStream.close();			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
	 
	 /* n1Exercice5
	  * This method deserialize an object passed by argument
	  */
	 public Object deserializeObject(String input_file) {
		 try {
			FileInputStream fileInputStream = new FileInputStream(input_file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Object object = objectInputStream.readObject();	
			objectInputStream.close();
			return object;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
		}
		 
		 return null;
	 }
	 
	 
	
}
