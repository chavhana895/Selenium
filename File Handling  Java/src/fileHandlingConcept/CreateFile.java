package fileHandlingConcept;

import java.io.File;        //Import file class
import java.io.IOException;   //Import IOException class to handle errors

public class CreateFile {

	public static void main(String[] args)
	{
	  try {
		     File f= new File("E:\\FileHandling\\File.txt");
		     if(f.createNewFile())
		     {
		    	 System.out.println("File created: "+f.getName());
		     }
		     else
		     {
		    	 System.out.println("File already exists.");
		     }
	      }
	  catch (IOException e) 
	  {
		System.out.println("An error occured.");
		e.printStackTrace();
	  }
	}

}
