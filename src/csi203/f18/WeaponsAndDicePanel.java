package csi203.f18;

import javax.swing.*;
import java.awt.*;
public class WeaponsAndDicePanel extends JPanel{

	//create an instance of WeaponsPanel, DicePanel, ColorChangePanel, and two buttons for file saving and download buttons
	WeaponsPanel weapons = new WeaponsPanel();
	DicePanel dice = new DicePanel();
	ColorChangePanel colorChange = new ColorChangePanel();
	JButton jbtFileSave = new JButton("Save As File");
	JButton jbtFileDownload = new JButton("Download .dnd File");
	
	public WeaponsAndDicePanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//add components to panel
		this.add(weapons);
		this.add(dice);
		this.add(colorChange);
		this.add(jbtFileSave);
		this.add(jbtFileDownload);
		
		//set tool tip texts
		jbtFileSave.setToolTipText("Save character sheet to a new .dnd file");
		jbtFileDownload.setToolTipText("Load a .dnd file and display the character sheet");
	}
	
}
