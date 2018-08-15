package designpattern.observateur.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExempleObservateurSwing {

	JFrame cadre;
	
	public static void main (String[] args){
		ExempleObservateurSwing exempleObservateurSwing = new ExempleObservateurSwing();
		exempleObservateurSwing.go();
	}

	private void go() {
		cadre = new JFrame();
		JButton bouton = new JButton("Dois-je le faire");
		bouton.addActionListener(new AuditeurAnge());
		bouton.addActionListener(new AuditeurDemon());
		cadre.getContentPane().add(BorderLayout.CENTER, bouton);
		cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadre.setSize(300,300);
		cadre.setVisible(true);
	}
}
