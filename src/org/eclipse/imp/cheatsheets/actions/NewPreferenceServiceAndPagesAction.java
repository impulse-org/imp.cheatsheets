/*
 * Created on 28 Feb 2007
 */
package com.ibm.watson.safari.cheatsheets.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.uide.wizards.NewPreferencesDialog;

public class NewPreferenceServiceAndPagesAction extends Action implements ICheatSheetAction {
    public NewPreferenceServiceAndPagesAction() {
	this("Create a new syntax highlighter");
    }

    public NewPreferenceServiceAndPagesAction(String text) {
	super(text, null);
    }

    public void run(String[] params, ICheatSheetManager manager) {
    NewPreferencesDialog newPreferencesDialog= new NewPreferencesDialog();
	Shell shell= PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	WizardDialog wizDialog= new WizardDialog(shell, newPreferencesDialog);

	wizDialog.open();
    }
}
