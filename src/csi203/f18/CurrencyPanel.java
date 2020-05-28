package csi203.f18;

import java.awt.*;
import javax.swing.*;

public class CurrencyPanel extends JPanel{

	//Create labels for currency counters
	JLabel copper = new JLabel("Copper Pieces");
	JLabel silver = new JLabel("Silver Pieces");
	JLabel electrum = new JLabel("Electrum Pieces");
	JLabel gold = new JLabel("Gold Pieces");
	JLabel platinum = new JLabel("Platinum Pieces");
	
	//Create text areas for currency counters
	JTextField copperText = new JTextField();
	JTextField silverText= new JTextField();
	JTextField electrumText = new JTextField();
	JTextField goldText = new JTextField();
	JTextField platinumText = new JTextField();
	
	
	public CurrencyPanel() {
		
		this.setLayout(new GridLayout(5,2));
		//add components to panel
		this.add(copper);
		this.add(copperText);
		this.add(silver);
		this.add(silverText);
		this.add(electrum);
		this.add(electrumText);
		this.add(gold);
		this.add(goldText);
		this.add(platinum);
		this.add(platinumText);
		
		//set tool tip texts
		copperText.setToolTipText("Enter the amount of Copper pieces in your inventory");
		silverText.setToolTipText("Enter the amount of Silver pieces in your inventory");
		electrumText.setToolTipText("Enter the amount of Electrum pieces in your inventory");
		goldText.setToolTipText("Enter the amount of Gold pieces in your inventory");
		platinumText.setToolTipText("Enter the amount of Platinum pieces in your inventory");
	}
}
