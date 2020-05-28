package csi203.f18;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ProficienciesPanel extends JPanel {

	//create text area for proficiencies
	JTextArea proficiencies = new JTextArea(6,28);
	
	TitledBorder proficienciesBorder = new TitledBorder("Other Proficiencies and Languages");
	
	public ProficienciesPanel() {
		//add text area to panel
		this.add(proficiencies);
		this.setBorder(proficienciesBorder);
		
		//set tool tip texts
		proficiencies.setToolTipText("Enter your character's languages, proficiences or any other facts");
	}
}
