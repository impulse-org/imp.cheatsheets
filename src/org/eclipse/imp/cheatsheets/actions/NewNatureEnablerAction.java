/*******************************************************************************
* Copyright (c) 2007 IBM Corporation.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*    Robert Fuhrer (rfuhrer@watson.ibm.com) - initial API and implementation

*******************************************************************************/

/*
 * Created on 28 Feb 2007
 * 
 */
package org.eclipse.imp.cheatsheets.actions;

import org.eclipse.imp.wizards.NewNatureEnabler;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;

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
