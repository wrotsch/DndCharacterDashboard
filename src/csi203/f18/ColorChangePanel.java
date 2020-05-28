package csi203.f18;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ColorChangePanel extends JPanel{
	
	//declare all RadioButtons and Labels
	JLabel backgroundColorText = new JLabel("Background Color");
	JLabel foregroundColorText = new JLabel("Foreground Color");
	JRadioButton blackBackgroundButton = new JRadioButton("Black");
	JRadioButton blackForegroundButton = new JRadioButton("Black");
	JRadioButton blueBackgroundButton = new JRadioButton("Blue");
	JRadioButton blueForegroundButton = new JRadioButton("Blue");
	JRadioButton grayBackgroundButton = new JRadioButton("Gray");
	JRadioButton grayForegroundButton = new JRadioButton("Gray");
	JRadioButton redBackgroundButton = new JRadioButton("Red");
	JRadioButton redForegroundButton = new JRadioButton("Red");
	JRadioButton whiteBackgroundButton = new JRadioButton("White");
	JRadioButton whiteForegroundButton = new JRadioButton("White");
	JRadioButton yellowBackgroundButton = new JRadioButton("Yellow");
	JRadioButton yellowForegroundButton = new JRadioButton("Yellow");
	
	TitledBorder dashboardColorsBorder = new TitledBorder("Set Dashboard Colors");
	
	public ColorChangePanel() {
		//Group background color buttons 
		ButtonGroup backgroundButtons = new ButtonGroup();
		backgroundButtons.add(blackBackgroundButton);
		backgroundButtons.add(blueBackgroundButton);
		backgroundButtons.add(grayBackgroundButton);
		backgroundButtons.add(redBackgroundButton);
		backgroundButtons.add(whiteBackgroundButton);
		backgroundButtons.add(yellowBackgroundButton);
		//Group foreground color buttons 
		ButtonGroup foregroundButtons = new ButtonGroup();
		foregroundButtons.add(blackForegroundButton);
		foregroundButtons.add(blueForegroundButton);
		foregroundButtons.add(grayForegroundButton);
		foregroundButtons.add(redForegroundButton);
		foregroundButtons.add(whiteForegroundButton);
		foregroundButtons.add(yellowForegroundButton);
		
		this.setLayout(new GridLayout(0,2));
		//add buttons to panel in Grid Layout
		this.add(backgroundColorText);
		this.add(foregroundColorText);
		this.add(blackBackgroundButton);
		this.add(blackForegroundButton);
		this.add(blueBackgroundButton);
		this.add(blueForegroundButton);
		this.add(grayBackgroundButton);
		this.add(grayForegroundButton);
		this.add(redBackgroundButton);
		this.add(redForegroundButton);
		this.add(whiteBackgroundButton);
		this.add(whiteForegroundButton);
		this.add(yellowBackgroundButton);
		this.add(yellowForegroundButton);
		
		this.setBorder(dashboardColorsBorder);
		
		//Set Tool Tip Texts for Buttons
		blackBackgroundButton.setToolTipText("Set Background Color to Black");
		blackForegroundButton.setToolTipText("Set Foreground Color to Black");
		blueBackgroundButton.setToolTipText("Set Background Color to Blue");
		blueForegroundButton.setToolTipText("Set Foreground Color to Blue");
		grayBackgroundButton.setToolTipText("Set Background Color to Gray");
		grayForegroundButton.setToolTipText("Set Foreground Color to Gray");
		redBackgroundButton.setToolTipText("Set Background Color to Red");
		redForegroundButton.setToolTipText("Set Background Color to Red");
		whiteBackgroundButton.setToolTipText("Set Background Color to White");
		whiteForegroundButton.setToolTipText("Set Foreground Color to White");
		yellowBackgroundButton.setToolTipText("Set Background Color to Yellow");
		yellowForegroundButton.setToolTipText("Set Foreground Color to Yellow");
		
	}

}
