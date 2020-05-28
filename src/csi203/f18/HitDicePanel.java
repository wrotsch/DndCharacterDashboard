package csi203.f18;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.*;

public class HitDicePanel extends JPanel{

	//Create Labels for Total hit dice and hit dice type
	JLabel totalHitDiceLabel = new JLabel("Total");
	JLabel dice = new JLabel("Dice Type");
	
	//Create text fields for both 
	JTextField totalHitDiceText = new JTextField(10);
	JTextField diceType = new JTextField(2);
	
	//Buttons for hit dice roll
	JButton jbtHitDiceRoll = new JButton("Roll Hit Dice");
	
	//blank panel for formatting
	JPanel blank = new JPanel();
	
	TitledBorder hitDiceBorder = new TitledBorder("Hit Dice");
	
	public HitDicePanel() {
		this.setLayout(new GridLayout(3,2));
		//add components to panel
		this.add(totalHitDiceLabel);
		this.add(totalHitDiceText);
		this.add(dice);
		this.add(diceType);
		this.setBorder(hitDiceBorder);
		this.add(blank);
		this.add(jbtHitDiceRoll);
		
		//Set tool tip texts
		totalHitDiceText.setToolTipText("Enter Hit Dice Type here (ex. d10");
		diceType.setToolTipText("Enter Number of Hit Dice here (ex. 2)");
		jbtHitDiceRoll.setToolTipText("Roll Hit Dice");
		
	}
}
