package dirlister;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Dirlister {

	public static void main(String[] args) {
	
		Path path = Paths.get("/home/ishtiaq");
		
		try (DirectoryStream <Path> stream = Files.newDirectoryStream(path)) {
			for (Path file : stream) {
				
				System.out.println(file.getFileName());
			}
			
		} catch (Exception e) {
			System.out.println("Something is wrong!");
		}
			
	}

}
