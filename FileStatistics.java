package homework6;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class FileStatistics 
{
	public static void main(String[] args)
	{
		Path filePath = Paths.get("C:\\Users\\rafal.matuszczak\\Documents\\data.docx");
		
		try{
			
		BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
		
		System.out.println("The folder name is: " + filePath.getName(2));
		System.out.println("The name of the file is: " + filePath.getName(3));
		System.out.println("File size: " + attr.size() + " bytes");
		System.out.println("Time of last modification " + attr.lastModifiedTime());
			
		}
		catch(IOException e){
			System.out.println("IO Exception");
		}
	}
	
}
