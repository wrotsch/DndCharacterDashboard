package csi203.f18;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class SpeedPanel extends JPanel{

	//create text area for speed
	JTextArea speedText = new JTextArea(1,10);
	
	TitledBorder speedBorder = new TitledBorder("Speed");
	
	public SpeedPanel() {
		this.setBorder(speedBorder);
		//add to panel
		this.add(speedText);
		
		//set tool tip text
		speedText.setToolTipText("Enter your base moving speed here.");
	}
}
