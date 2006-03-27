/*
 * Created on Mar 23, 2006
 */
package com.ibm.watson.safari.cheatsheets.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;

public class NewParserAction extends Action implements ICheatSheetAction {
    public NewParserAction() {
	this("Create a new parser");
    }

    public NewParserAction(String text) {
	super(text, null);
    }

    public void run(String[] params, ICheatSheetManager manager) {
	// Commented out to remove circular dependency between org.eclipse.uide & org.jikespg.uide.
//	NewUIDEParserWizard newParserWizard= new NewUIDEParserWizard();
//	Shell shell= PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//	WizardDialog wizDialog= new WizardDialog(shell, newParserWizard);
//
//	wizDialog.open();
    }
}
