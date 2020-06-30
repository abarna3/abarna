package LockersPvt;

import java.util.Scanner;

import FileRepo.RepoBoImpl;
import FileRepo1.RepoBoInterface;


public class Locked_Me {

	public static void main(String[] args) {
		
		System.out.println("LockedMe.com Welcomes You");
		Scanner sca=new Scanner(System.in);
		RepoBoInterface repbo=new RepoBoImpl();
		
		int choice=0;
		do
		{
			System.out.println("Please choose the option that you want to perform");
			System.out.println("-------------------------------------------------");
			System.out.println("1)To list the filenames");
			System.out.println("2)To add a File in the Repository ");
			System.out.println("3)To delete a  File from the Repository");
			System.out.println("4)To search a File in the Repository");
			System.out.println("5)Exit");
			System.out.println("Enter your Choice");
			
			choice= Integer.parseInt(sca.nextLine());
			
			switch(choice)
			{
			case 1:
			{
				repbo.ListAllFiles();
				break;
			}
			case 2:
			{
				System.out.println("Enter the file name to be added");
				String addname=sca.next();
				repbo.AddFiles(addname);
				break;
			}
			case 3:
			{
				System.out.println("Enter the file name to be deleted");
				String addname=sca.next();
				repbo.DeleteFiles(addname);
				break;
			}
			case 4:
			{
				System.out.println("Enter the file name to be searched");
				String addname=sca.next();
				repbo.SearchFiles(addname);
				break;
			}
			}
		}while(choice!=5);
	}
		
}


