package csi203.f18;

import java.awt.*;
import javax.swing.*;

public class WeaponsPanel extends JPanel{

	//create an instance of WeaponSlotsPanel
	WeaponSlotsPanel weapons = new WeaponSlotsPanel();
	
	public WeaponsPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//add component to panel
		this.add(weapons);
	}
	
}
