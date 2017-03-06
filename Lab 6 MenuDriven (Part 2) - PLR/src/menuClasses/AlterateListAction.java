package menuClasses;

import dataManager.DMComponent;

public class AlterateListAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		dm.getMenuStack().push(AlterateListsMenu.getAlterateListsMenu()); 
	}

}
