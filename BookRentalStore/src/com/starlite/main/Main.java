package com.starlite.main;
import com.starlite.model.Book;
import java.util.Scanner;

import com.starlite.view.BookView;
public class Main {
	static Scanner scanner=new Scanner(System.in);
	
	static void displaySubMenu() {
		System.out.println("1. Add Book");
		System.out.println("2. Display All Books");
		System.out.println("Enter your choice");
		int subMenuChoice=scanner.nextInt();
		scanner.nextLine();
		switch(subMenuChoice) {
		case 1:
			if(BookView.addBook())
				System.out.println("Book Added Sucessfully");
			break;
		case 2:
			Book book[]=BookView.displayBooks();
			for(Book localBook:book) {
				if(localBook!=null)
				System.out.println(localBook);
				else
					break;
			}
			break;
			default: 
				System.out.println("Not a valid input");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		do {
			
			System.out.println("1. Start Application");
			System.out.println("2. Stop Application");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				displaySubMenu();
				break;
			case 2:
				System.exit(0);
				break;
				default:
					System.out.println("Not a valid input");
			}
		}while(true);
	}

}

