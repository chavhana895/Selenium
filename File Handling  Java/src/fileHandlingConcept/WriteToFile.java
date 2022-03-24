package fileHandlingConcept;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args)
	{
        try
        {
         FileWriter myFileWriter = new FileWriter("E:\\FileHandling\\File.txt")	;
         myFileWriter.write("Java is the prominent programing language");
         myFileWriter.close();
         System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e)
        {
        	System.out.println("An error occured.");
        	e.printStackTrace();
        }
	}

}
