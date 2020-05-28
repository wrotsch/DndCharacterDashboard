package csi203.f18;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.util.Random;
import javax.swing.JOptionPane;

public class DicePanel extends JPanel{
	
	//create dice roll buttons
	JButton jbtD20 = new JButton("Roll d20");
	JButton jbtD12 = new JButton("Roll d12");
	JButton jbtD10 = new JButton("Roll d10");
	JButton jbtD8 = new JButton("Roll d8");
	JButton jbtD6 = new JButton("Roll d6");
	JButton jbtD4 = new JButton("Roll d4");
	
	Random rand = new Random();
	
	TitledBorder diceBorder = new TitledBorder("Dice Roll");
	
	public DicePanel() {
		
		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		//add buttons to panel
		this.add(jbtD4);
		this.add(jbtD6);
		this.add(jbtD8);
		this.add(jbtD10);
		this.add(jbtD12);
		this.add(jbtD20);
		this.setBorder(diceBorder);
		
		//set Tool tip texts
		jbtD4.setToolTipText("Roll a four-sided die");
		jbtD6.setToolTipText("Roll a six-sided die");
		jbtD8.setToolTipText("Roll a eight-sided die");
		jbtD10.setToolTipText("Roll a ten-sided die");
		jbtD12.setToolTipText("Roll a twelve-sided die");
		jbtD20.setToolTipText("Roll a twenty-sided die");
	
		//action listener for d20 dice roll 
		jbtD20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String randNum = Integer.toString(rand.nextInt(20) + 1);//randomly select a number from 1-20
				JOptionPane.showMessageDialog(null, "Your d20 roll: " + randNum); //display number to user
			}
		});
		
		//action listener for d12 dice roll
		jbtD12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String randNum = Integer.toString(rand.nextInt(12) + 1);//randomly select a number from 1-12
				JOptionPane.showMessageDialog(null, "Your d12 roll: " + randNum);//display number to user
			}
		});
		
		//action listener for d10 roll
		jbtD10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String randNum = Integer.toString(rand.nextInt(10) + 1);//randomly select a number from 1-10
				JOptionPane.showMessageDialog(null, "Your d10 roll: " + randNum);//display number to user
			}
		});
		
		//action listener for d8 roll
		jbtD8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String randNum = Integer.toString(rand.nextInt(8) + 1);//randomly select a number from 1-8
				JOptionPane.showMessageDialog(null, "Your d8 roll: " + randNum);//display number to user
			}
		});
		
		//action listener for d6 roll
		jbtD6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String randNum = Integer.toString(rand.nextInt(6) + 1);//randomly select a number from 1-6
				JOptionPane.showMessageDialog(null, "Your d6 roll: " + randNum);//display number to user
			}
		});
		
		//action listener for d4 roll
		jbtD4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String randNum = Integer.toString(rand.nextInt(4) + 1);//randomly select a number from 1-4
				JOptionPane.showMessageDialog(null, "Your d4 roll: " + randNum);//display number to user
			}
		});
	}
}
