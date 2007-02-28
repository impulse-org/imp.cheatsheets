/*
 * Created on 28 Feb 2007
 * 
 */
package com.ibm.watson.safari.cheatsheets.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.uide.wizards.NewNatureEnabler;

public class NewNatureEnablerAction extends Action implements ICheatSheetAction {
    public NewNatureEnablerAction() {
	this("Create a new content proposer");
    }

    public NewNatureEnablerAction(String text) {
	super(text, null);
    }

    public void run(String[] params, ICheatSheetManager manager) {
    	NewNatureEnabler newNatureEnabler = new NewNatureEnabler();
	Shell shell= PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	WizardDialog wizDialog= new WizardDialog(shell, newNatureEnabler);

	wizDialog.open();
    }
}