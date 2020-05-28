package csi203.f18;

import javax.swing.*;

public class CombatBottomPanel extends JPanel{

	//Create instances of HitDicePanel and DeathSavesPanel 
	HitDicePanel hitDice = new HitDicePanel();
	DeathSavesPanel deathSaves = new DeathSavesPanel();
	
	public CombatBottomPanel() {
		//add components to panel
		this.add(hitDice);
		this.add(deathSaves);
	}
}
