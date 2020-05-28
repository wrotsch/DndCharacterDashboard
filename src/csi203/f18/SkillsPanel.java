package csi203.f18;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

public class SkillsPanel extends JPanel{
	
	//create proficiency buttons
	JToggleButton acrobaticsButton = new JRadioButton();
	JToggleButton animalHandlingButton = new JRadioButton();
	JToggleButton arcanaButton = new JRadioButton();
	JToggleButton athleticsButton = new JRadioButton();
	JToggleButton deceptionButton = new JRadioButton();
	JToggleButton historyButton = new JRadioButton();
	JToggleButton insightButton = new JRadioButton();
	JToggleButton investigationButton = new JRadioButton();
	JToggleButton intimidationButton = new JRadioButton();
	JToggleButton medicineButton = new JRadioButton();
	JToggleButton natureButton = new JRadioButton();
	JToggleButton perceptionButton = new JRadioButton();
	JToggleButton performanceButton = new JRadioButton();
	JToggleButton persuasionButton = new JRadioButton();
	JToggleButton religionButton = new JRadioButton();
	JToggleButton sleightOfHandButton = new JRadioButton();
	JToggleButton stealthButton = new JRadioButton();
	JToggleButton survivalButton = new JRadioButton();
	
	//create skill JTextAreas 
	JTextArea acrobaticsText = new JTextArea();
	JTextArea animalHandlingText = new JTextArea();
	JTextArea arcanaText = new JTextArea();
	JTextArea athleticsText = new JTextArea();
	JTextArea deceptionText = new JTextArea();
	JTextArea historyText = new JTextArea();
	JTextArea insightText = new JTextArea();
	JTextArea investigationText = new JTextArea();
	JTextArea intimidationText = new JTextArea();
	JTextArea medicineText = new JTextArea();
	JTextArea natureText = new JTextArea();
	JTextArea perceptionText = new JTextArea();
	JTextArea performanceText = new JTextArea();
	JTextArea persuasionText = new JTextArea();
	JTextArea religionText = new JTextArea();
	JTextArea sleightOfHandText = new JTextArea();
	JTextArea stealthText = new JTextArea();
	JTextArea survivalText = new JTextArea();

	//create skill Labels
	JLabel acrobaticsLabel = new JLabel("Acrobatics (Dex)");
	JLabel animalHandlingLabel = new JLabel("Animal Handling (Wis)");
	JLabel arcanaLabel = new JLabel("Arcana (Int)");
	JLabel athleticsLabel = new JLabel("Athletics (Str)");
	JLabel deceptionLabel = new JLabel("Deception (Cha)");
	JLabel historyLabel = new JLabel("History (Int)");
	JLabel insightLabel = new JLabel("Insight (Wis)");
	JLabel intimidationLabel = new JLabel("Intimidation (Cha)");
	JLabel investigationLabel = new JLabel("Investigation (Int)");
	JLabel medicineLabel = new JLabel("Medicine (Wis)");
	JLabel natureLabel = new JLabel("Nature (Int)");
	JLabel perceptionLabel = new JLabel("Perception (Wis)");
	JLabel performanceLabel = new JLabel("Performance (Cha)");
	JLabel persuasionLabel = new JLabel("Persuasion (Cha)");
	JLabel religionLabel = new JLabel("Religion (Int)");
	JLabel sleightOfHandLabel = new JLabel("Sleight of Hand (Dex)");
	JLabel stealthLabel = new JLabel("Stealth (Dex)");
	JLabel survivalLabel = new JLabel("Survival (Int)");
	
	TitledBorder skillsBorder = new TitledBorder("Skills");
	
