package csi203.f18;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class TemporaryHitPointsPanel extends JPanel{
	
	//create text field for temporary hit points
	JTextField temporaryHitPoints = new JTextField(10);
	
	TitledBorder temporaryHitPointsBorder = new TitledBorder("Temporary Hit Points");
	
	public TemporaryHitPointsPanel() {
		//add text field to panel
		this.add(temporaryHitPoints);
		this.setBorder(temporaryHitPointsBorder);
		
		//set tool tip text
		temporaryHitPoints.setToolTipText("Enter Temporary Hit Points here");
	}
}
