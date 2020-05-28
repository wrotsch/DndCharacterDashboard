package csi203.f18;

import java.awt.*;
import javax.swing.*;

public class CurrentHitPointsPanel extends JPanel{
	
	//Create text area for Current Hit points
	JTextArea currentHitPoints = new JTextArea(2,28);
	
	public CurrentHitPointsPanel() {
		//add text area to panel
		this.add(currentHitPoints);
		
		//set tool tip text
		currentHitPoints.setToolTipText("Enter Current Hit Points here (ex. 12)");
	}
}
