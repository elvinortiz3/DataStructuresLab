package menuClasses;

import java.util.ArrayList;

public class AlterateListsMenu extends Menu {
	private static AlterateListsMenu ALM = new AlterateListsMenu(); 
	private AlterateListsMenu() { 
		super(); 
		String title; 
		ArrayList<Option> options = new ArrayList<Option>();  
		title = "Alterate Lists Menu"; 
		options.add(new Option("Add a New Value to a List", new AddToListAction())); 
		options.add(new Option("Delete a Position From a List", new DeleteFromListAction())); 
		options.add(new Option("Show Content of a List", new ShowListAction())); 
		options.add(Option.EXIT); 

		super.InitializeMenu(title, options); 

	}
	
	public static AlterateListsMenu getAlterateListsMenu() { 
		return ALM; 
	}
	
}
