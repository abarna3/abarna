package FileRepo;

import java.io.File;
import java.util.Scanner;
import FileRepo1.RepoBoInterface;

public class RepoBoImpl implements RepoBoInterface{
	Scanner sca=new Scanner(System.in);
	@Override
	public void ListAllFiles() {
		System.out.println("Enter a path for a file to be listed");
		String source=sca.nextLine();
		try
		{
			File s=new File(source);
			File[] files=s.listFiles();
			System.out.println("The Files are");
			for(int i=0;i<files.length;i++)
			{
				System.out.println(files[i].getName());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	@Override
	public void AddFiles(String name) 
	{
		System.out.println("Enter a path for a file: ");
		String source=sca.nextLine();
		File files=new File(""+source+""+name);
		
		if(files.exists())
		{
			System.out.println("The file you are trying to add is already exists!!!");
			
		}
		else
		{
			boolean b;
			try
			{
				b = files.createNewFile();
				if(b)
				{
					System.out.println("File added successfully");
				}
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
		public void DeleteFiles(String name) 
		{
			System.out.println("Enter a path for a file: ");
			String source=sca.nextLine();
			File files=new File(""+source+""+name);
			
			if(files.delete())
			{
				System.out.println("File deleted successfully");
			}
			else
			{
				System.out.println("File not found");
					
			}
				
}
		
		@Override
		public void SearchFiles(String name) {
			System.out.println("Enter a path for a file:");
			String source=sca.nextLine();
			File files=new File(""+source+""+name);
			
			if(files.exists())
			{
				System.out.println("The file "+name+" was found at "+source);
				
			}
			else
			{
				System.out.println("The file "+name+" was found at "+source);

			}
			
		}
		

}
