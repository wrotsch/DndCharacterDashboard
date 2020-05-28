package csi203.f18;

import java.awt.*;
import javax.swing.*;

public class StatsPanelRight extends JPanel{
	
	//create instances of SkillsPanel and SavingThrowModPanel
	SkillsPanel skills = new SkillsPanel();
	SavingThrowsModPanel savingThrows = new SavingThrowsModPanel();
	
	public StatsPanelRight() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		//add SkillsPanel and SavingThrowsModPanel to panel
		this.add(savingThrows);
		this.add(skills);
	}
}
