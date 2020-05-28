package csi203.f18;

import java.awt.*;
import javax.swing.*;
import java.net.*;

public class BottomPanel extends JPanel {
	
	//create instances of ProficienciesPanel and Equipment Panel
	ProficienciesPanel proficiencies = new ProficienciesPanel();
	EquipmentPanel equipment = new EquipmentPanel();
	
	public BottomPanel() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		//add ProficienciesPanel and EquipmentPanel to panel
		this.add(proficiencies);
		this.add(equipment);
		
	}
}
