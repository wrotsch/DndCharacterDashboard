package csi203.f18;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class EquipmentPanel extends JPanel {

	//Create ArmorPanel, CurrencyPanel, and Text area for equipment
	ArmorPanel armor = new ArmorPanel();
	CurrencyPanel currency = new CurrencyPanel();
	JTextArea equipment = new JTextArea(7,15);
	
	TitledBorder equipmentBorder = new TitledBorder("Equipment");
	
	public EquipmentPanel() {
		this.setLayout(new BorderLayout());
		//add components to panel
		this.add(armor, BorderLayout.NORTH);
		this.add(currency, BorderLayout.WEST);
		this.add(equipment, BorderLayout.EAST);
		this.setBorder(equipmentBorder);
		
		//set tool tip text
		equipment.setToolTipText("Enter the items in your inventory here");
	}
}
