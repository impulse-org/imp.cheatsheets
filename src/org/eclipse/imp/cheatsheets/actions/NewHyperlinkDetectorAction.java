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
import org.eclipse.uide.wizards.NewHyperlinkDetector;

public class NewHyperlinkDetectorAction extends Action implements ICheatSheetAction {
    public NewHyperlinkDetectorAction() {
    	this("Enable hyperlinking");
    }

    public NewHyperlinkDetectorAction(String text) {
    	super(text, null);
    }

    public void run(String[] params, ICheatSheetManager manager) {
    	NewHyperlinkDetector newHyperlinkDetectorWizard = new NewHyperlinkDetector();
    	Shell shell= PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    	WizardDialog wizDialog= new WizardDialog(shell, newHyperlinkDetectorWizard);

    	wizDialog.open();
    }
}
