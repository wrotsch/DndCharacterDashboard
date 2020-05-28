package csi203.f18;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;
public class DeathSavesPanel extends JPanel{

	//Create Label for death save failures and successes
	JLabel successes = new JLabel("Successes");
	JLabel failures = new JLabel("Failures");
	
	//Create buttons for each success or failure
	JRadioButton jrbsuccess1 = new JRadioButton();
	JRadioButton jrbsuccess2 = new JRadioButton();
	JRadioButton jrbsuccess3 = new JRadioButton();
	JRadioButton jrbfailure1 = new JRadioButton();
	JRadioButton jrbfailure2 = new JRadioButton();
	JRadioButton jrbfailure3 = new JRadioButton();
	
	TitledBorder deathSavesBorder = new TitledBorder("Death Saves");
	
	public DeathSavesPanel() {
		this.setLayout(new GridLayout(2,4));
		//add components to panel
		this.add(successes);
		this.add(jrbsuccess1);
		this.add(jrbsuccess2);
		this.add(jrbsuccess3);
		this.add(failures);
		this.add(jrbfailure1);
		this.add(jrbfailure2);
		this.add(jrbfailure3);
		this.setBorder(deathSavesBorder);
		
		//set tool tip texts
		jrbsuccess1.setToolTipText("Toggle this button on your first successful death saving throw");
		jrbsuccess2.setToolTipText("Toggle this button on your second successful death saving throw");
		jrbsuccess3.setToolTipText("Toggle this button on your thrid successful death saving throw");
		jrbfailure1.setToolTipText("Toggle this button on your first unsuccessful death saving throw");
		jrbfailure2.setToolTipText("Toggle this button on your second unsuccessful death saving throw");
		jrbfailure3.setToolTipText("Toggle this button on your third unsuccessful death saving throw");
		
		//action listener  
		jrbfailure3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jrbfailure1.isSelected()==true && jrbfailure2.isSelected()==true && jrbfailure3.isSelected()==true) {
					JOptionPane.showMessageDialog(null, "You have died.");//Display death message
				}
			}
		});
	}
}
