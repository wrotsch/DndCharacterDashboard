package csi203.f18;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class ArmorClassPanel extends JPanel{
	
	//Create Text area for armor class 
	JTextArea armorClassText = new JTextArea(1,10);
	TitledBorder armorClassBorder = new TitledBorder("Armor Class");
	
	public ArmorClassPanel() {
		//add components and set border
		this.setBorder(armorClassBorder);
		this.add(armorClassText);
		
		//Set tool tip text
		armorClassText.setToolTipText("Enter your armor class rating.");
	}
}
