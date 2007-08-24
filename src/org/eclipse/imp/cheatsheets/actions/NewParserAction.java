/*
 * (C) Copyright IBM Corporation 2007
 * 
 * This file is part of the Eclipse IMP.
 */
/*
 * Created on Mar 23, 2006
 */
package org.eclipse.imp.cheatsheets.actions;

import org.eclipse.imp.lpg.wizards.NewLPGGrammarWithParserWrapperWizard;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
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
	NewLPGGrammarWithParserWrapperWizard newParserWizard= new NewLPGGrammarWithParserWrapperWizard();
	Shell shell= PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	WizardDialog wizDialog= new WizardDialog(shell, newParserWizard);

	wizDialog.open();
    }
}
