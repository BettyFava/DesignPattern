package designpattern.observateur.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuditeurDemon implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Eclate-toi pour une fois");
	}

}
