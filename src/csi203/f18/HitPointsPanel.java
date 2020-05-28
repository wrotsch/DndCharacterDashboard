package csi203.f18;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class HitPointsPanel extends JPanel{

	//Create Text area for Current hit points, and instances of HitPointMaximumPanel and TemporaryHitPointsPanel
	JTextArea currentHitPoints = new JTextArea();
	HitPointMaximumPanel hitPointMaximum = new HitPointMaximumPanel();
	TemporaryHitPointsPanel temporaryHitPoints = new TemporaryHitPointsPanel();
	
	TitledBorder hitPointsBorder = new TitledBorder("Hit Points");                                      
	
	public HitPointsPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//add components to panel
		this.add(hitPointMaximum);
		this.add(currentHitPoints);
		this.add(temporaryHitPoints);
		this.setBorder(hitPointsBorder);
	}
}
