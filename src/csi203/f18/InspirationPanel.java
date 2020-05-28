package csi203.f18;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class InspirationPanel extends JPanel {
	
	//Create text field and button for inspiration and proficiency bonus
	JToggleButton inspirationButton = new JRadioButton();
	JTextField proficiencyBonusText = new JTextField(5);
	
	//Create labels for text fields
	JLabel inspirationLabel = new JLabel("Inspiration");
	JLabel proficiencyBonusLabel = new JLabel("Proficiency Bonus");
	
	public InspirationPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//add components to panel
		this.add(inspirationLabel);
		this.add(inspirationButton);
		this.add(proficiencyBonusLabel);
		this.add(proficiencyBonusText);
		
		//set tool tip texts
		inspirationButton.setToolTipText("Toggle to record inspiration (DM inspiration, not bardic)");
		proficiencyBonusText.setToolTipText("Enter Proficiency Bonus (ex. +3)");
	}
}
