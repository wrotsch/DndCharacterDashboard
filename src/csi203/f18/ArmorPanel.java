package csi203.f18;

import java.awt.*;
import javax.swing.*;

public class ArmorPanel extends JPanel{

	//Create text fields for armor and armor class
	JTextField armor = new JTextField(10);
	JTextField ac = new JTextField(3);
	
	//Create labels for armor and armor class text fields
	JLabel armorLabel = new JLabel("Armor");
	JLabel acLabel = new JLabel("AC");
	
	//Create Radio Button for shield possession
	JRadioButton shield = new JRadioButton("Shield");
	
	public ArmorPanel() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		//add components to panel
		this.add(armorLabel);
		this.add(armor);
		this.add(shield);
		this.add(acLabel);
		this.add(ac);
		
		//set tool tip texts for components
		armor.setToolTipText("Enter your character's armor here");
		shield.setToolTipText("Does your character have a shield?");
		ac.setToolTipText("Set the Armor class given by this set of armor.");
		
	}
	
}
