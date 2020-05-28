package csi203.f18;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class InitiativePanel extends JPanel{

	//create text area for initiative text
	JTextArea initiativeText = new JTextArea(1,10);
	
	TitledBorder initiativeBorder = new TitledBorder("Initiative");
	
	public InitiativePanel() {
		this.setBorder(initiativeBorder);
		//add text area to panel
		this.add(initiativeText);
		
		//set tool tip text
		initiativeText.setToolTipText("Enter your initiative Bonus here. It is usually equal to your Dexterity Modifier.");
	}
}
