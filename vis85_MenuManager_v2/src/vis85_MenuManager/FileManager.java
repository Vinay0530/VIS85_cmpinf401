package vis85_MenuManager;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


public class FileManager
{
	public static ArrayList<Entree> readEntrees(String fileName)
	{
		ArrayList<Entree> entries = new ArrayList<Entree>();
		FileReader fr;
		try {
			fr = new FileReader(fileName);
		
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			
			while ((line = br.readLine()) != null) {
		     System.out.println(line);
		     String[] arrEntree = line.split("@@");
		     Entree entree = new Entree(arrEntree[0],arrEntree[1] , Integer.parseInt(arrEntree[2]));
		     entries.add(entree);
		     
			}   
	
			 br.close();
		     fr.close();
		} 
        catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Entree file is not found. Please create data before you run program.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entries;
	}
	

}
