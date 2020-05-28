package csi203.f18;

import java.awt.*;
import javax.swing.*;
public class HitPointMaximumPanel extends JPanel{

	//Create text area for hit point maximum
	JTextArea hitPointMaximumText = new JTextArea(1, 10);
	
	//Create label for hit point maximum
	JLabel hitPointMaximumLabel = new JLabel("Hit Point Maximum");
	
	public HitPointMaximumPanel(){
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		//add components to panel
		this.add(hitPointMaximumLabel);
		this.add(hitPointMaximumText);
		
		//set tool tip text
		hitPointMaximumText.setToolTipText("Enter Maximum Hit Points (ex. 24)");
	}
	
}
