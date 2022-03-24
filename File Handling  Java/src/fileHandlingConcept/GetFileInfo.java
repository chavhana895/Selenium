package fileHandlingConcept;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) 
	{
		File f = new File("E:\\FileHandling\\Java.txt");
		if(f.exists())
		{
			System.out.println("File Name: "+f.getName());
			System.out.println("Absolute path: "+f.getAbsolutePath());
			System.out.println("Writable: "+f.canWrite());
			System.out.println("Readable: "+f.canRead());
			System.out.println("File size in bytes:  "+f.length());
		}
		else
		{
			System.out.println("The file does not exist.");
		}
	}

}
