package grouph;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile 
{
	Scanner scanner;
	ArrayList<String[]> output;
	
	public ReadFile(File file) throws FileNotFoundException
	{
		scanner = new Scanner(file);
		scanner.useDelimiter(",");
		output = new ArrayList<String[]>(0);
	}
	
	//Reads student info from a file
	//name,id,up to 5 courses
	public ArrayList<String[]> read()
	{
		String[] s =new String[7];
		while(scanner.hasNext())
		{
			
		}
	}
         
        //Get all tokens and store them in some data structure
        //I am just printing them
        while (scanner.hasNext())
        {
            System.out.print(scanner.next() + "|");
        }
         
        //Do not forget to close the scanner 
        scanner.close();
    }
}
