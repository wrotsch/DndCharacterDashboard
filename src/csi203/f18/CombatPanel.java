package csi203.f18;

import java.awt.*;
import javax.swing.*;
public class CombatPanel extends JPanel{

	//create instances of CombatTopStatsPanel, HitPointsPanel, and CombatBottomPanel
	CombatTopStatsPanel topstats = new CombatTopStatsPanel();
	HitPointsPanel hitpoints = new HitPointsPanel();
	CombatBottomPanel bottom = new CombatBottomPanel();
	
	public CombatPanel(){
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		//add components to panel
		this.add(topstats);
		this.add(hitpoints);
		this.add(bottom);
	}
}
