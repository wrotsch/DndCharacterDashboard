package csi203.f18;

import java.awt.FlowLayout;

import javax.swing.*;

public class CombatTopStatsPanel extends JPanel{

	//Create instances of ArmorClassPanel, InitiativePanel, and SpeedPanel
	ArmorClassPanel armorClass = new ArmorClassPanel();
	InitiativePanel initiative = new InitiativePanel();
	SpeedPanel speed = new SpeedPanel();
	
	public CombatTopStatsPanel() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		//add components to panel
		this.add(armorClass);
		this.add(initiative);
		this.add(speed);
	}
}
