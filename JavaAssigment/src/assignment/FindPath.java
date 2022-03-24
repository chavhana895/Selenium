package assignment;

import java.io.File;               //Used method of file class
import java.util.Scanner;          //Input from user

public class FindPath
{
    private void findFile()
    {
        // address of files or folder where to search
        File file = new File("E:\\FileHandling");
        String str ;
        Scanner in = new Scanner(System.in);
        // do while is used to run the program again and again
        do{
            int ab =0;
            System.out.println("ENTER THE NAME OF FILE ");
            str =in.nextLine();

            String[] files = file.list();

            for (String string : files){

                Boolean str1 = str.equals(string);
                // str1 is true than print the following
                if (str1){
                    ab = 1;
                    System.out.println("File Found :  "+string);
                   // System.out.println(string);
                    //print the address of the file
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }

            if(ab == 0)
            {
                System.out.println("File not find : Reenter the name of the file.");
            }
        } while(true);
    }

    public static void main(String[] args)
    {
        FindPath path = new FindPath();
        path.findFile();
    }
}