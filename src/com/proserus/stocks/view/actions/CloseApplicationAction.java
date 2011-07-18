package com.proserus.stocks.view.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.proserus.stocks.dao.PersistenceManager;

public class CloseApplicationAction extends AbstractAction  {

	@Override
    public void actionPerformed(ActionEvent arg0) {
		PersistenceManager.close();
		System.exit(0);
    }

}
