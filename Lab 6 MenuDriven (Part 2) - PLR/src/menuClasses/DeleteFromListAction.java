package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteFromListAction implements Action {

	@Override
	public void execute(Object arg) {
		IOComponent io = IOComponent.getComponent(); 
		DMComponent dm = (DMComponent) arg; 
		String name = io.getInput("Enter the name of the list (DELETING ELEMENT): ");
		int value = Integer.parseInt(io.getInput("Enter the value to remove: ")); 
		dm.removeElementFromList(name, value);
	}

}
