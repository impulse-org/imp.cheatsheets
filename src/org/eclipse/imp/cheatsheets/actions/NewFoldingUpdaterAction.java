/*
 * Created on Mar 23, 2006
 */
package com.ibm.watson.safari.cheatsheets.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.uide.wizards.NewFoldingUpdater;

public class NewFoldingUpdaterAction extends Action implements ICheatSheetAction {
    public NewFoldingUpdaterAction() {
    	this("Enable source-text folding");
    }

    public NewFoldingUpdaterAction(String text) {
    	super(text, null);
    }

    public void run(String[] params, ICheatSheetManager manager) {
    	NewFoldingUpdater newFoldingUpdaterWizard = new NewFoldingUpdater();
    	Shell shell= PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    	WizardDialog wizDialog= new WizardDialog(shell, newFoldingUpdaterWizard);

    	wizDialog.open();
    }
}
