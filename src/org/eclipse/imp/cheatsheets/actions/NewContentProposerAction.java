/*
 * Created on 28 Feb 2007
 * 
 */
package org.eclipse.imp.cheatsheets.actions;

import org.eclipse.imp.wizards.NewContentProposer;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;

public class NewContentProposerAction extends Action implements ICheatSheetAction {
    public NewContentProposerAction() {
	this("Create a new content proposer");
    }

    public NewContentProposerAction(String text) {
	super(text, null);
    }

    public void run(String[] params, ICheatSheetManager manager) {
	NewContentProposer newContentProposer = new NewContentProposer();
	Shell shell= PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	WizardDialog wizDialog= new WizardDialog(shell, newContentProposer);

	wizDialog.open();
    }
}
