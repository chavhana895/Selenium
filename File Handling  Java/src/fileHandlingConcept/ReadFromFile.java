package fileHandlingConcept;

import java.io.File;   //Import file class
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args)
	{
	  try 
	  {
		 File obj = new File("E:\\FileHandling\\File.txt");
		 Scanner sc = new Scanner(obj);
		 while(sc.hasNextLine())
		 {
			 String s = sc.nextLine();
			 System.out.println(s);
		 }
		 sc.close();
	  } 
	  catch (FileNotFoundException e)
	  {
		System.out.println("An error occured.");
		e.printStackTrace();
	  }
	}

}