	public SkillsPanel() {
		this.setLayout(new GridLayout(18, 3));
		//add all components to panel
		this.add(acrobaticsButton);
		this.add(acrobaticsLabel);
		this.add(acrobaticsText);
		this.add(animalHandlingButton);
		this.add(animalHandlingLabel);
		this.add(animalHandlingText);
		this.add(arcanaButton);
		this.add(arcanaLabel);
		this.add(arcanaText);
		this.add(athleticsButton);
		this.add(athleticsLabel);
		this.add(athleticsText);
		this.add(deceptionButton);
		this.add(deceptionLabel);
		this.add(deceptionText);
		this.add(historyButton);
		this.add(historyLabel);
		this.add(historyText);
		this.add(insightButton);
		this.add(insightLabel);
		this.add(insightText);
		this.add(intimidationButton);
		this.add(intimidationLabel);
		this.add(intimidationText);
		this.add(investigationButton);
		this.add(investigationLabel);
		this.add(investigationText);
		this.add(medicineButton);
		this.add(medicineLabel);
		this.add(medicineText);
		this.add(natureButton);
		this.add(natureLabel);
		this.add(natureText);
		this.add(perceptionButton);
		this.add(perceptionLabel);
		this.add(perceptionText);
		this.add(performanceButton);
		this.add(performanceLabel);
		this.add(performanceText);
		this.add(persuasionButton);
		this.add(persuasionLabel);
		this.add(persuasionText);
		this.add(religionButton);
		this.add(religionLabel);
		this.add(religionText);
		this.add(sleightOfHandButton);
		this.add(sleightOfHandLabel);
		this.add(sleightOfHandText);
		this.add(stealthButton);
		this.add(stealthLabel);
		this.add(stealthText);
		this.add(survivalButton);
		this.add(survivalLabel);
		this.add(survivalText);
		
		//set Tool Tip Texts for all components
		acrobaticsButton.setToolTipText("Set Acrobatics Proficiency");
		acrobaticsText.setToolTipText("Acrobatics Modifier (Calculated from Dexterity stat");
		animalHandlingButton.setToolTipText("Set Animal Handling Proficiency");
		animalHandlingText.setToolTipText("Animal Handling Modifier (Calculated from Wisdom stat");
		arcanaButton.setToolTipText("Set Arcana Proficiency");
		arcanaText.setToolTipText("Arcana Modifier (Calculated from Intelligence stat)");
		athleticsButton.setToolTipText("Set Athletics Proficiency");
		athleticsText.setToolTipText("Athletics Modifier (Calculated from Strength stat)");
		deceptionButton.setToolTipText("Set Deception Proficiency");
		deceptionText.setToolTipText("Deception Modifier (Calculated from Charisma stat)");
		historyButton.setToolTipText("Set History Proficiency");
		historyText.setToolTipText("History Modifier (Calculated from Intelligence stat)");
		insightButton.setToolTipText("Set Insight Proficiency");
		insightText.setToolTipText("Insight Modifier (Calculated from Wisdom stat)");
		intimidationButton.setToolTipText("Set Intimidation Proficiency");
		intimidationText.setToolTipText("Intimidation Modifier (Calculated from Charisma stat)");
		investigationButton.setToolTipText("Set Investigation Proficiency");
		investigationText.setToolTipText("Investigation Modifier (Calculated from Intelligence stat)");
		medicineButton.setToolTipText("Set Medicine Proficiency");
		medicineText.setToolTipText("Medicine Modifier (Calculated from Wisdom stat)");
		natureButton.setToolTipText("Set Nature Proficiency");
		natureText.setToolTipText("Nature Modifier (Calculated from Intelligence stat)");
		perceptionButton.setToolTipText("Set Perception Proficiency");
		perceptionText.setToolTipText("Perception Modifier (Calculated from Wisdom stat)");
		performanceButton.setToolTipText("Set Performance Proficiency");
		performanceText.setToolTipText("Performance Modifier (Calculated from Charisma)");
		persuasionButton.setToolTipText("Set Persuasion Proficiency");
		persuasionText.setToolTipText("Persuasion Modifier (Calculated from Persuastion)");
		religionButton.setToolTipText("Set Religion Proficiency");
		religionText.setToolTipText("Religion Modifier (Calculated from Intelligenece stat)");
		sleightOfHandButton.setToolTipText("Set Sleight of Hand Proficiency");
		sleightOfHandText.setToolTipText("Sleight of Hand Modifier (calculated from Dexterity stat)");
		stealthButton.setToolTipText("Set Stealth Proficiency");
		stealthText.setToolTipText("Stealth Modifier (Calculated from Dexterity stat)");
		survivalButton.setToolTipText("Set Survival Proficiency");
		survivalText.setToolTipText("Survival Modifier (Calculated from Wisdom stat)");
		
		this.setBorder(skillsBorder);
	}
	
}
